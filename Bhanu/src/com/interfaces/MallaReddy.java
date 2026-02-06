package com.interfaces;

public interface MallaReddy {

	String Area = "Maisammaguda";

	void library();

	void playground();

	void canteen();

	void auditorium();

	int noOfBlocks();

	String NAAC();

	default void CEO() {
		System.out.println("CEO is Malla Reddy");
		chiefGuest();
	}

	static void clgName() {
		System.out.println("All the colleges names are start with Malla Reddy");
	}

	private void chiefGuest() {
		System.out.println("For Every Event he is the Chief Guest");
	}
}
