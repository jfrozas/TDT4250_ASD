/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fieldofstudy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getFieldofstudy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FieldsOfStudy'"
 * @generated
 */
public interface Fieldofstudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getFieldofstudy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' reference list.
	 * The list contents are of type {@link TDT4250.Assignement1.GJ.StudyProgram.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' reference list.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getFieldofstudy_Year()
	 * @model upper="3"
	 * @generated
	 */
	EList<Year> getYear();

} // Fieldofstudy
