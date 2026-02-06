package com.interfaces;

public class Cat extends AbsAnimal implements Animal {
	@Override
	public void eat() {
		System.out.println("Cat eats with eyes closed");
	}

	@Override
	public void eyes() {
		System.out.println("Cat Eyes are Blue");
	}
}
