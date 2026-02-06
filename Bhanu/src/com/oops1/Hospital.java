package com.oops1;

public class Hospital {
	private int patientId;
	private String name;
	private double daysAdmitted;
	private double dailyCharges;
	private double medicines;
	private double bill;

	public void setPatientDetails(int patientId, String name, double daysAdmitted, double dailyCharges, double medicines) {
		this.dailyCharges = dailyCharges;
		this.daysAdmitted = daysAdmitted;
		this.patientId = patientId;
		this.name = name;
		this.medicines = medicines;
	}

	public double calculateBill() {
		bill = (getDailyCharges() * getDaysAdmitted()) + getMedicines();
		return bill;
 	}

	public double calculateDiscount() {
		if (getDaysAdmitted() >= 10) {
			return bill -= (bill * 0.10);
			
		} else if (getDaysAdmitted() == 5) {
			return bill -= (bill * 0.05);
		} else {
			return bill;
		}
	}

	public void displayBill() {
		System.out.println("----------------------------");
		System.out.println(" PatientId :"+getPatientId());
		System.out.println(" Patient Name :"+getName());
		System.out.println(" Days Admitted :"+getDaysAdmitted());
		System.out.println(" Daily Charges :"+getDailyCharges());
		System.out.println(" Medicines Charges :"+ getMedicines());
		System.out.println(" The Total Bill :"+calculateBill());
		System.out.println(" Discounted price :"+calculateDiscount());
	}

	public String getName() {
		return name;
	}

	public double getDaysAdmitted() {
		return daysAdmitted;
	}

	public double getDailyCharges() {
		return dailyCharges;
	}

	public double getMedicines() {
		return medicines;
	}

	public int getPatientId() {
		return patientId;
	}
	

}
