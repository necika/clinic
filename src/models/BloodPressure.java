package models;

public class BloodPressure extends MedicalReview {
	private double upperValue;
	private double lowerValue;
	private int pulse;
	
	public BloodPressure(String date1, String time1, double upperValue, double lowerValue, int pulse) {
		super(date1, time1);
		this.upperValue = upperValue;
		this.lowerValue = lowerValue;
		this.pulse = pulse;
	}

	public double getUpperValue() {
		return upperValue;
	}

	public void setUpperValue(double upperValue) {
		this.upperValue = upperValue;
	}

	public double getLowerValue() {
		return lowerValue;
	}

	public void setLowerValue(double lowerValue) {
		this.lowerValue = lowerValue;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	
	public void medicalReview(){
		System.out.println(super.getPatient().getName()+"-> Upper value: "+upperValue+ " | Lower value: "+lowerValue + " | Pulse : "+pulse);
	}
	
}
