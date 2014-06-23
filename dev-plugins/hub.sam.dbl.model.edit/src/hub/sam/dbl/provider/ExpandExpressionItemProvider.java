/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.dbl.provider;


import hub.sam.dbl.DblFactory;
import hub.sam.dbl.DblPackage;
import hub.sam.dbl.ExpandExpression;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hub.sam.dbl.ExpandExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpandExpressionItemProvider
	extends StatementExpressionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addObjectIsExtensionInstancePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addConcreteSyntaxPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Object Is Extension Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectIsExtensionInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtensibleElement_objectIsExtensionInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtensibleElement_objectIsExtensionInstance_feature", "_UI_ExtensibleElement_type"),
				 DblPackage.Literals.EXTENSIBLE_ELEMENT__OBJECT_IS_EXTENSION_INSTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 DblPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concrete Syntax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcreteSyntaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Construct_concreteSyntax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Construct_concreteSyntax_feature", "_UI_Construct_type"),
				 DblPackage.Literals.CONSTRUCT__CONCRETE_SYNTAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DblPackage.Literals.EXPANDABLE_ELEMENT__EXPAND_EXPRESSION);
			childrenFeatures.add(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExpandExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpandExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExpandExpression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExpandExpression_type") :
			getString("_UI_ExpandExpression_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExpandExpression.class)) {
			case DblPackage.EXPAND_EXPRESSION__OBJECT_IS_EXTENSION_INSTANCE:
			case DblPackage.EXPAND_EXPRESSION__NAME:
			case DblPackage.EXPAND_EXPRESSION__CONCRETE_SYNTAX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DblPackage.EXPAND_EXPRESSION__EXPAND_EXPRESSION:
			case DblPackage.EXPAND_EXPRESSION__META_OBJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPANDABLE_ELEMENT__EXPAND_EXPRESSION,
				 DblFactory.eINSTANCE.createExpandExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createL1Expr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createGreaterEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createLessEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createMul()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createCreateObject()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createActiveLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createTrueLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createFalseLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createEvalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createIdExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createMetaAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createTypeAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createMetaExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createExpandExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT,
				 DblFactory.eINSTANCE.createCodeQuoteExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DblPackage.Literals.EXPANDABLE_ELEMENT__EXPAND_EXPRESSION ||
			childFeature == DblPackage.Literals.EXPAND_EXPRESSION__META_OBJECT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
