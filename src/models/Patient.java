package models;

public class Patient {

	private String name;
	private String lastName;
	private int ID;
	private int medicalRecordNumber;
	private Doctor doctor;
	
	public Patient(String name1, String lastName1, int ID1, int medicalRecordNumber1, Doctor doctor1){
		this.name = name1;
		this.lastName = lastName1;
		this.ID = ID1;
		this.medicalRecordNumber = medicalRecordNumber1;
		this.doctor = doctor1;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getMedicalRecordNumber() {
		return medicalRecordNumber;
	}

	public void setMedicalRecordNumber(int medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
