package com.cg.patient.service;

import com.cg.parent.model.Patient;

import org.springframework.stereotype.Component;



public class PatientService {
	
	private Patient patient;
	
	
	public Patient getPatient()
	{
		return patient;
		
	}
	
	public void setPatient(Patient patient)
	{
		this.patient=patient;
	}
	
public void getPatientDetails()
{
	System.out.println("patient id : "+patient.getPid());
	System.out.println("patient id : "+patient.getPname());
	System.out.println("patient id : "+patient.getDisease());
	System.out.println("patient id : "+patient.getSex());
	System.out.println("patient id : "+patient.getAdmit_status());
	System.out.println("patient id : "+patient.getAge());
	
	
}
	
	
	
	
}
