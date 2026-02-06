package com.excceptionhandling;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Woof!");
    }
    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

public class Exception4 {

	public static void main(String[] args) {
		//ClassCastException
		// when we try to cast the objects that are not the instance of a 
		// class then we get ClassCastException
		System.out.println("main method started");
		Animal obj = new Animal();
		// here animal is the obj and dog is instance of animal 
		// but animal is not instance of dog
		try {
			Dog obj1 = (Dog)obj;
			System.out.println(obj1.hashCode());
		}catch(ClassCastException e) {
			System.err.println("In Catch");
		}
		
		
		System.out.println("main method ended");
	}

}
