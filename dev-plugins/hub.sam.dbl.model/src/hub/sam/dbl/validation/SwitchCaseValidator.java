/**
 *
 * $Id$
 */
package hub.sam.dbl.validation;

import hub.sam.dbl.Expression;
import hub.sam.dbl.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link hub.sam.dbl.SwitchCase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SwitchCaseValidator {
	boolean validate();

	boolean validateValue(Expression value);
	boolean validateBody(EList<Statement> value);
}
