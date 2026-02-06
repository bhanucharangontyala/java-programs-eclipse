package loansystems;

import java.util.Scanner;

public class GoldLoan extends Loan {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static int age;
	static String add;
	static boolean mStatus;
	static String aadhaarNo;
	static String mobileNo;
	static String panCard;
	static double rateOfInterest = 9.5;
	static double actualGold;

	static String getaddress() {
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

	static void setGoldDetails() {
		double orn;
		System.out.println("Enter the weight of Ornaments");
		orn = sc.nextDouble();
		actualGold = orn * 0.8;
	}

	static void getGoldDetails() {
		System.out.println("Enter the weight of Actual gold is :" + (float) actualGold);
		System.out.println("The Current loan Amount For 10 Gram of Gold is : 90000");
		System.out.println("the Loan amount For actual Gold is :" + (int) ((actualGold / 10) * 90000));
		System.out.println("The Annual Rate of Interest For Gold Loan is :" + rateOfInterest);
	}

	@Override
	public void printCustDetails() {
		System.out.println(" Name :" + name);
		System.out.println(" Age :" + age);
		System.out.println(" Maritual Status :" + mStatus);
		System.out.println(" Aadhaar Number :" + aadhaarNo);
		System.out.println(" Mobile Number :" + mobileNo);
		System.out.println(" Pancard Numberr :" + panCard);
	}

	public static void main(String[] args) {
		Loan l1 = new Loan();
		System.out.println("Welcome To Dream Gold Loan Banking");
		System.out.println("Enter your Name");
		name = sc.nextLine();
		l1.setName(name);
		System.out.println("Enter your Age");
		age = sc.nextInt();
		l1.setAge(age);
		System.out.println("Maritual Status enter true or false");
		mStatus = sc.nextBoolean();
		l1.setmStatus(mStatus);
		System.out.println("Enter your 12 digit Aadhaar Number");
		aadhaarNo = sc.next();
		l1.setAadhaarNo(aadhaarNo);
		System.out.println("Enter Your Mobile Number");
		mobileNo = sc.next();
		l1.setMobileNo(mobileNo);
		System.out.println("Enter Your PanCard Number");
		panCard = sc.next();
		l1.setPanCard(panCard);
		l1.setAddress(getaddress());
		setGoldDetails();
		Loan l2 = new GoldLoan();
		l2.printCustDetails();
		System.out.println(l1.getAddress());
		getGoldDetails();
	}
}
