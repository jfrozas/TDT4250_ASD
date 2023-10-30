/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.impl;

import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.CourseStat;
import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.CourseImpl#getCoordinator <em>Coordinator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStat STATUS_EDEFAULT = CourseStat.COMPULSORY;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStat status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected Person coordinator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseStat getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CourseStat newStatus) {
		CourseStat oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject)coordinator;
			coordinator = (Person)eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgramPackage.COURSE__COORDINATOR, oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinator(Person newCoordinator) {
		Person oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.COURSE__COORDINATOR, oldCoordinator, coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramPackage.COURSE__NAME:
				return getName();
			case StudyProgramPackage.COURSE__CODE:
				return getCode();
			case StudyProgramPackage.COURSE__STATUS:
				return getStatus();
			case StudyProgramPackage.COURSE__CREDITS:
				return getCredits();
			case StudyProgramPackage.COURSE__COORDINATOR:
				if (resolve) return getCoordinator();
				return basicGetCoordinator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgramPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case StudyProgramPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case StudyProgramPackage.COURSE__STATUS:
				setStatus((CourseStat)newValue);
				return;
			case StudyProgramPackage.COURSE__CREDITS:
				setCredits((Float)newValue);
				return;
			case StudyProgramPackage.COURSE__COORDINATOR:
				setCoordinator((Person)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyProgramPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyProgramPackage.COURSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StudyProgramPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case StudyProgramPackage.COURSE__COORDINATOR:
				setCoordinator((Person)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyProgramPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyProgramPackage.COURSE__STATUS:
				return status != STATUS_EDEFAULT;
			case StudyProgramPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case StudyProgramPackage.COURSE__COORDINATOR:
				return coordinator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", status: ");
		result.append(status);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
