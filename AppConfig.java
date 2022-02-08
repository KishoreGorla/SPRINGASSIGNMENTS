package com.cg.patient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.parent.model.Patient;
import com.cg.patient.service.PatientService;
@Configuration
public class AppConfig {
	
	
	@Bean
	public Patient setPatientDetails()
	{
		Patient k=new Patient();
		k.setPid("P45");
		k.setPname("patient");
		k.setAge(45);
		k.setDisease("fever");
		k.setSex("male");
		k.setAdmit_status("yes");
		
		
		return k;
		
		
	}
	@Bean
	public PatientService setPatientService()
	{
		PatientService kk=new PatientService();
		kk.setPatient(setPatientDetails());
		return kk;
	}

}
