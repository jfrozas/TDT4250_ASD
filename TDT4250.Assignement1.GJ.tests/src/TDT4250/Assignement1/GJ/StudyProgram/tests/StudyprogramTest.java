/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.tests;

import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;
import TDT4250.Assignement1.GJ.StudyProgram.Studyprogram;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Studyprogram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogramTest extends TestCase {

	/**
	 * The fixture for this Studyprogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studyprogram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyprogramTest.class);
	}

	/**
	 * Constructs a new Studyprogram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Studyprogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Studyprogram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Studyprogram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studyprogram getFixture() {
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
		setFixture(StudyProgramFactory.eINSTANCE.createStudyprogram());
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

} //StudyprogramTest
