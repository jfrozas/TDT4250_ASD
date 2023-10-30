/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studyprogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearslong <em>Yearslong</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearCoursed <em>Year Coursed</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getField <em>Field</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MaxYear'"
 * @generated
 */
public interface Studyprogram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Yearslong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yearslong</em>' attribute.
	 * @see #setYearslong(int)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram_Yearslong()
	 * @model required="true"
	 * @generated
	 */
	int getYearslong();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearslong <em>Yearslong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yearslong</em>' attribute.
	 * @see #getYearslong()
	 * @generated
	 */
	void setYearslong(int value);

	/**
	 * Returns the value of the '<em><b>Year Coursed</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignement1.GJ.StudyProgram.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Coursed</em>' containment reference list.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram_YearCoursed()
	 * @model containment="true" required="true" upper="5"
	 * @generated
	 */
	EList<Year> getYearCoursed();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(Fieldofstudy)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fieldofstudy getField();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Fieldofstudy value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignement1.GJ.StudyProgram.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getStudyprogram_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getStaff();

} // Studyprogram
