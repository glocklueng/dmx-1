/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.dbl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hub.sam.dbl.Pattern#isTop <em>Top</em>}</li>
 *   <li>{@link hub.sam.dbl.Pattern#getContext <em>Context</em>}</li>
 *   <li>{@link hub.sam.dbl.Pattern#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see hub.sam.dbl.DblPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' attribute.
	 * @see #setTop(boolean)
	 * @see hub.sam.dbl.DblPackage#getPattern_Top()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isTop();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.Pattern#isTop <em>Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' attribute.
	 * @see #isTop()
	 * @generated
	 */
	void setTop(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Parameter)
	 * @see hub.sam.dbl.DblPackage#getPattern_Context()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Parameter getContext();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.Pattern#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Parameter value);

	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' containment reference.
	 * @see #setCodeBlock(CodeBlock)
	 * @see hub.sam.dbl.DblPackage#getPattern_CodeBlock()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link hub.sam.dbl.Pattern#getCodeBlock <em>Code Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' containment reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

} // Pattern
