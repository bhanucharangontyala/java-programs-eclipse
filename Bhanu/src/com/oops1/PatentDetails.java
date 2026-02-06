package com.oops1;

public class PatentDetails {

	public static void main(String[] args) {
		Hospital p1 = new Hospital();
		p1.setPatientDetails(101, "Bhanu Charan", 10, 1000, 4500);
		p1.calculateBill();
		p1.calculateDiscount();
		p1.displayBill();
	}

}
