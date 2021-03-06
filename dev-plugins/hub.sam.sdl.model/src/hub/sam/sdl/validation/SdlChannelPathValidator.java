/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.sdl.validation;

import hub.sam.sdl.SdlChannel;
import hub.sam.sdl.SdlChannelEnd;
import hub.sam.sdl.SdlSignal;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link hub.sam.sdl.SdlChannelPath}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SdlChannelPathValidator {
	boolean validate();

	boolean validateSource(SdlChannelEnd value);
	boolean validateTarget(SdlChannelEnd value);
	boolean validateSignal(EList<SdlSignal> value);
	boolean validateRelatedElement(EList<SdlChannelEnd> value);
	boolean validateChannel(SdlChannel value);
}
