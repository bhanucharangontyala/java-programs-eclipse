package com.interfaces;

public class MRCE extends MRAbs {

	@Override
	public void library() {
		System.out.println("MRCE has Library of Two Floors");
	}

	@Override
	public void playground() {
		System.out.println("MRCE Doesnot Have Nice Ground");
	}

	@Override
	public void canteen() {
		System.out.println("MRCE Canteen Food is Not Up to the Mark");
	}

	@Override
	public void auditorium() {
		System.out.println("MRCE Doesnot Have the Nice Auditorium");
	}

	@Override
	public int noOfBlocks() {
		return 5;
	}

	@Override
	public String NAAC() {
		return " B+ ";
	}

	@Override
	public double fees() {
		return 130000;
	}

	@Override
	public String clgCode() {
		return " Q9 ";
	}

	@Override
	public int placements() {
		return 500;
	}

}