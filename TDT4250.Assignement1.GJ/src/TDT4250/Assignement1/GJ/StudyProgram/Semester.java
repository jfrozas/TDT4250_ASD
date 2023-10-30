/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MaxNumberCredits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 MaxNumberCredits='self.GetTotalCredits() &lt; 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Assignement1.GJ.StudyProgram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getSemester_Courses()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Assignement1.GJ.StudyProgram.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Season
	 * @see #setSeason(Season)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float GetTotalCredits(Semester semester);

} // Semester
