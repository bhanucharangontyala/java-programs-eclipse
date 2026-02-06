package com.interfaces;

public class MRCET extends MRAbs {

	@Override
	public void playground() {
		System.out.println("MRCET Does Have Nice Ground");
	}

	@Override
	public void auditorium() {
		System.out.println("MRCET Does Have the Nice Auditorium");
	}

	@Override
	public int noOfBlocks() {
		return 7;
	}

	@Override
	public String NAAC() {
		return " A+++ ";
	}

	@Override
	public double fees() {
		return 230000;
	}

	@Override
	public String clgCode() {
		return " L3 ";
	}

	@Override
	public int placements() {
		return 1300;
	}
}
