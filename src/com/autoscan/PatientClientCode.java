package com.autoscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientClientCode {

	public static void main(String[] args) {
		// ApplicationContext only checks if <context:component-scan> is stated in the configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Patient patient = (Patient)context.getBean("patient");
		System.out.println("Patient Name - " +patient.getPatientName() +
				"\nPatient Age - " +patient.getAge() +
				"\nPatient Case - " +patient.getPatientCase() +
				"\nPhysician Name - " +patient.getPhysician().getPhysName() +
				"\nPhysician Id - " +patient.getPhysician().getPhysId() +
				"\nPhysician Dept - " +patient.getPhysician().getPhysDept());
		System.out.println("\nExplicit Bean Naming while declaring a @Component");
		Physician physician = (Physician)context.getBean("hakimeNesh");
		System.out.println("\nDoctor Name - "+physician.getPhysName());
		
			((AbstractApplicationContext)context).close();
	}

}
