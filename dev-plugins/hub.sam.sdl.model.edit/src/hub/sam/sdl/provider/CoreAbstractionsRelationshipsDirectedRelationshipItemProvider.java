/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hub.sam.sdl.provider;


import hub.sam.sdl.CoreAbstractionsRelationshipsDirectedRelationship;
import hub.sam.sdl.EmfSdlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link hub.sam.sdl.CoreAbstractionsRelationshipsDirectedRelationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreAbstractionsRelationshipsDirectedRelationshipItemProvider
	extends CoreAbstractionsRelationshipsRelationshipItemProvider
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
	public CoreAbstractionsRelationshipsDirectedRelationshipItemProvider(AdapterFactory adapterFactory) {
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

			addDirectedRelationship_sourcePropertyDescriptor(object);
			addDirectedRelationship_targetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Directed Relationship source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectedRelationship_sourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_source_feature", "_UI_CoreAbstractionsRelationshipsDirectedRelationship_type"),
				 EmfSdlPackage.eINSTANCE.getCoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_source(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directed Relationship target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectedRelationship_targetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_target_feature", "_UI_CoreAbstractionsRelationshipsDirectedRelationship_type"),
				 EmfSdlPackage.eINSTANCE.getCoreAbstractionsRelationshipsDirectedRelationship_DirectedRelationship_target(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CoreAbstractionsRelationshipsDirectedRelationship coreAbstractionsRelationshipsDirectedRelationship = (CoreAbstractionsRelationshipsDirectedRelationship)object;
		return getString("_UI_CoreAbstractionsRelationshipsDirectedRelationship_type") + " " + coreAbstractionsRelationshipsDirectedRelationship.getLine();
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
			childFeature == EmfSdlPackage.eINSTANCE.getCoreAbstractionsOwnershipsElement_OwnedElement() ||
			childFeature == EmfSdlPackage.eINSTANCE.getCoreAbstractionsOwnershipsElement_OwnedComment();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
