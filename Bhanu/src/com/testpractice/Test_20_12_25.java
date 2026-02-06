package com.testpractice;
//1.

//class Student{
//	private int marks =90;
//	public int getMarks() {
//		return marks;
//	}
//}

//2.
//class Parent {
//	protected int x =20;
//}
//class Child extends Parent{
//	void show() {
//		System.out.println(x);
//	}
//}

//3.
//private class A{
//	
//}

//5.
class Parent {
	Parent() {
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Child Constructor");
	}
}

public class Test_20_12_25 {

	public static void main(String[] args) {
		// 1.
//		Student s1 = new Student();
//		System.out.println(s1.getMarks());
		// 2.
//		Child c= new Child();
//		c.show();
		// 5.
//		new Child();// In Inheritance If we call child class 
//		Constructor the Parent class Constructor also called 

//		java
//		int n = 5;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				if (j % 2 == 0) {
//					System.out.print("1");
//				} else {
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
	}

}
