package com.interfaces;

public interface Animal {
	// up to java 1.7
	// all variables are public static and final
	// but still there is no change in variables they are same as earlier
	public static final int x = 10;
	int y = 20;

	// all methods are public abstract
	public abstract void sound();

	public abstract void sleep();

	public abstract void eat();
	// when a class extends the interface it should implement the all of
	// abstract methods

	// from java 1.8
	// we get default methods to achieve backward compatibility
	default void print() {
		System.out.println("print method is calling");
	}

	// we got static methods to provide constant behavior
	static void hii() {
		System.out.println("Hii how are you");
	}

	// from java 1.9
	// they have introduced private methods in order to eliminate the duplications
	// from multiple default methods
//	private void name() {
//		System.out.println("Tell me your name");
//	}

}
