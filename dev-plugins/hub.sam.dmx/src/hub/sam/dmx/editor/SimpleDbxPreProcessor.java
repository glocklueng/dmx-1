package hub.sam.dmx.editor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;

import hub.sam.dbl.Model;
import hub.sam.dmx.editor.semantics.IExtensionApplier;

public class SimpleDbxPreProcessor extends SimpleDblPreProcessor {

	private IExtensionApplier extensionDefinitionApplier;
	
	public SimpleDbxPreProcessor(IExtensionApplier extensionDefinitionApplier) {
		this.extensionDefinitionApplier = extensionDefinitionApplier;
	}
	
	private Collection<String> processedFileImports = new HashSet<String>();

	protected Resource processExtensionDefinitionsOutsideToInside_for_import(String fileToImport, IPath inputPath) {
		// load text from file
		IPath dblImport = inputPath.append(fileToImport).addFileExtension("dbl");
		IPath dbxImport = inputPath.append(fileToImport).addFileExtension("dbx");
		IPath importInputPath = dblImport.removeLastSegments(1);
				
		File file = new File(dblImport.toOSString());
		if (!file.exists()) {
			file = new File(dbxImport.toOSString());
		}
		
		if (file.exists()) {
			processExtensionDefinitionsOutsideToInside(getImportLinesInContent(file), importInputPath);
			Resource resourceForImport = loadXmi(fileToImport, inputPath);
			return resourceForImport;
		}
		
		return null;
	}

	protected boolean processExtensionDefinitionsOutsideToInside(String inputText, IPath inputPath) {
		Pattern importRegex = Pattern.compile("^#import \"(.+)\"", Pattern.MULTILINE);
		Matcher matcher = importRegex.matcher(inputText);
		boolean added = false;
		
		while (matcher.find()) {
			final String fileToImport = matcher.group(1);

			if (!processedFileImports.contains(fileToImport)) {
				processedFileImports.add(fileToImport);
				Resource resourceForImport = processExtensionDefinitionsOutsideToInside_for_import(fileToImport, inputPath);
				
				// add extension definitions contained in import -> requires ecore model
				if (resourceForImport != null) {
					added |= extensionDefinitionApplier.addExtensions((Model) resourceForImport.getContents().get(0));
				}
			}
		}
		
		return added;
	}
	
	private String getImportLinesInContent(File importFile) {
		FileReader fileReader;
		try {
			fileReader = new FileReader(importFile);
			BufferedReader br = new BufferedReader(fileReader);
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null && (!line.isEmpty() || line.startsWith("#import") )) {
		            sb.append(line);
		            sb.append(System.getProperty("line.separator"));
		            line = br.readLine();
		        }
		        return sb.toString();
		    }
		    catch (IOException e) {
				e.printStackTrace();
			}
		    finally {
		        try {
					br.close();
				}
		        catch (IOException e) {
					e.printStackTrace();
				}
		    }
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void preProcess(String inputText, IPath inputPath) {
		if (inputText != null) {
			// 1. build a pre-model of the full import tree (without importing)
			//    and add extension definitions from outside to inside (i.e. beginning at the leaves of the import tree)
			processedFileImports.clear();
			boolean extensionDefinitionsAdded = processExtensionDefinitionsOutsideToInside(inputText, inputPath);
			if (extensionDefinitionsAdded) {
				extensionDefinitionApplier.syntaxChanged();
			}
			
			// 2. process direct imports, i.e. call importFile(..) and listen for model changes
			// TODO can be optimized
			super.preProcess(inputText, inputPath);
		}
	}

	@Override
	protected void importedModelChanged(Model model) {
		extensionDefinitionApplier.unwindExtensionEffects(model);
		extensionDefinitionApplier.syntaxChanged();
		
		super.importedModelChanged(model);
	}

}
