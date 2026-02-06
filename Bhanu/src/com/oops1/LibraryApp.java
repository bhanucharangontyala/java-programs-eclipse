package com.oops1;

public class LibraryApp {
	 public static void main(String[] args) {
	     LibraryMember student = new StudentMember("Bhanu", "Java Programming", 3);
	     System.out.println("Student Member: " + student.getMemberName());
	     System.out.println("Book Borrowed: " + student.getBookName());
	     System.out.println("Total Fee: ₹" + student.calculateFee());

	     System.out.println("-----------------------------");

	     LibraryMember premium = new PremiumMember("Charan", "Data Structures", 4);
	     System.out.println("Premium Member: " + premium.getMemberName());
	     System.out.println("Book Borrowed: " + premium.getBookName());
	     System.out.println("Total Fee: ₹" + premium.calculateFee());
	 }
	}
