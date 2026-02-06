package com.testpractice;

//import java.util.Arrays;

//1.
//class Ride {
//	void fare(int a) {
//		System.out.println("Int fare");
//	}
//}
//
//class CarRide extends Ride {
//	void fare(double a) {
//		System.out.println("Double fare");
//	}
//}

//2.
//class P{
//	String name = "Parent";
//}
//
//class C extends P{
//	String name = "Child";
//	void show() {
//		System.out.println(name);
//		System.out.println(super.name);
//	}
//}

//3.
//class Driver{
//	void ride() {
//		System.out.println("Normal Ride");
//	}
//}
//
//class AutoDriver extends Driver{
//	@Override
//	void ride() {
//		System.out.println("Auto Ride");
//	}
//	void special() {
//		System.out.println("Special Auto");
//	}
//}

//4.
//interface A {
//	void show();
//}
//
//interface B {
//	void show();
//}
//
//class C implements A, B {
//	@Override
//	public void show() {
//		System.out.println("One show ? Two Show ?");
//	}
//
//}

//5.
//class P {
//	P() {
//		display();
//	}
//
//	void display() {
//		System.out.println("P Display");
//	}
//}
//
//class Q extends P {
//	Q() {
//		System.out.println("Q");
//	}
//
//	@Override
//	void display() {
//		System.out.println("Q Display");
//	}
//}

public class Test_3_1_26 {

	public static void main(String[] args) {
		// 1.
//		Ride r = new CarRide();
//		r.fare(5);

		// 2.
//		C c = new C();
//		c.show();

		// 3.
//		Driver d = new AutoDriver();
//		d.special();//compile time error

		// 5.
//		new Q();

		// java Question
//		int[] arr = { 1, 7, 3, 5, 9, 8 };
//		Arrays.sort(arr);
//		int[] res = new int[10];
//		for (int i = 1; i < 10; i++) {
//			boolean find = false;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == i) {
//					find = true;
//					break;
//				}
//			}
//			if(!find) {
//				System.out.print(i + " ");
//			}
//		}

//		for (int n : res) {
//			System.out.print(n + " ");
//		}
	}

}
