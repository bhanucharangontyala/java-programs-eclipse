package com.oops1;

public class StudentFees {
	private int stdId;
	private String stdName;
	private int courseId = 101;
	private int totalFees;
	private int paidFees;
	private int remain = 0;
	
	public StudentFees(int stdId, String stdName, int totalFees,int paidFees) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.totalFees = totalFees;
		this.paidFees = paidFees;
	}

	public void setStudentDetails(int stdId, String stdName, int totalFees) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.totalFees = totalFees;
	}

	public void setPaidFees(int paidFees) {
		this.paidFees = paidFees;
	}

	public int getRemainingFees() {
		remain = totalFees - paidFees;
		return remain;
	}

	public void displayFeeStatus() {
		System.out.println("Student ID :" + stdId);
		System.out.println("Student Name :" + stdName);
		System.out.println("Student CourseId:" + courseId);
		System.out.println("TotalFees :" + totalFees);
		System.out.println("PaidFees :" + paidFees);
		System.out.println("Remaining Fees :" + getRemainingFees());
	}
}
