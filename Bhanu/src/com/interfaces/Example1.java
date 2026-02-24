package com.interfaces;

public interface Example1 {
	public default void a() {
		System.out.println("AS");
	}
	
	public static void b() {
		System.out.println("bS");
	}
	
}

interface Example2 extends Example1 {
//	public static void a() {
//		System.out.println("AS");
//	}
	
	public default void b() {
		System.out.println("bS");
	}
	
}
