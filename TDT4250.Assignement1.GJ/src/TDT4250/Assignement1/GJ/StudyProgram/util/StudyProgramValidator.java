/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.util;

import TDT4250.Assignement1.GJ.StudyProgram.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage
 * @generated
 */
public class StudyProgramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyProgramValidator INSTANCE = new StudyProgramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TDT4250.Assignement1.GJ.StudyProgram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyProgramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyProgramPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyProgramPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case StudyProgramPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case StudyProgramPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyProgramPackage.STUDYPROGRAM:
				return validateStudyprogram((Studyprogram)value, diagnostics, context);
			case StudyProgramPackage.FIELDOFSTUDY:
				return validateFieldofstudy((Fieldofstudy)value, diagnostics, context);
			case StudyProgramPackage.COURSE_STAT:
				return validateCourseStat((CourseStat)value, diagnostics, context);
			case StudyProgramPackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_CreditNumber(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CreditNumber constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_CreditNumber(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {

		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		
		if (course.getCredits() != 7.5 | course.getCredits() != 15 | course.getCredits() != 30) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CreditNumber", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(year, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_MaxNumberCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MaxNumberCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__MAX_NUMBER_CREDITS__EEXPRESSION = "self.GetTotalCredits() < 30.0";

	/**
	 * Validates the MaxNumberCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_MaxNumberCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "MaxNumberCredits",
				 SEMESTER__MAX_NUMBER_CREDITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyprogram(Studyprogram studyprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyprogram, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyprogram, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyprogram_MaxYear(studyprogram, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxYear constraint of '<em>Studyprogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStudyprogram_MaxYear(Studyprogram studyprogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (studyprogram.getYearslong() > 5) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MaxYear", getObjectLabel(studyprogram, context) },
						 new Object[] { studyprogram },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldofstudy(Fieldofstudy fieldofstudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fieldofstudy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fieldofstudy, diagnostics, context);
		if (result || diagnostics != null) result &= validateFieldofstudy_FieldsOfStudy(fieldofstudy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FieldsOfStudy constraint of '<em>Fieldofstudy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFieldofstudy_FieldsOfStudy(Fieldofstudy fieldofstudy, DiagnosticChain diagnostics, Map<Object, Object> context) {

		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		if (fieldofstudy.getName() != "Algorithms and computers" | fieldofstudy.getName() != "Databases and search" | fieldofstudy.getName() != "Artifical Intelligence" | fieldofstudy.getName() != "Software systems") {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FieldsOfStudy", getObjectLabel(fieldofstudy, context) },
						 new Object[] { fieldofstudy },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStat(CourseStat courseStat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyProgramValidator
