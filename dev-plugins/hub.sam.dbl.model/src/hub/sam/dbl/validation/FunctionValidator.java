/**
 *
 * $Id$
 */
package hub.sam.dbl.validation;

import hub.sam.dbl.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link hub.sam.dbl.Function}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionValidator {
	boolean validate();

	boolean validateParameters(EList<Parameter> value);
	boolean validateClass(boolean value);
	boolean validateAbstract(boolean value);
}
