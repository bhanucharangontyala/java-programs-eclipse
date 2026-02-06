package com.oops1;

public class StudentInput {

	public static void main(String[] args) {
		StudentFees obj = new StudentFees(1001, "Bhanu Charan",240000,120000);
		
//		obj.setStudentDetails(1001, "Bhanu Charan",240000);
//		obj.setPaidFees(120000);
		obj.displayFeeStatus();
	}

}
