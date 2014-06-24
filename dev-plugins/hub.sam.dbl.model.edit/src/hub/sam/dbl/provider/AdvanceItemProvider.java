/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.dbl.provider;


import hub.sam.dbl.Advance;
import hub.sam.dbl.DblFactory;
import hub.sam.dbl.DblPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hub.sam.dbl.Advance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AdvanceItemProvider
	extends SimpleStatementItemProvider
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
	public AdvanceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DblPackage.Literals.ADVANCE__TIME);
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
	 * This returns Advance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Advance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Advance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Advance_type") :
			getString("_UI_Advance_type") + " " + label;
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

		switch (notification.getFeatureID(Advance.class)) {
			case DblPackage.ADVANCE__TIME:
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
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createL1Expr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createGreaterEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createLessEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createInstanceOf()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createMul()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createMod()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createNeg()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createCreateObject()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createActiveLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createTrueLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createFalseLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createEvalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createIdExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createVariableAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createMetaAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createTypeAccess()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createMetaExpr()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createExpandExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DblPackage.Literals.ADVANCE__TIME,
				 DblFactory.eINSTANCE.createCodeQuoteExpression()));
	}

}
