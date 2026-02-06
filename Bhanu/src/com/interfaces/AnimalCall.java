package com.interfaces;

public class AnimalCall {

	public static void main(String[] args) {

		// this helps to achieve the abstraction it does not show implementation
		// directly
		System.out.println("Dog Information --------");
		Animal d = new Dog();
//		Dog d = new Dog();//normal creating objects
//		when we try to see the implementation we are redirected to interface method 
		// which is abstract
		// but when we run it will execute the method in the child class
		// it performs its functionalities
		d.eat();
		d.sound();
		d.sleep();
		d.print();
		System.out.println(Animal.x + Animal.y);

		System.out.println("Cat Information");
		AbsAnimal c = new Cat();
		c.eat();
		c.sound();
		c.sleep();
		c.eyes();

	}

}
