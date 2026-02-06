package com.oops1;

class PremiumMember extends LibraryMember {
	 private static double FEE_PER_BOOK = 5.0; 

	 public PremiumMember(String memberName, String bookName, int borrowedBooks) {
	     super(memberName, bookName, borrowedBooks);
	 }

	 @Override
	 public double calculateFee() {
	     return getBorrowedBooks() * FEE_PER_BOOK;
	 }
	}
