/**
 */
package codingConvetionMetamodel.elements.namedElements.impl;

import codingConvetionMetamodel.elements.namedElements.ComplexType;
import codingConvetionMetamodel.elements.namedElements.NamedElementsPackage;
import codingConvetionMetamodel.elements.namedElements.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.impl.ComplexTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.namedElements.impl.ComplexTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends NamedElementImpl implements ComplexType {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList fields;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList superTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NamedElementsPackage.Literals.COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList(Variable.class, this, NamedElementsPackage.COMPLEX_TYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList(ComplexType.class, this,
					NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
			return ((InternalEList) getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
			return getFields();
		case NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES:
			return getSuperTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
			getFields().clear();
			getFields().addAll((Collection) newValue);
			return;
		case NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
			getFields().clear();
			return;
		case NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NamedElementsPackage.COMPLEX_TYPE__FIELDS:
			return fields != null && !fields.isEmpty();
		case NamedElementsPackage.COMPLEX_TYPE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexTypeImpl