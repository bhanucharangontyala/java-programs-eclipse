package loansystems;

import java.util.regex.Pattern;

public class Loan {
	private String name;
	private int age;
	private double salary;
	private boolean mStatus;
	private int cibilScore;
	private String aadhaarNo;
	private String mobileNo;
	private String panCard;
	private String address;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean ismStatus() {
		return mStatus;
	}

	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		String aadharRegex = "^[6-9][0-9]{11}$";
		if (Pattern.matches(aadharRegex, aadhaarNo)) {
			this.aadhaarNo = aadhaarNo;
		} else {
			System.out.println("Invalid Aadhaar Number");
		}
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		String mobRegex = "[6-9][0-9]{9}";
		if (Pattern.matches(mobRegex, mobileNo)) {
			this.mobileNo = mobileNo;
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		String panRegex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		if (Pattern.matches(panRegex, panCard)) {
			this.panCard = panCard;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printCustDetails() {
		System.out.println(" Name :" + name);
		System.out.println(" Age :" + age);
		System.out.println(" Salary :" + salary);
		System.out.println(" Maritual Status :" + mStatus);
		System.out.println(" Cibil Score :" + cibilScore);
		System.out.println(" Aadhaar Number :" + aadhaarNo);
		System.out.println(" Mobile Number :" + mobileNo);
		System.out.println(" Pancard Numberr :" + panCard);
		System.out.println(" Address :" + address);
	}

}
