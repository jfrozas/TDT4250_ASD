/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.tests;

import TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fieldofstudy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldofstudyTest extends TestCase {

	/**
	 * The fixture for this Fieldofstudy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fieldofstudy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldofstudyTest.class);
	}

	/**
	 * Constructs a new Fieldofstudy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldofstudyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fieldofstudy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Fieldofstudy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fieldofstudy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fieldofstudy getFixture() {
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
		setFixture(StudyProgramFactory.eINSTANCE.createFieldofstudy());
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

} //FieldofstudyTest
