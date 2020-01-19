package app;

import models.BloodPressure;
import models.Doctor;
import models.Patient;
import models.SugarLevel;

public class App {

	public static void main(String[] args) {
		
		Doctor Milan = new Doctor("Milan", "Milanovic","Oftamolog");
		Patient Dragan = new Patient("Dragan", "Dragic", 1000 , 28, Milan);
		SugarLevel sG = new SugarLevel("12.1.2020.", "11:00h",5.5,"07:00h");
		Milan.scheduling(Dragan, sG);
		BloodPressure bP = new BloodPressure("21.3.2020.","08:00h",130,90,72);
		Milan.scheduling(Dragan, bP);
		sG.medicalReview();
		bP.medicalReview();
		
		
	}

}
