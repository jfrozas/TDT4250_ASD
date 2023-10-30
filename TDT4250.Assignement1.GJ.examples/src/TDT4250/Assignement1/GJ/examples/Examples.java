package TDT4250.Assignement1.GJ.examples;

import java.util.List;

import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.CourseStat;
import TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy;
import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.Season;
import TDT4250.Assignement1.GJ.StudyProgram.Semester;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;
import TDT4250.Assignement1.GJ.StudyProgram.Studyprogram;
import TDT4250.Assignement1.GJ.StudyProgram.Year;

public class Examples {

	public static void main(String[] args) {

		
		StudyProgramFactory factory = StudyProgramFactory.eINSTANCE;
		
		Person javi = factory.createPerson();
		javi.setFirstname("Javi");
		javi.setSecondname("Fernandez");
		
		Course c = factory.createCourse();
		c.setCode("TDT4250");
		c.setName("ASD");
		c.setCredits((float) 5);
		c.setStatus(CourseStat.COMPULSORY);
		c.setCoordinator(javi);	
		
		Course d = factory.createCourse();
		d.setCode("TDT");
		d.setName("ASD");
		d.setCredits((float) 4);
		d.setStatus(CourseStat.COMPULSORY);
		
		Semester s = factory.createSemester();
		s.setSeason(Season.SPRING);
		s.getCourses().add(c);
		s.getCourses().add(d);

		
		Year y = factory.createYear();
		y.setName(1);
		y.getSemestercoursed().add(s);
		
		Fieldofstudy AI = factory.createFieldofstudy();
		AI.setName("AI");
		AI.getYear().add(y);
		
		Studyprogram CSc = factory.createStudyprogram();
		CSc.setName("CScience");
		CSc.setYearslong(5);
		CSc.setField(AI);
		CSc.getYearCoursed().add(y);
		CSc.getStaff().add(javi);
		
		System.out.println(s.GetTotalCredits(s));
		
		
	}

}
