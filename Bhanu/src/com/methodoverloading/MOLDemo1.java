package com.methodoverloading;

public class MOLDemo1 {
	public static void display(int a, float b) {
		System.out.println("Display method is called with two int args" + a + " " + b);
	}

	public static void display(double a, double b) {
		System.out.println("Display method is called with one double one int args" + a + " " + b);
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, float b) {
		return (int)(a + b);
	}
	// creates ambiguity when int,float and float,int are available.
	static int add(float a, int b) {
		return (int)(a + b);
	}
	
	static double add(float a, double b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}


	public static void main(String[] args) {
		display(100, 20.f);
		add(4,4.3);
		add(10,20);
	}

}
