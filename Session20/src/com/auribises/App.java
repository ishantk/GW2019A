package com.auribises;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class Vaccine{
	
	public String title;
	public String description;
	public int monthsAfterBirth;
	Date vaccinationDate;
	
	public Vaccine(){
		
	}

	public Vaccine(String title, String description, int monthsAfterBirth) {
		this.title = title;
		this.description = description;
		this.monthsAfterBirth = monthsAfterBirth;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		int dd = 20;
		int mm = 1;
		int yy = 2019;
		
		Calendar babyBirthCal = Calendar.getInstance();
		babyBirthCal.set(Calendar.DAY_OF_MONTH, dd);
		babyBirthCal.set(Calendar.MONTH, mm);
		babyBirthCal.set(Calendar.YEAR, yy);
		
		Date babyBirthDate = babyBirthCal.getTime();
		
		Vaccine v1 = new Vaccine("VC1", "This is description1", 1);
		Vaccine v2 = new Vaccine("VC2", "This is description2", 2);
		Vaccine v3 = new Vaccine("VC3", "This is description3", 13);
		
		ArrayList<Vaccine> vaccinations = new ArrayList<Vaccine>();
		vaccinations.add(v1);
		vaccinations.add(v2);
		vaccinations.add(v3);
		
		for (Vaccine v : vaccinations){
			
			Calendar cal = (Calendar)babyBirthCal.clone();
			cal.add(Calendar.MONTH, v.monthsAfterBirth);
			
			v.vaccinationDate = cal.getTime();
			
		}
		
		System.out.println(">> Baby Birth Date is: "+babyBirthDate);
		
		for (Vaccine v : vaccinations){
			System.out.println(">> Vaccination : "+v.title+" due at "+v.vaccinationDate);
		}
		
	}

}
