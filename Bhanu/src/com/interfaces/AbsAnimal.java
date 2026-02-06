package com.interfaces;

public abstract class AbsAnimal implements Animal {

	@Override
	public void sound() {
		System.out.println("Animal sound from Abstract class");
	}

	@Override
	public void sleep() {
		System.out.println("Animal sleep from abstract class");
	}

	@Override
	public void eat() {
		System.out.println("Animal eat from abstract class");
	}

	public abstract void eyes();

}
