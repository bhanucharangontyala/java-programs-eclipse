package com.oops1;	

public class SmartDevice extends Device {

	void useDevice() {
		if (isPowerOn()) {
			System.out.println("the device is working");
		} else {
			System.out.println("Please turn on the Device ");
		}
	}

	public static void main(String[] args) {
		SmartDevice obj = new SmartDevice();
		obj.turnOn();
		obj.turnOff();
		obj.useDevice();

	}
}