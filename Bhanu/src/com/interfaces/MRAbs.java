package com.interfaces;

//we use abstract class to implement dummy methods.  
public abstract class MRAbs implements MallaReddy {

	public abstract double fees();

	public abstract String clgCode();

	public abstract int placements();

	public String Director() {
		return " MALLANA ";
	}

	@Override
	public void library() {

	}

	@Override
	public void playground() {

	}

	@Override
	public void canteen() {

	}

	@Override
	public void auditorium() {

	}

	@Override
	public int noOfBlocks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String NAAC() {
		// TODO Auto-generated method stub
		return null;
	}

}
