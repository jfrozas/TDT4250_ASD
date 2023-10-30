/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.impl;

import TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy;
import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage;
import TDT4250.Assignement1.GJ.StudyProgram.Studyprogram;
import TDT4250.Assignement1.GJ.StudyProgram.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studyprogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl#getYearslong <em>Yearslong</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl#getYearCoursed <em>Year Coursed</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl#getField <em>Field</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.StudyprogramImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyprogramImpl extends MinimalEObjectImpl.Container implements Studyprogram {
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
	 * The default value of the '{@link #getYearslong() <em>Yearslong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearslong()
	 * @generated
	 * @ordered
	 */
	protected static final int YEARSLONG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearslong() <em>Yearslong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearslong()
	 * @generated
	 * @ordered
	 */
	protected int yearslong = YEARSLONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYearCoursed() <em>Year Coursed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearCoursed()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> yearCoursed;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected Fieldofstudy field;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyprogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramPackage.Literals.STUDYPROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.STUDYPROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearslong() {
		return yearslong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearslong(int newYearslong) {
		int oldYearslong = yearslong;
		yearslong = newYearslong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.STUDYPROGRAM__YEARSLONG, oldYearslong, yearslong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYearCoursed() {
		if (yearCoursed == null) {
			yearCoursed = new EObjectContainmentEList<Year>(Year.class, this, StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED);
		}
		return yearCoursed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fieldofstudy getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(Fieldofstudy newField, NotificationChain msgs) {
		Fieldofstudy oldField = field;
		field = newField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyProgramPackage.STUDYPROGRAM__FIELD, oldField, newField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(Fieldofstudy newField) {
		if (newField != field) {
			NotificationChain msgs = null;
			if (field != null)
				msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyProgramPackage.STUDYPROGRAM__FIELD, null, msgs);
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyProgramPackage.STUDYPROGRAM__FIELD, null, msgs);
			msgs = basicSetField(newField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.STUDYPROGRAM__FIELD, newField, newField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Person>(Person.class, this, StudyProgramPackage.STUDYPROGRAM__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED:
				return ((InternalEList<?>)getYearCoursed()).basicRemove(otherEnd, msgs);
			case StudyProgramPackage.STUDYPROGRAM__FIELD:
				return basicSetField(null, msgs);
			case StudyProgramPackage.STUDYPROGRAM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramPackage.STUDYPROGRAM__NAME:
				return getName();
			case StudyProgramPackage.STUDYPROGRAM__YEARSLONG:
				return getYearslong();
			case StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED:
				return getYearCoursed();
			case StudyProgramPackage.STUDYPROGRAM__FIELD:
				return getField();
			case StudyProgramPackage.STUDYPROGRAM__STAFF:
				return getStaff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgramPackage.STUDYPROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyProgramPackage.STUDYPROGRAM__YEARSLONG:
				setYearslong((Integer)newValue);
				return;
			case StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED:
				getYearCoursed().clear();
				getYearCoursed().addAll((Collection<? extends Year>)newValue);
				return;
			case StudyProgramPackage.STUDYPROGRAM__FIELD:
				setField((Fieldofstudy)newValue);
				return;
			case StudyProgramPackage.STUDYPROGRAM__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Person>)newValue);
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
			case StudyProgramPackage.STUDYPROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramPackage.STUDYPROGRAM__YEARSLONG:
				setYearslong(YEARSLONG_EDEFAULT);
				return;
			case StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED:
				getYearCoursed().clear();
				return;
			case StudyProgramPackage.STUDYPROGRAM__FIELD:
				setField((Fieldofstudy)null);
				return;
			case StudyProgramPackage.STUDYPROGRAM__STAFF:
				getStaff().clear();
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
			case StudyProgramPackage.STUDYPROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramPackage.STUDYPROGRAM__YEARSLONG:
				return yearslong != YEARSLONG_EDEFAULT;
			case StudyProgramPackage.STUDYPROGRAM__YEAR_COURSED:
				return yearCoursed != null && !yearCoursed.isEmpty();
			case StudyProgramPackage.STUDYPROGRAM__FIELD:
				return field != null;
			case StudyProgramPackage.STUDYPROGRAM__STAFF:
				return staff != null && !staff.isEmpty();
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
		result.append(", Yearslong: ");
		result.append(yearslong);
		result.append(')');
		return result.toString();
	}

} //StudyprogramImpl
