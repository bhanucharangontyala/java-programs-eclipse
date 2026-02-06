package com.interfaces;

public class Colleges {

	public static void main(String[] args) {
		System.out.println("Inforamtion about Mallareddy College");
		MRAbs c1 = new MRCE();
		c1.auditorium();
		c1.canteen();
		c1.CEO();
		c1.library();
		c1.playground();
		System.out.println(c1.clgCode());
		System.out.println(c1.Director());
		System.out.println(c1.fees());
		System.out.println(c1.NAAC());
		System.out.println(c1.noOfBlocks());
		System.out.println(c1.placements());
		MallaReddy.clgName();
		System.out.println(MallaReddy.Area);
		
		System.out.println();
		
		System.out.println("Inforamtion about Mallareddy College");
		MRAbs c2 = new MRCET();
		c2.auditorium();
		c2.CEO();
		c2.playground();
		System.out.println(c2.clgCode());
		System.out.println(c2.Director());
		System.out.println(c2.fees());
		System.out.println(c2.NAAC());
		System.out.println(c2.noOfBlocks());
		System.out.println(c2.placements());
		MallaReddy.clgName();
		System.out.println(MallaReddy.Area);
	}

}
