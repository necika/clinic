package models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private String name;
	private String lastName;
	private String specialty;
	private List <Patient> patients;
	
	public Doctor(String name1, String lastname1, String specialty1){
		this.name = name1;
		this.lastName = lastname1;
		this.specialty = specialty1;
		this.patients = new ArrayList<>() ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	public void scheduling(Patient patientt, MedicalReview MR){
		if(patientt == null || MR == null){
			System.out.println("Patient or Medical review can't be null!");
		}
		else{
			System.out.println(patientt.getName() + " scheduled medical review in " + MR.getDate() + " " + MR.getTime());
			MR.setPatient(patientt);
		}
	}
}
