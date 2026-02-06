package com.interfaces;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow Bow !!");
	}

	@Override
	public void sleep() {
		System.out.println("Dogs are active at nights");
	}

	@Override
	public void eat() {
		System.out.println("Dogs eat very quickly");
	}
	
	public void breed() {
		System.out.println("German Shepherd ");
	}

}
