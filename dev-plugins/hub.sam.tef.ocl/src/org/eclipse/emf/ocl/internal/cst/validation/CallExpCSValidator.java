/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.ocl.internal.cst.validation;

import org.eclipse.emf.ocl.internal.cst.DotOrArrowEnum;
import org.eclipse.emf.ocl.internal.cst.OCLExpressionCS;
import org.eclipse.emf.ocl.internal.cst.SimpleNameCS;

/**
 * A sample validator interface for {@link org.eclipse.emf.ocl.internal.cst.CallExpCS}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CallExpCSValidator {
	boolean validate();

	boolean validateSource(OCLExpressionCS value);
	boolean validateAccessor(DotOrArrowEnum value);
	boolean validateSimpleNameCS(SimpleNameCS value);
}
