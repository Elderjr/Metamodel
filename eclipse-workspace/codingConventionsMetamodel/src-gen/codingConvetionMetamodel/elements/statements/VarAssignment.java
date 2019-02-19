/**
 */
package codingConvetionMetamodel.elements.statements;

import codingConvetionMetamodel.elements.namedElements.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codingConvetionMetamodel.elements.statements.VarAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link codingConvetionMetamodel.elements.statements.VarAssignment#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getVarAssignment()
 * @model
 * @generated
 */
public interface VarAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getVarAssignment_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link codingConvetionMetamodel.elements.statements.VarAssignment#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link codingConvetionMetamodel.elements.statements.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see codingConvetionMetamodel.elements.statements.StatementsPackage#getVarAssignment_Assignment()
	 * @model type="codingConvetionMetamodel.elements.statements.Statement" containment="true"
	 * @generated
	 */
	EList getAssignment();

} // VarAssignment
