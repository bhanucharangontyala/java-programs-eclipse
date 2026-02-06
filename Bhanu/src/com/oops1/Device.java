package com.oops1;

public class Device {
	public Boolean power = false;
	public void turnOn() {
		if (this.power == false) {
			this.power = true;
		}
	}

	public void turnOff() {
		if (this.power == true) {
			this.power = false;
		}
	}

	public boolean isPowerOn() {
		boolean status = false;
		if (this.power == true) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
}

