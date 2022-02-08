package com.cg.patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.patient.service.PatientService;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		PatientService patient=context.getBean(PatientService.class);
		patient.getPatientDetails();
		
		
		
		
	
	}
}
