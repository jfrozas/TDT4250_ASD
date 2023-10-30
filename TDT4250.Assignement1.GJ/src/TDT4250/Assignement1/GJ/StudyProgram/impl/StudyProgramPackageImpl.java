/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.impl;

import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.CourseStat;
import TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy;
import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.Season;
import TDT4250.Assignement1.GJ.StudyProgram.Semester;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage;
import TDT4250.Assignement1.GJ.StudyProgram.Studyprogram;
import TDT4250.Assignement1.GJ.StudyProgram.Year;

import TDT4250.Assignement1.GJ.StudyProgram.util.StudyProgramValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyProgramPackageImpl extends EPackageImpl implements StudyProgramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyprogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldofstudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseStatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seasonEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StudyProgramPackageImpl() {
		super(eNS_URI, StudyProgramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StudyProgramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StudyProgramPackage init() {
		if (isInited) return (StudyProgramPackage)EPackage.Registry.INSTANCE.getEPackage(StudyProgramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStudyProgramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StudyProgramPackageImpl theStudyProgramPackage = registeredStudyProgramPackage instanceof StudyProgramPackageImpl ? (StudyProgramPackageImpl)registeredStudyProgramPackage : new StudyProgramPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStudyProgramPackage.createPackageContents();

		// Initialize created meta-data
		theStudyProgramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStudyProgramPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StudyProgramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStudyProgramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StudyProgramPackage.eNS_URI, theStudyProgramPackage);
		return theStudyProgramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Status() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Coordinator() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Secondname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Fullname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYear() {
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYear_Name() {
		return (EAttribute)yearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYear_Semestercoursed() {
		return (EReference)yearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_Courses() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_Season() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemester__GetTotalCredits__Semester() {
		return semesterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyprogram() {
		return studyprogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyprogram_Name() {
		return (EAttribute)studyprogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyprogram_Yearslong() {
		return (EAttribute)studyprogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyprogram_YearCoursed() {
		return (EReference)studyprogramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyprogram_Field() {
		return (EReference)studyprogramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyprogram_Staff() {
		return (EReference)studyprogramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldofstudy() {
		return fieldofstudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldofstudy_Name() {
		return (EAttribute)fieldofstudyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldofstudy_Year() {
		return (EReference)fieldofstudyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseStat() {
		return courseStatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeason() {
		return seasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramFactory getStudyProgramFactory() {
		return (StudyProgramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__STATUS);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEReference(courseEClass, COURSE__COORDINATOR);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__SECONDNAME);
		createEAttribute(personEClass, PERSON__FULLNAME);

		yearEClass = createEClass(YEAR);
		createEAttribute(yearEClass, YEAR__NAME);
		createEReference(yearEClass, YEAR__SEMESTERCOURSED);

		semesterEClass = createEClass(SEMESTER);
		createEReference(semesterEClass, SEMESTER__COURSES);
		createEAttribute(semesterEClass, SEMESTER__SEASON);
		createEOperation(semesterEClass, SEMESTER___GET_TOTAL_CREDITS__SEMESTER);

		studyprogramEClass = createEClass(STUDYPROGRAM);
		createEAttribute(studyprogramEClass, STUDYPROGRAM__NAME);
		createEAttribute(studyprogramEClass, STUDYPROGRAM__YEARSLONG);
		createEReference(studyprogramEClass, STUDYPROGRAM__YEAR_COURSED);
		createEReference(studyprogramEClass, STUDYPROGRAM__FIELD);
		createEReference(studyprogramEClass, STUDYPROGRAM__STAFF);

		fieldofstudyEClass = createEClass(FIELDOFSTUDY);
		createEAttribute(fieldofstudyEClass, FIELDOFSTUDY__NAME);
		createEReference(fieldofstudyEClass, FIELDOFSTUDY__YEAR);

		// Create enums
		courseStatEEnum = createEEnum(COURSE_STAT);
		seasonEEnum = createEEnum(SEASON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Status(), this.getCourseStat(), "status", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEFloat(), "credits", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Coordinator(), this.getPerson(), null, "Coordinator", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "Firstname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Secondname(), ecorePackage.getEString(), "Secondname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Fullname(), ecorePackage.getEString(), "Fullname", null, 0, 1, Person.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYear_Name(), ecorePackage.getEInt(), "name", null, 1, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Semestercoursed(), this.getSemester(), null, "Semestercoursed", null, 0, 2, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemester_Courses(), this.getCourse(), null, "Courses", null, 0, 4, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_Season(), this.getSeason(), "Season", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSemester__GetTotalCredits__Semester(), ecorePackage.getEFloat(), "GetTotalCredits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSemester(), "semester", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(studyprogramEClass, Studyprogram.class, "Studyprogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudyprogram_Name(), ecorePackage.getEString(), "name", null, 1, 1, Studyprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyprogram_Yearslong(), ecorePackage.getEInt(), "Yearslong", null, 1, 1, Studyprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyprogram_YearCoursed(), this.getYear(), null, "YearCoursed", null, 1, 5, Studyprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyprogram_Field(), this.getFieldofstudy(), null, "Field", null, 1, 1, Studyprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyprogram_Staff(), this.getPerson(), null, "Staff", null, 0, -1, Studyprogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldofstudyEClass, Fieldofstudy.class, "Fieldofstudy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldofstudy_Name(), ecorePackage.getEString(), "name", null, 1, 1, Fieldofstudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldofstudy_Year(), this.getYear(), null, "Year", null, 0, 3, Fieldofstudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(courseStatEEnum, CourseStat.class, "CourseStat");
		addEEnumLiteral(courseStatEEnum, CourseStat.COMPULSORY);
		addEEnumLiteral(courseStatEEnum, CourseStat.ELECTIVE);

		initEEnum(seasonEEnum, Season.class, "Season");
		addEEnumLiteral(seasonEEnum, Season.AUTUMN);
		addEEnumLiteral(seasonEEnum, Season.SPRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0",
			   "invocationDelegates", "http://www.eclipse.org/acceleo/query/1.0",
			   "settingDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "constraints", "CreditNumber"
		   });
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "constraints", "MaxNumberCredits"
		   });
		addAnnotation
		  (studyprogramEClass,
		   source,
		   new String[] {
			   "constraints", "MaxYear"
		   });
		addAnnotation
		  (fieldofstudyEClass,
		   source,
		   new String[] {
			   "constraints", "FieldsOfStudy"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "MaxNumberCredits", "self.GetTotalCredits() < 30.0"
		   });
	}

} //StudyProgramPackageImpl
