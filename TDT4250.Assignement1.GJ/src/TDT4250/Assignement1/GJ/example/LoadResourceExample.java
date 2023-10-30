package TDT4250.Assignement1.GJ.example;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import TDT4250.Assignement1.GJ.StudyProgram.Course;
import TDT4250.Assignement1.GJ.StudyProgram.CourseStat;
import TDT4250.Assignement1.GJ.StudyProgram.Fieldofstudy;
import TDT4250.Assignement1.GJ.StudyProgram.Person;
import TDT4250.Assignement1.GJ.StudyProgram.Season;
import TDT4250.Assignement1.GJ.StudyProgram.Semester;
import TDT4250.Assignement1.GJ.StudyProgram.StudyProgramFactory;
import TDT4250.Assignement1.GJ.StudyProgram.Studyprogram;
import TDT4250.Assignement1.GJ.StudyProgram.Year;
import TDT4250.Assignement1.GJ.StudyProgram.*;

public class LoadResourceExample {

	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		resSet.getPackageRegistry().put(StudyProgramPackage.eNS_URI, StudyProgramPackage.eINSTANCE);
		
		// relate the XMI parser to the 'xmi' file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		

		Resource resource = resSet.getResource(URI.createURI(LoadResourceExample.class.getResource("Studyprogram.xmi").toString()), true);
		Studyprogram SP = (Studyprogram) resource.getContents().get(0);
		for (Year year : SP.getYearCoursed()) {
			System.out.println(year);
		}
	}
}
