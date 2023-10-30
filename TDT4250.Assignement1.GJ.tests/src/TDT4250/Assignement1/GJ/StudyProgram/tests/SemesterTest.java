/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.tests;

import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.CourseStat;
import TDT4250.Assignement1.GJ.StudyProgram.Season;
import TDT4250.Assignement1.GJ.StudyProgram.Semester;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#GetTotalCredits(TDT4250.Assignement1.GJ.StudyProgram.Semester) <em>Get Total Credits</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterTest extends TestCase {

	/**
	 * The fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterTest.class);
	}

	/**
	 * Constructs a new Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyProgramFactory.eINSTANCE.createSemester());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link TDT4250.Assignement1.GJ.StudyProgram.Semester#GetTotalCredits(TDT4250.Assignement1.GJ.StudyProgram.Semester) <em>Get Total Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Assignement1.GJ.StudyProgram.Semester#GetTotalCredits(TDT4250.Assignement1.GJ.StudyProgram.Semester)
	 * @generated NOT
	 */
	public void testGetTotalCredits__Semester() {
		StudyProgramFactory factory = StudyProgramFactory.eINSTANCE;
		
		Semester s = factory.createSemester();
		s.setSeason(Season.SPRING);
		
		assertEquals((float)0.0, s.GetTotalCredits(s));
		
		Course c = factory.createCourse();
		c.setCode("TDT4250");
		c.setName("ASD");
		c.setCredits((float) 5);
		c.setStatus(CourseStat.COMPULSORY);
		
		Course d = factory.createCourse();
		d.setCode("TDT");
		d.setName("ASD");
		d.setCredits((float) 4);
		d.setStatus(CourseStat.COMPULSORY);
		

		s.getCourses().add(c);
		s.getCourses().add(d);
		
		
		assertEquals((float)9.0, s.GetTotalCredits(s));
	}

} //SemesterTest
