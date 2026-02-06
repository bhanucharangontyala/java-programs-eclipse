package com.oops1;

public class TicketMachine {

	boolean isValid(Ticket t) {
		boolean flag = false;
		if ((t.getTicketType().equalsIgnoreCase("bus") || t.getTicketType().equalsIgnoreCase("train")
				|| t.getTicketType().equalsIgnoreCase("flight")) && (t.getPrice() > 100 && t.getPrice() < 5000)) {
			return true;
		}
		return flag;
	}

	void displayDetails(Ticket t) {
		if (isValid(t)) {
			System.out.println("Ticket Type is : " + t.getTicketType());
			System.out.println("Ticket Price is : " + t.getPrice());
		} else {
			System.out.println("Invalid Ticket Type or Price");
		}
	}

	void calculateTotal(Ticket t, int num) {
		if (isValid(t)) {
			System.out.println("Price is : " + (t.getPrice() * num));
		} else {
			System.out.println("Invalid Ticket Type or Price");

		}
	}

	public static void main(String[] args) {
//		Ticket t = new Ticket("Car", 1000);
		Ticket t = new Ticket("bus",1500);
		TicketMachine tm = new TicketMachine();
		tm.displayDetails(t);
		tm.calculateTotal(t, 3);
	}

}
