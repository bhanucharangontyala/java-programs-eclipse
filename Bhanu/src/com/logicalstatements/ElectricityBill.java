package com.logicalstatements;

public class ElectricityBill {
	String customerName;
	double units;
	double billAmount = 0;

	ElectricityBill(String cName, double units) {
		this.customerName = cName;
		if (units > 500) {
			this.billAmount = units * 6.0;
		} else if (units > 300 & units <= 500) {
			this.billAmount = units * 4.0;
		} else if (units > 100 & units <= 300) {
			this.billAmount = units * 2.5;
		} else if (units > 0 & units <= 100) {
			this.billAmount = units * 1.5;
		} else {
			System.out.println("enter correct units");
		}
	}

	ElectricityBill(String cName) {
		this.customerName = cName;
		System.out.println("No Consumption Recorded");
	}

	void displayBill() {
		System.out.println("Customer Name :" + customerName);
		if (billAmount > 2000) {
			billAmount = billAmount - (billAmount * 0.1);
			System.out.println("Bill AMount is :" + billAmount);
		} else {
			System.out.println("Bill Amount is : " + billAmount);
		}
	}

	public static void main(String[] args) {
		ElectricityBill e1 = new ElectricityBill("charan", 600);
		e1.displayBill();
		ElectricityBill e2 = new ElectricityBill("Bhanu");
		e2.displayBill();
	}

}
