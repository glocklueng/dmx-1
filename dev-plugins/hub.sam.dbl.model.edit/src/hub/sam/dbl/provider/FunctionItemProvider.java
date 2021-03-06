/**
 */
package hub.sam.dbl.provider;


import hub.sam.dbl.DblFactory;
import hub.sam.dbl.DblPackage;
import hub.sam.dbl.Function;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hub.sam.dbl.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_class_feature", "_UI_Function_type"),
				 DblPackage.Literals.FUNCTION__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_abstract_feature", "_UI_Function_type"),
				 DblPackage.Literals.FUNCTION__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE);
			childrenFeatures.add(DblPackage.Literals.TYPED_ELEMENT__TYPE_ARRAY_DIMENSIONS);
			childrenFeatures.add(DblPackage.Literals.TYPED_ELEMENT__CLASSIFIER_TYPE);
			childrenFeatures.add(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS);
			childrenFeatures.add(DblPackage.Literals.FUNCTION__PARAMETERS);
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
	 * This returns Function.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Function"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Function)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Function_type") :
			getString("_UI_Function_type") + " " + label;
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

		switch (notification.getFeatureID(Function.class)) {
			case DblPackage.FUNCTION__CLASS:
			case DblPackage.FUNCTION__ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DblPackage.FUNCTION__PRIMITIVE_TYPE:
			case DblPackage.FUNCTION__TYPE_ARRAY_DIMENSIONS:
			case DblPackage.FUNCTION__CLASSIFIER_TYPE:
			case DblPackage.FUNCTION__STATEMENTS:
			case DblPackage.FUNCTION__PARAMETERS:
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
				(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE,
				 DblFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE,
				 DblFactory.eINSTANCE.createIntType()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE,
				 DblFactory.eINSTANCE.createBoolType()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE,
				 DblFactory.eINSTANCE.createDoubleType()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__PRIMITIVE_TYPE,
				 DblFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__TYPE_ARRAY_DIMENSIONS,
				 DblFactory.eINSTANCE.createArrayDimension()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.TYPED_ELEMENT__CLASSIFIER_TYPE,
				 DblFactory.eINSTANCE.createIdExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createSimpleStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createWaitUntil()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createReactivate()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createActivateObject()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createAdvance()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createLocalScopeStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createTargetStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createCreateIdStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createExpansionStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createExpandStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.LOCAL_SCOPE__STATEMENTS,
				 DblFactory.eINSTANCE.createTestStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.FUNCTION__PARAMETERS,
				 DblFactory.eINSTANCE.createParameter()));
	}

}
