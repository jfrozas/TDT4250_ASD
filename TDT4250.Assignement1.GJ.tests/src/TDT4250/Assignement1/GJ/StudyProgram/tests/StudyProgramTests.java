/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>StudyProgram</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyProgramTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new StudyProgramTests("StudyProgram Tests");
		suite.addTestSuite(SemesterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramTests(String name) {
		super(name);
	}

} //StudyProgramTests
