/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getSecondname <em>Secondname</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getFullname <em>Fullname</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getPerson_Firstname()
	 * @model required="true"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Secondname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondname</em>' attribute.
	 * @see #setSecondname(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getPerson_Secondname()
	 * @model required="true"
	 * @generated
	 */
	String getSecondname();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getSecondname <em>Secondname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondname</em>' attribute.
	 * @see #getSecondname()
	 * @generated
	 */
	void setSecondname(String value);

	/**
	 * Returns the value of the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullname</em>' attribute.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getPerson_Fullname()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullname();

} // Person
