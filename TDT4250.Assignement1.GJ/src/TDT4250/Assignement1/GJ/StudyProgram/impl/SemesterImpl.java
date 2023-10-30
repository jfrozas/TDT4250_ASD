/**
 */
package TDT4250.Assignement1.GJ.StudyProgram.impl;

import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.Season;
import TDT4250.Assignement1.GJ.StudyProgram.Semester;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramPackage;

import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link TDT4250.Assignement1.GJ.StudyProgram.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final Season SEASON_EDEFAULT = Season.AUTUMN;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected Season season = SEASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, StudyProgramPackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		Season oldSeason = season;
		season = newSeason == null ? SEASON_EDEFAULT : newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramPackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float GetTotalCredits(Semester semester) {
		float TotalCredits = 0;
		
		for (Course course : semester.getCourses()) {
			TotalCredits = TotalCredits + course.getCredits();		
		}

		return TotalCredits;
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramPackage.SEMESTER__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case StudyProgramPackage.SEMESTER__COURSES:
				return getCourses();
			case StudyProgramPackage.SEMESTER__SEASON:
				return getSeason();
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
			case StudyProgramPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyProgramPackage.SEMESTER__SEASON:
				setSeason((Season)newValue);
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
			case StudyProgramPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case StudyProgramPackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
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
			case StudyProgramPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyProgramPackage.SEMESTER__SEASON:
				return season != SEASON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StudyProgramPackage.SEMESTER___GET_TOTAL_CREDITS__SEMESTER:
				return GetTotalCredits((Semester)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
