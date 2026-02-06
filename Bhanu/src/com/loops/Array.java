package com.loops;

class A{
	void show() {
		System.out.println("hii A");
	}
}

class B extends A{
	void show() {
		System.out.println("hii B");
	}
}

class C extends B{
	void show() {
		System.out.println("hii C");
	}
}

public class Array {

	public static void main(String[] args) {
		A obj = new C();
		obj.show();
		
	}
	

}
