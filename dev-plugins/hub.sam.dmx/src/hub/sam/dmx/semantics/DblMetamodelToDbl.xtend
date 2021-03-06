package hub.sam.dmx.semantics

import hub.sam.dbl.DblPackage
import org.eclipse.core.runtime.IPath

class DblMetamodelToDbl extends EcoreToDblGenerator {
	
	new(IPath outputFolder) {
		super(outputFolder)
	}
	
	override startGenerator() {
		makeFolder("resources-gen")
		startGenerator("resources-gen/dbl.dbl", DblPackage.eINSTANCE, "hub.sam.dbl", #["ecore"])			
	}
	
	def static void main(String[] args) {
		(new DblMetamodelToDbl(null)).startGenerator
	}
	
	override String escapeName(String name) {
		if (name.equals("priority") || name.equals("type")) {
			name + "_"
		}
		else {
			name
		}
	}
	
	
}