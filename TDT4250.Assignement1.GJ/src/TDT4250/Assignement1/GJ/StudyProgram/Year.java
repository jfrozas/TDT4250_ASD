/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Year#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Year#getSemestercoursed <em>Semestercoursed</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(int)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getYear_Name()
	 * @model required="true"
	 * @generated
	 */
	int getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Year#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(int value);

	/**
	 * Returns the value of the '<em><b>Semestercoursed</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignement1.GJ.StudyProgram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestercoursed</em>' containment reference list.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getYear_Semestercoursed()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Semester> getSemestercoursed();

} // Year
