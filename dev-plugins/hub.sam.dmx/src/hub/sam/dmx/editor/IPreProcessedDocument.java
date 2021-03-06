package hub.sam.dmx.editor;

import hub.sam.dbl.Model;

import java.util.Collection;

import org.eclipse.core.runtime.IPath;

public interface IPreProcessedDocument {
	IPath getPath();
	Collection<IModelContainer> getImportsModels();
	Model getModel();
}
