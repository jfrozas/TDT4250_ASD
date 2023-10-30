/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.impl;

import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl#getSecondname <em>Secondname</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.PersonImpl#getFullname <em>Fullname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondname() <em>Secondname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondname()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondname() <em>Secondname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondname()
	 * @generated
	 * @ordered
	 */
	protected String secondname = SECONDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLNAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondname() {
		return secondname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondname(String newSecondname) {
		String oldSecondname = secondname;
		secondname = newSecondname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.PERSON__SECONDNAME, oldSecondname, secondname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullname() {

		return this.firstname + this.secondname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case StudyProgramPackage.PERSON__SECONDNAME:
				return getSecondname();
			case StudyProgramPackage.PERSON__FULLNAME:
				return getFullname();
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
			case StudyProgramPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case StudyProgramPackage.PERSON__SECONDNAME:
				setSecondname((String)newValue);
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
			case StudyProgramPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case StudyProgramPackage.PERSON__SECONDNAME:
				setSecondname(SECONDNAME_EDEFAULT);
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
			case StudyProgramPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case StudyProgramPackage.PERSON__SECONDNAME:
				return SECONDNAME_EDEFAULT == null ? secondname != null : !SECONDNAME_EDEFAULT.equals(secondname);
			case StudyProgramPackage.PERSON__FULLNAME:
				return FULLNAME_EDEFAULT == null ? getFullname() != null : !FULLNAME_EDEFAULT.equals(getFullname());
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
		result.append(" (Firstname: ");
		result.append(firstname);
		result.append(", Secondname: ");
		result.append(secondname);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
