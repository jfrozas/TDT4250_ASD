/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage
 * @generated
 */
public interface StudyProgramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyProgramFactory eINSTANCE = TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studyprogram</em>'.
	 * @generated
	 */
	Studyprogram createStudyprogram();

	/**
	 * Returns a new object of class '<em>Fieldofstudy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fieldofstudy</em>'.
	 * @generated
	 */
	Fieldofstudy createFieldofstudy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StudyProgramPackage getStudyProgramPackage();

} //StudyProgramFactory
