package loansystems;

import java.util.Scanner;

public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int age;
	static double salary;
	static boolean mStatus;
	static int cibilScore;
	static String aadhaarNo;
	static String mobileNo;
	static String panCard;
	static double rateOfInterest = 10.5;
	static double m1,m2,m3;

	static String getaddress() {
		String add;
		System.out.println("Enter your Plot No");
		int plot = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Buliding Name");
		String building = sc.nextLine();
		System.out.println("Enter Your Street Name");
		String street = sc.nextLine();
		System.out.println("Enter Your Area Name");
		String area = sc.nextLine();
		System.out.println("Enter Your City Name");
		String city = sc.nextLine();
		System.out.println("Enter your Pincode");
		int pin = sc.nextInt();
		add = " Plot No :" + plot + "\n Building Name :" + building + "\n Street Name :" + street + "\n Area Name :"
				+ area + "\n City Name :" + city + "\n PinCode :" + pin;
		return add;
	}
	
	static void setSalDetails() {
		System.out.println("Enter Recent Three Month Salary");
		System.out.print("Month-1 : ");
		m1 = sc.nextDouble();
		System.out.print("Month-2 : ");
		m2 = sc.nextDouble();
		System.out.print("Month-3 : ");
		m3 = sc.nextDouble();
	}
	
	static void getSalDetails() {
		System.out.println("Recent Three Month Salary");
		System.out.print(" Month-1 : "+m1);
		System.out.println();
		System.out.print(" Month-2 : "+m2);
		System.out.println();
		System.out.print(" Month-3 : "+m3);
	}
	
	

	public static void main(String[] args) {
		
		Loan l1 = new Loan();
		System.out.println("Welcome To PelliKavala Personal Loan Banking");
		System.out.println("Enter your Name");
		name = sc.nextLine();
		l1.setName(name);
		System.out.println("Enter your Age");
		age = sc.nextInt();
		l1.setAge(age);
		System.out.println("Enter your Monthly Salary");
		salary = sc.nextDouble();
		l1.setSalary(salary);
		System.out.println("Maritual Status enter true or false");
		mStatus = sc.nextBoolean();
		l1.setmStatus(mStatus);
		System.out.println("Enter Your Cibil Score");
		cibilScore = sc.nextInt();
		l1.setCibilScore(cibilScore);
		System.out.println("Enter your 12 digit Aadhaar Number");
		aadhaarNo = sc.next();
		l1.setAadhaarNo(aadhaarNo);
		System.out.println("Enter Your Mobile Number");
		mobileNo = sc.next();
		l1.setMobileNo(mobileNo);
		System.out.println("Enter Your PanCard Number");
		panCard = sc.next();
		l1.setPanCard(panCard);
		if (l1.getSalary() >= 50000 && 
				l1.getAge() >= 21 && 
				l1.getCibilScore() >= 750) {
			System.out.println(" You Are Eligible for Personal Loan");
			System.out.println("The Rate of Interest For the Loan is:"+rateOfInterest);
		}else {
			System.out.println("Sorry ! You are not Eligible For Loan Criteria");
		}
		l1.setAddress(getaddress());
		setSalDetails();
		l1.printCustDetails();
		getSalDetails();
		
	}



	
}
