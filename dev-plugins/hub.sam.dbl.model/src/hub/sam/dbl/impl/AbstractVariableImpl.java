/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.dbl.impl;

import hub.sam.dbl.AbstractVariable;
import hub.sam.dbl.DblPackage;
import hub.sam.dbl.IdExpr;
import hub.sam.dbl.ListDimension;
import hub.sam.dbl.PrimitiveType;
import hub.sam.dbl.TypedElement;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hub.sam.dbl.impl.AbstractVariableImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.AbstractVariableImpl#isIsList <em>Is List</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.AbstractVariableImpl#getListDims <em>List Dims</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.AbstractVariableImpl#getClassifierTypeExpr <em>Classifier Type Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractVariableImpl extends NamedElementImpl implements AbstractVariable {
	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType primitiveType;

	/**
	 * The default value of the '{@link #isIsList() <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsList() <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsList()
	 * @generated
	 * @ordered
	 */
	protected boolean isList = IS_LIST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListDims() <em>List Dims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListDims()
	 * @generated
	 * @ordered
	 */
	protected EList<ListDimension> listDims;

	/**
	 * The cached value of the '{@link #getClassifierTypeExpr() <em>Classifier Type Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierTypeExpr()
	 * @generated
	 * @ordered
	 */
	protected IdExpr classifierTypeExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblPackage.Literals.ABSTRACT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveType(PrimitiveType newPrimitiveType, NotificationChain msgs) {
		PrimitiveType oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE, oldPrimitiveType, newPrimitiveType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(PrimitiveType newPrimitiveType) {
		if (newPrimitiveType != primitiveType) {
			NotificationChain msgs = null;
			if (primitiveType != null)
				msgs = ((InternalEObject)primitiveType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE, null, msgs);
			if (newPrimitiveType != null)
				msgs = ((InternalEObject)newPrimitiveType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE, null, msgs);
			msgs = basicSetPrimitiveType(newPrimitiveType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE, newPrimitiveType, newPrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsList() {
		return isList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsList(boolean newIsList) {
		boolean oldIsList = isList;
		isList = newIsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblPackage.ABSTRACT_VARIABLE__IS_LIST, oldIsList, isList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListDimension> getListDims() {
		if (listDims == null) {
			listDims = new EObjectContainmentEList<ListDimension>(ListDimension.class, this, DblPackage.ABSTRACT_VARIABLE__LIST_DIMS);
		}
		return listDims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdExpr getClassifierTypeExpr() {
		return classifierTypeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifierTypeExpr(IdExpr newClassifierTypeExpr, NotificationChain msgs) {
		IdExpr oldClassifierTypeExpr = classifierTypeExpr;
		classifierTypeExpr = newClassifierTypeExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR, oldClassifierTypeExpr, newClassifierTypeExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierTypeExpr(IdExpr newClassifierTypeExpr) {
		if (newClassifierTypeExpr != classifierTypeExpr) {
			NotificationChain msgs = null;
			if (classifierTypeExpr != null)
				msgs = ((InternalEObject)classifierTypeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR, null, msgs);
			if (newClassifierTypeExpr != null)
				msgs = ((InternalEObject)newClassifierTypeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR, null, msgs);
			msgs = basicSetClassifierTypeExpr(newClassifierTypeExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR, newClassifierTypeExpr, newClassifierTypeExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE:
				return basicSetPrimitiveType(null, msgs);
			case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS:
				return ((InternalEList<?>)getListDims()).basicRemove(otherEnd, msgs);
			case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR:
				return basicSetClassifierTypeExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE:
				return getPrimitiveType();
			case DblPackage.ABSTRACT_VARIABLE__IS_LIST:
				return isIsList();
			case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS:
				return getListDims();
			case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR:
				return getClassifierTypeExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
				return;
			case DblPackage.ABSTRACT_VARIABLE__IS_LIST:
				setIsList((Boolean)newValue);
				return;
			case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS:
				getListDims().clear();
				getListDims().addAll((Collection<? extends ListDimension>)newValue);
				return;
			case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR:
				setClassifierTypeExpr((IdExpr)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)null);
				return;
			case DblPackage.ABSTRACT_VARIABLE__IS_LIST:
				setIsList(IS_LIST_EDEFAULT);
				return;
			case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS:
				getListDims().clear();
				return;
			case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR:
				setClassifierTypeExpr((IdExpr)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE:
				return primitiveType != null;
			case DblPackage.ABSTRACT_VARIABLE__IS_LIST:
				return isList != IS_LIST_EDEFAULT;
			case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS:
				return listDims != null && !listDims.isEmpty();
			case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR:
				return classifierTypeExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE: return DblPackage.TYPED_ELEMENT__PRIMITIVE_TYPE;
				case DblPackage.ABSTRACT_VARIABLE__IS_LIST: return DblPackage.TYPED_ELEMENT__IS_LIST;
				case DblPackage.ABSTRACT_VARIABLE__LIST_DIMS: return DblPackage.TYPED_ELEMENT__LIST_DIMS;
				case DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR: return DblPackage.TYPED_ELEMENT__CLASSIFIER_TYPE_EXPR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case DblPackage.TYPED_ELEMENT__PRIMITIVE_TYPE: return DblPackage.ABSTRACT_VARIABLE__PRIMITIVE_TYPE;
				case DblPackage.TYPED_ELEMENT__IS_LIST: return DblPackage.ABSTRACT_VARIABLE__IS_LIST;
				case DblPackage.TYPED_ELEMENT__LIST_DIMS: return DblPackage.ABSTRACT_VARIABLE__LIST_DIMS;
				case DblPackage.TYPED_ELEMENT__CLASSIFIER_TYPE_EXPR: return DblPackage.ABSTRACT_VARIABLE__CLASSIFIER_TYPE_EXPR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isList: ");
		result.append(isList);
		result.append(')');
		return result.toString();
	}

} //AbstractVariableImpl
