/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCode <em>Code</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getStatus <em>Status</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCoordinator <em>Coordinator</em>}</li>
 * </ul>
 *
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CreditNumber'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Assignement1.GJ.StudyProgram.CourseStat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.CourseStat
	 * @see #setStatus(CourseStat)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse_Status()
	 * @model required="true"
	 * @generated
	 */
	CourseStat getStatus();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.CourseStat
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStat value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(Person)
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#getCourse_Coordinator()
	 * @model
	 * @generated
	 */
	Person getCoordinator();

	/**
	 * Sets the value of the '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(Person value);

} // Course
