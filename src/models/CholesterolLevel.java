package models;

public class CholesterolLevel extends MedicalReview{
	private double value;
	private String lastMealTime;
	
	public CholesterolLevel(String date1, String time1, double value, String lastMealTime) {
		super(date1, time1);
		this.value = value;
		this.lastMealTime = lastMealTime;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getLastMealTime() {
		return lastMealTime;
	}
	public void setLastMealTime(String lastMealTime) {
		this.lastMealTime = lastMealTime;
	}
}
