package com.deepandshallow;

class Employee implements Cloneable{
	int empno;
	String ename;
	Address add;

	public Employee(int empno, String ename, Address add) {
		this.empno = empno;
		this.ename = ename;
		this.add = add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;
	int pincode;

	public Address(String city, int pincode) {
		this.city = city;
		this.pincode = pincode;
	}

}

public class ShallowCopy {
	// - Shallow copy is used when we required when we want to reflect the changes 
	//   to all when we update a value to one member
	// - in this the object data is sharable in between the classes 
	// - Shallow copy creates a new object, but it copies only references of nested
	//   objects, not the actual nested objects.

	public static void main(String[] args) throws CloneNotSupportedException{
		Address ad = new Address("Hyderabad", 500072);
		Employee e1 = new Employee(101, "Bhanu Charan", ad);
		Employee e2 = (Employee) e1.clone();
		
		System.out.println(e1.empno);
		System.out.println(e1.ename);
		System.out.println(e1.add.city);
		System.out.println(e1.add.pincode);
		
		e2.add.city = "Banglore";
		System.out.println(e1.add.city);	
		System.out.println(e2.add.city);	
	}

}
