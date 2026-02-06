package com.oops1;

class A {
	int x = 10;

	void show() {
		System.out.println("Hello A");
	}

	A() {
		System.out.println("Parent class Constructor");
	}
}

class B extends A {
	B() {
//		super(); here even though wee not write the super() it will implicitly call 
//				 the super().
		System.out.println("Child class Constructor");
	}
}

public class TypesOfInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		System.out.println(obj.x);
	}

}
