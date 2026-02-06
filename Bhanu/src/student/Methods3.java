package student;

import java.util.Scanner;

//16-10-2025
//Calling all methods without return type and with arguments 
//taking input using Scanner class
//taking input from the Scanner class of emp Details and sending the input as 
//argument for the methods and representing the information in method
//executing byte, short, int, long, float, double, boolean, String
public class Methods3 {
	static Scanner sc = new Scanner(System.in);

	void empId(int id) {
		System.out.println("Employee Id :" + id);
	}

	void empName(String name) {
		System.out.println("Employee Name :" + name);
	}

	void empAge(byte age) {
		System.out.println("Employee Age :" + age);
	}

	void empH(float height) {
		System.out.println("Employee Height :" + height);
	}

	void empW(double weight) {
		System.out.println("Employee Weight :" + weight);
	}

	void empNo(long phno) {
		System.out.println("Employee Address : " + phno);
	}

	void empMStatus(boolean mStatus) {
		System.out.println("Employee Maritual Status :" + mStatus);
	}

	void empG(char gender) {
		System.out.println("Employee Gender :" + gender);
	}

	void empAdd(String address) {
		System.out.println("Employee Address : " + address);
	}

	void empPincode(short pin) {
		System.out.println("Employee Pincode :" + pin);
	}

	void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter Employee ID");
		// for Int
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name");
		// for String in one Line
		String name = sc.next();
		System.out.println("Enter Age ");
		// for byte
		byte age = sc.nextByte();
		System.out.println("Enter Height ");
		// For float
		float height = sc.nextFloat();
		System.out.println("Enter Weight");
		// for double
		double weight = sc.nextDouble();
		System.out.println("Enter Gender");
		// for char
		char gender = sc.next().charAt(0);// for inputing char we have use two methods
		// using the concept called method chaining
		System.out.println("Enter Mobile Number");
		//for long
		long phNo = sc.nextLong();
		System.out.println("Enter Maritual Status");
		// for boolean
		boolean marStatus = sc.nextBoolean();
		System.out.println("Enter Address");
		// for string in another line
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Enter Pincode");
		//for short
		short pincode = sc.nextShort();
		empId(empId);
		empName(name);
		empAge(age);
		empH(height);
		empW(weight);
		empG(gender);
		empNo(phNo);
		empMStatus(marStatus);
		empAdd(address);
		empPincode(pincode);
		
	}

}
