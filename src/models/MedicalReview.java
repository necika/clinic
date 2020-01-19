package models;

public class MedicalReview {
	private String date;
	private String time;
	private Patient patient = null;
	
	public MedicalReview(String date1, String time1){
		this.date = date1;
		this.time = time1;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
