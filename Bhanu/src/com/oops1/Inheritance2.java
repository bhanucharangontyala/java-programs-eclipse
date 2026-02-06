package com.oops1;

class ClassRoom {
	void details() {
		System.out.println("You are in the class room");
	}

}

public class Inheritance2 extends ClassRoom {
	// their are four ways we can create objects in an inherited class
	@Override
	void details() {
		System.out.println("Your classroom changed to inheritance");
	}
	public static void main(String[] args) {
		// case - 1: child object for child reference variable
		// by using this we can use functionalities from both parent and child
		Inheritance2 obj = new Inheritance2();
		obj.details();
		// case - 2: parent object with parent reference variable
		// by using this we can only use the functionalities of parent
		// because child is created from parent but parent is not created from anything
		// but
		// Object class
		ClassRoom obj1 = new ClassRoom();
		obj1.details();
		// case - 3: child object with parent reference variable
		// by this we can only use Parent class functionalities
		// this process is called Up-Casting
		// java support Up-Casting
		// we use when we want to execute the methods that are overidden from parent
		// class
		// this process is call "Dynamic Method Dispatching"
		// we use this when we want to modify the method functionalities from parent
		// with
		// same name
		// JVM decides which method to execute at runtime, based on the object, not
		// reference.
		ClassRoom c1 = new Inheritance2();
		c1.details();
		// case - 4: child reference variable with parent object
		// this process is called Down-Casting
		// Java Does not Support Down-Casting
		// because Parent object cannot behave like a child
		// we can write code without Compile time error by Casting the object
		// but when we try to use the object we get runtime Exception is
		// "ClassCastException"
//		Inheritance2 i1 = (Inheritance2)new ClassRoom();

	}

}
