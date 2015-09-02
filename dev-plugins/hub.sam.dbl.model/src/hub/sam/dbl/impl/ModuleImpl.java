/**
 */
package hub.sam.dbl.impl;

import hub.sam.dbl.Construct;
import hub.sam.dbl.ConstructiveExtension;
import hub.sam.dbl.ConstructiveExtensionAtContentExtensionPoint;
import hub.sam.dbl.DblPackage;
import hub.sam.dbl.ExpandExpr;
import hub.sam.dbl.ExtensionDefinition;
import hub.sam.dbl.ExtensionSemanticsDefinition;
import hub.sam.dbl.Function;
import hub.sam.dbl.Module;
import hub.sam.dbl.Variable;

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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getContentExtensions <em>Content Extensions</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getExpandExpr <em>Expand Expr</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getExtensionDefinitions <em>Extension Definitions</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getExtensionSemanticsDefinitions <em>Extension Semantics Definitions</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hub.sam.dbl.impl.ModuleImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends NamedElementImpl implements Module {
	/**
	 * The cached value of the '{@link #getContentExtensions() <em>Content Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstructiveExtension> contentExtensions;

	/**
	 * The cached value of the '{@link #getExpandExpr() <em>Expand Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandExpr()
	 * @generated
	 * @ordered
	 */
	protected ExpandExpr expandExpr;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<hub.sam.dbl.Class> classes;

	/**
	 * The cached value of the '{@link #getExtensionDefinitions() <em>Extension Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionDefinition> extensionDefinitions;

	/**
	 * The cached value of the '{@link #getExtensionSemanticsDefinitions() <em>Extension Semantics Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionSemanticsDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionSemanticsDefinition> extensionSemanticsDefinitions;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DblPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstructiveExtension> getContentExtensions() {
		if (contentExtensions == null) {
			contentExtensions = new EObjectContainmentEList<ConstructiveExtension>(ConstructiveExtension.class, this, DblPackage.MODULE__CONTENT_EXTENSIONS);
		}
		return contentExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandExpr getExpandExpr() {
		return expandExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpandExpr(ExpandExpr newExpandExpr, NotificationChain msgs) {
		ExpandExpr oldExpandExpr = expandExpr;
		expandExpr = newExpandExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DblPackage.MODULE__EXPAND_EXPR, oldExpandExpr, newExpandExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandExpr(ExpandExpr newExpandExpr) {
		if (newExpandExpr != expandExpr) {
			NotificationChain msgs = null;
			if (expandExpr != null)
				msgs = ((InternalEObject)expandExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DblPackage.MODULE__EXPAND_EXPR, null, msgs);
			if (newExpandExpr != null)
				msgs = ((InternalEObject)newExpandExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DblPackage.MODULE__EXPAND_EXPR, null, msgs);
			msgs = basicSetExpandExpr(newExpandExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DblPackage.MODULE__EXPAND_EXPR, newExpandExpr, newExpandExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<hub.sam.dbl.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<hub.sam.dbl.Class>(hub.sam.dbl.Class.class, this, DblPackage.MODULE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionDefinition> getExtensionDefinitions() {
		if (extensionDefinitions == null) {
			extensionDefinitions = new EObjectContainmentEList<ExtensionDefinition>(ExtensionDefinition.class, this, DblPackage.MODULE__EXTENSION_DEFINITIONS);
		}
		return extensionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionSemanticsDefinition> getExtensionSemanticsDefinitions() {
		if (extensionSemanticsDefinitions == null) {
			extensionSemanticsDefinitions = new EObjectContainmentEList<ExtensionSemanticsDefinition>(ExtensionSemanticsDefinition.class, this, DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS);
		}
		return extensionSemanticsDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, DblPackage.MODULE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, DblPackage.MODULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DblPackage.MODULE__CONTENT_EXTENSIONS:
				return ((InternalEList<?>)getContentExtensions()).basicRemove(otherEnd, msgs);
			case DblPackage.MODULE__EXPAND_EXPR:
				return basicSetExpandExpr(null, msgs);
			case DblPackage.MODULE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case DblPackage.MODULE__EXTENSION_DEFINITIONS:
				return ((InternalEList<?>)getExtensionDefinitions()).basicRemove(otherEnd, msgs);
			case DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS:
				return ((InternalEList<?>)getExtensionSemanticsDefinitions()).basicRemove(otherEnd, msgs);
			case DblPackage.MODULE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case DblPackage.MODULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case DblPackage.MODULE__CONTENT_EXTENSIONS:
				return getContentExtensions();
			case DblPackage.MODULE__EXPAND_EXPR:
				return getExpandExpr();
			case DblPackage.MODULE__CLASSES:
				return getClasses();
			case DblPackage.MODULE__EXTENSION_DEFINITIONS:
				return getExtensionDefinitions();
			case DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS:
				return getExtensionSemanticsDefinitions();
			case DblPackage.MODULE__FUNCTIONS:
				return getFunctions();
			case DblPackage.MODULE__VARIABLES:
				return getVariables();
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
			case DblPackage.MODULE__CONTENT_EXTENSIONS:
				getContentExtensions().clear();
				getContentExtensions().addAll((Collection<? extends ConstructiveExtension>)newValue);
				return;
			case DblPackage.MODULE__EXPAND_EXPR:
				setExpandExpr((ExpandExpr)newValue);
				return;
			case DblPackage.MODULE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends hub.sam.dbl.Class>)newValue);
				return;
			case DblPackage.MODULE__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				getExtensionDefinitions().addAll((Collection<? extends ExtensionDefinition>)newValue);
				return;
			case DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS:
				getExtensionSemanticsDefinitions().clear();
				getExtensionSemanticsDefinitions().addAll((Collection<? extends ExtensionSemanticsDefinition>)newValue);
				return;
			case DblPackage.MODULE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case DblPackage.MODULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
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
			case DblPackage.MODULE__CONTENT_EXTENSIONS:
				getContentExtensions().clear();
				return;
			case DblPackage.MODULE__EXPAND_EXPR:
				setExpandExpr((ExpandExpr)null);
				return;
			case DblPackage.MODULE__CLASSES:
				getClasses().clear();
				return;
			case DblPackage.MODULE__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				return;
			case DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS:
				getExtensionSemanticsDefinitions().clear();
				return;
			case DblPackage.MODULE__FUNCTIONS:
				getFunctions().clear();
				return;
			case DblPackage.MODULE__VARIABLES:
				getVariables().clear();
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
			case DblPackage.MODULE__CONTENT_EXTENSIONS:
				return contentExtensions != null && !contentExtensions.isEmpty();
			case DblPackage.MODULE__EXPAND_EXPR:
				return expandExpr != null;
			case DblPackage.MODULE__CLASSES:
				return classes != null && !classes.isEmpty();
			case DblPackage.MODULE__EXTENSION_DEFINITIONS:
				return extensionDefinitions != null && !extensionDefinitions.isEmpty();
			case DblPackage.MODULE__EXTENSION_SEMANTICS_DEFINITIONS:
				return extensionSemanticsDefinitions != null && !extensionSemanticsDefinitions.isEmpty();
			case DblPackage.MODULE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case DblPackage.MODULE__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		if (baseClass == ConstructiveExtensionAtContentExtensionPoint.class) {
			switch (derivedFeatureID) {
				case DblPackage.MODULE__CONTENT_EXTENSIONS: return DblPackage.CONSTRUCTIVE_EXTENSION_AT_CONTENT_EXTENSION_POINT__CONTENT_EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == Construct.class) {
			switch (derivedFeatureID) {
				case DblPackage.MODULE__EXPAND_EXPR: return DblPackage.CONSTRUCT__EXPAND_EXPR;
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
		if (baseClass == ConstructiveExtensionAtContentExtensionPoint.class) {
			switch (baseFeatureID) {
				case DblPackage.CONSTRUCTIVE_EXTENSION_AT_CONTENT_EXTENSION_POINT__CONTENT_EXTENSIONS: return DblPackage.MODULE__CONTENT_EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == Construct.class) {
			switch (baseFeatureID) {
				case DblPackage.CONSTRUCT__EXPAND_EXPR: return DblPackage.MODULE__EXPAND_EXPR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModuleImpl