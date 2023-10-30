/**
 */
package TDT4250.Assignement1.GJ.StudyProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0' invocationDelegates='http://www.eclipse.org/acceleo/query/1.0' settingDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface StudyProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StudyProgram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TDT4250.Assignement1.GJ/model/StudyProgram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StudyProgram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyProgramPackage eINSTANCE = TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COORDINATOR = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Secondname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SECONDNAME = 1;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FULLNAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.YearImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semestercoursed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SEMESTERCOURSED = 1;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEASON = 1;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Total Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER___GET_TOTAL_CREDITS__SEMESTER = 0;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl <em>Studyprogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getStudyprogram()
	 * @generated
	 */
	int STUDYPROGRAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Yearslong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__YEARSLONG = 1;

	/**
	 * The feature id for the '<em><b>Year Coursed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__YEAR_COURSED = 2;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__FIELD = 3;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM__STAFF = 4;

	/**
	 * The number of structural features of the '<em>Studyprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Studyprogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDYPROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.FieldofstudyImpl <em>Fieldofstudy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.FieldofstudyImpl
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getFieldofstudy()
	 * @generated
	 */
	int FIELDOFSTUDY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDOFSTUDY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDOFSTUDY__YEAR = 1;

	/**
	 * The number of structural features of the '<em>Fieldofstudy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDOFSTUDY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fieldofstudy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELDOFSTUDY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.CourseStat <em>Course Stat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.CourseStat
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getCourseStat()
	 * @generated
	 */
	int COURSE_STAT = 6;

	/**
	 * The meta object id for the '{@link TDT4250.Assignement1.GJ.StudyProgram.Season <em>Season</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Season
	 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 7;

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course#getStatus()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Status();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.Assignement1.GJ.StudyProgram.Course#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Course#getCoordinator()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coordinator();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getSecondname <em>Secondname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondname</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Person#getSecondname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Secondname();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Person#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Person#getFullname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Fullname();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Year#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Year#getName()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignement1.GJ.StudyProgram.Year#getSemestercoursed <em>Semestercoursed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestercoursed</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Year#getSemestercoursed()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Semestercoursed();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Semester#getSeason()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Season();

	/**
	 * Returns the meta object for the '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#GetTotalCredits(TDT4250.Assignement1.GJ.StudyProgram.Semester) <em>Get Total Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Credits</em>' operation.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Semester#GetTotalCredits(TDT4250.Assignement1.GJ.StudyProgram.Semester)
	 * @generated
	 */
	EOperation getSemester__GetTotalCredits__Semester();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studyprogram</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram
	 * @generated
	 */
	EClass getStudyprogram();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getName()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EAttribute getStudyprogram_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearslong <em>Yearslong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearslong</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearslong()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EAttribute getStudyprogram_Yearslong();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearCoursed <em>Year Coursed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Coursed</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getYearCoursed()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EReference getStudyprogram_YearCoursed();

	/**
	 * Returns the meta object for the containment reference '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getField()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EReference getStudyprogram_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Studyprogram#getStaff()
	 * @see #getStudyprogram()
	 * @generated
	 */
	EReference getStudyprogram_Staff();

	/**
	 * Returns the meta object for class '{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy <em>Fieldofstudy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fieldofstudy</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy
	 * @generated
	 */
	EClass getFieldofstudy();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getName()
	 * @see #getFieldofstudy()
	 * @generated
	 */
	EAttribute getFieldofstudy_Name();

	/**
	 * Returns the meta object for the reference list '{@link TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Year</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy#getYear()
	 * @see #getFieldofstudy()
	 * @generated
	 */
	EReference getFieldofstudy_Year();

	/**
	 * Returns the meta object for enum '{@link TDT4250.Assignement1.GJ.StudyProgram.CourseStat <em>Course Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Stat</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.CourseStat
	 * @generated
	 */
	EEnum getCourseStat();

	/**
	 * Returns the meta object for enum '{@link TDT4250.Assignement1.GJ.StudyProgram.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season</em>'.
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Season
	 * @generated
	 */
	EEnum getSeason();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyProgramFactory getStudyProgramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STATUS = eINSTANCE.getCourse_Status();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COORDINATOR = eINSTANCE.getCourse_Coordinator();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Secondname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SECONDNAME = eINSTANCE.getPerson_Secondname();

		/**
		 * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FULLNAME = eINSTANCE.getPerson_Fullname();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.YearImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__NAME = eINSTANCE.getYear_Name();

		/**
		 * The meta object literal for the '<em><b>Semestercoursed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SEMESTERCOURSED = eINSTANCE.getYear_Semestercoursed();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEASON = eINSTANCE.getSemester_Season();

		/**
		 * The meta object literal for the '<em><b>Get Total Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEMESTER___GET_TOTAL_CREDITS__SEMESTER = eINSTANCE.getSemester__GetTotalCredits__Semester();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl <em>Studyprogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getStudyprogram()
		 * @generated
		 */
		EClass STUDYPROGRAM = eINSTANCE.getStudyprogram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDYPROGRAM__NAME = eINSTANCE.getStudyprogram_Name();

		/**
		 * The meta object literal for the '<em><b>Yearslong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDYPROGRAM__YEARSLONG = eINSTANCE.getStudyprogram_Yearslong();

		/**
		 * The meta object literal for the '<em><b>Year Coursed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPROGRAM__YEAR_COURSED = eINSTANCE.getStudyprogram_YearCoursed();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPROGRAM__FIELD = eINSTANCE.getStudyprogram_Field();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDYPROGRAM__STAFF = eINSTANCE.getStudyprogram_Staff();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.impl.FieldofstudyImpl <em>Fieldofstudy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.FieldofstudyImpl
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getFieldofstudy()
		 * @generated
		 */
		EClass FIELDOFSTUDY = eINSTANCE.getFieldofstudy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELDOFSTUDY__NAME = eINSTANCE.getFieldofstudy_Name();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELDOFSTUDY__YEAR = eINSTANCE.getFieldofstudy_Year();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.CourseStat <em>Course Stat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.CourseStat
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getCourseStat()
		 * @generated
		 */
		EEnum COURSE_STAT = eINSTANCE.getCourseStat();

		/**
		 * The meta object literal for the '{@link TDT4250.Assignement1.GJ.StudyProgram.Season <em>Season</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Assignement1.GJ.StudyProgram.Season
		 * @see TDT4250.Assignement1.GJ.StudyProgram.impl.StudyProgramPackageImpl#getSeason()
		 * @generated
		 */
		EEnum SEASON = eINSTANCE.getSeason();

	}

} //StudyProgramPackage
