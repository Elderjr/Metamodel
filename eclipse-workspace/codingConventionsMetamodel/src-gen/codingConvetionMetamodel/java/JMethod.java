/**
 */
package codingConvetionMetamodel.java;

import codingConvetionMetamodel.elements.namedElements.Method;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.java.JMethod#getThrows <em>Throws</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.java.JavaPackage#getJMethod()
 * @model
 * @generated
 */
public interface JMethod extends Method {
	/**
	 * Returns the value of the '<em><b>Throws</b></em>' reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.java.JClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' reference list.
	 * @see codingConvetionMetamodel.java.JavaPackage#getJMethod_Throws()
	 * @model type="codingConvetionMetamodel.java.JClass"
	 * @generated
	 */
	EList getThrows();

} // JMethod