package com.deepandshallow;

class Student {
	int rollNo;
	String name;
	Address1 address;

	public Student(int rollNo, String name, Address1 address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public Student(Student std) {
		this.rollNo = std.rollNo;
		this.name = std.name;
		this.address = new Address1(std.address);
		// this is helps in the deep copy
	}
}

class Address1 {
	String city;
	int pincode;

	public Address1(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}

	public Address1(Address1 address) {
		this.city = address.city;
		this.pincode = address.pincode;
	}

}

public class DeepCopy {
	/*- Deep copy is the process of copying the data of one object into another 
	 * object by creating a new object, usually using a copy constructor.
	  - In deep copy, whenever a new object is created using a copy constructor, 
	    all data members—including reference-type members—are copied into new 
	    memory locations, so the object references are not shared.
	  - Any changes made to the data members of the copied object do not affect 
	    the original object, because both objects refer to different memory 
	    locations.
	  - We use deep copy when we want to protect the original object’s data from 
	    being modified while creating a new object.*/
	public static void main(String[] args) {
		Address1 add1 = new Address1("Hyderabad", 500072);
		Student std = new Student(101, "Bhanu Charan", add1);
		Student std1 = new Student(std);
		System.out.println(std.rollNo);
		System.out.println(std.name);
		System.out.println(std.address.city);
		System.out.println(std.address.pincode);
		System.out.println("*******************");
		System.out.println(std1.rollNo);
		System.out.println(std1.name);
		System.out.println(std1.address.city);
		System.out.println(std1.address.pincode);
		System.out.println("*********************");
		std1.address.city = "Nizambad";
		System.out.println(std.address.city);
		System.out.println(std1.address.city);

	}
}
