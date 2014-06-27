/**
 */
package hub.sam.dbl.provider;


import dbl.provider.dblEditPlugin;

import hub.sam.dbl.DblFactory;
import hub.sam.dbl.DblPackage;
import hub.sam.dbl.EmbeddableExtensionsContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hub.sam.dbl.EmbeddableExtensionsContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbeddableExtensionsContainerItemProvider
	extends ItemProviderAdapter
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
	public EmbeddableExtensionsContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EmbeddableExtensionsContainer_type");
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

		switch (notification.getFeatureID(EmbeddableExtensionsContainer.class)) {
			case DblPackage.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS:
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
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createExtensibleElement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createdeprecated_CodeBlock()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createLoopStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createSimpleStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createProcedureCall()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createWaitUntil()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createReactivate()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createActivateObject()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createAdvance()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createLocalScopeStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createForStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createWhileStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createSwitchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createBreakStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createContinueStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createL1Expr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createGreaterEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createLessEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMul()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createCreateObject()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createActiveLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTrueLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createFalseLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createEvalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createIdExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMetaAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTypeAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createClassContentExtension()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createModuleContentExtension()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMetaExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTargetStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createMappingStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createSetGenContextStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createResetGenContextStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createSaveGenStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createResumeGenStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createExpandExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createExpandStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createCodeQuoteExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.EMBEDDABLE_EXTENSIONS_CONTAINER__EXTENSIONS,
				 DblFactory.eINSTANCE.createTestStatement()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return dblEditPlugin.INSTANCE;
	}

}
