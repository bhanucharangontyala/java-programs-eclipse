package com.oops1;

public class Ticket {
	private String ticketType;
	private double price;
	
	public Ticket(String ticketType, double price) {
		this.ticketType = ticketType;
		this.price = price;
	}

	public String getTicketType() {
		return ticketType;
	}

	public double getPrice() {
		return price;
	}
}
