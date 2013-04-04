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
 * A representation of the model object '<em><b>Extension Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hub.sam.dbl.ExtensionDefinition#getAbstractSyntaxDef <em>Abstract Syntax Def</em>}</li>
 *   <li>{@link hub.sam.dbl.ExtensionDefinition#getTextualSyntaxDef <em>Textual Syntax Def</em>}</li>
 *   <li>{@link hub.sam.dbl.ExtensionDefinition#getMappingDef <em>Mapping Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see hub.sam.dbl.DblPackage#getExtensionDefinition()
 * @model
 * @generated
 */
public interface ExtensionDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract Syntax Def</b></em>' containment reference list.
	 * The list contents are of type {@link hub.sam.dbl.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Syntax Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Syntax Def</em>' containment reference list.
	 * @see hub.sam.dbl.DblPackage#getExtensionDefinition_AbstractSyntaxDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getAbstractSyntaxDef();

	/**
	 * Returns the value of the '<em><b>Textual Syntax Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Syntax Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Syntax Def</em>' containment reference.
	 * @see #setTextualSyntaxDef(TextualSyntaxDef)
	 * @see hub.sam.dbl.DblPackage#getExtensionDefinition_TextualSyntaxDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextualSyntaxDef getTextualSyntaxDef();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.ExtensionDefinition#getTextualSyntaxDef <em>Textual Syntax Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textual Syntax Def</em>' containment reference.
	 * @see #getTextualSyntaxDef()
	 * @generated
	 */
	void setTextualSyntaxDef(TextualSyntaxDef value);

	/**
	 * Returns the value of the '<em><b>Mapping Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Def</em>' containment reference.
	 * @see #setMappingDef(Mapping)
	 * @see hub.sam.dbl.DblPackage#getExtensionDefinition_MappingDef()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMappingDef();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.ExtensionDefinition#getMappingDef <em>Mapping Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Def</em>' containment reference.
	 * @see #getMappingDef()
	 * @generated
	 */
	void setMappingDef(Mapping value);

} // ExtensionDefinition
