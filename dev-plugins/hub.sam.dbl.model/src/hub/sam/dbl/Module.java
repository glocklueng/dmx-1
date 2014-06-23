/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.dbl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hub.sam.dbl.Module#getClassifiers <em>Classifiers</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getClassAugments <em>Class Augments</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getExtensionDefs <em>Extension Defs</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getAnnotationDefs <em>Annotation Defs</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getVariables <em>Variables</em>}</li>
 *   <li>{@link hub.sam.dbl.Module#getIdRes <em>Id Res</em>}</li>
 * </ul>
 * </p>
 *
 * @see hub.sam.dbl.DblPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement, EmbeddableExtensionsContainer {
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_Classifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifiers();

	/**
	 * Returns the value of the '<em><b>Class Augments</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.ClassAugment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Augments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Augments</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_ClassAugments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassAugment> getClassAugments();

	/**
	 * Returns the value of the '<em><b>Extension Defs</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.ExtensionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Defs</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_ExtensionDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionDefinition> getExtensionDefs();

	/**
	 * Returns the value of the '<em><b>Annotation Defs</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Defs</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_AnnotationDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotationDefs();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.Procedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getModule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Id Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Res</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Res</em>' containment reference.
	 * @see #setIdRes(IdResolution)
	 * @see hub.sam.dbl.DblPackage#getModule_IdRes()
	 * @model containment="true"
	 * @generated
	 */
	IdResolution getIdRes();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.Module#getIdRes <em>Id Res</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Res</em>' containment reference.
	 * @see #getIdRes()
	 * @generated
	 */
	void setIdRes(IdResolution value);

} // Module
