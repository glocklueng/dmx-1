/**
 *
 * $Id$
 */
package hub.sam.dbl.validation;

import hub.sam.dbl.CallPart;
import hub.sam.dbl.Expression;
import hub.sam.dbl.IdExpr;
import hub.sam.dbl.NamedElement;
import hub.sam.dbl.PredefinedId;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link hub.sam.dbl.IdExpr}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IdExprValidator {
	boolean validate();

	boolean validateParentIdExpr(IdExpr value);
	boolean validateReferencedElement(NamedElement value);
	boolean validatePredefinedId(PredefinedId value);
	boolean validateArrayIndex(EList<Expression> value);
	boolean validateCallPart(CallPart value);
}