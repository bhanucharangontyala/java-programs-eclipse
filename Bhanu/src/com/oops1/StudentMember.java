package com.oops1;

class StudentMember extends LibraryMember {
	 private static final double FEE_PER_BOOK = 10.0; // Student fee per book

	 public StudentMember(String memberName, String bookName, int borrowedBooks) {
	     super(memberName, bookName, borrowedBooks);
	 }

	 @Override
	 public double calculateFee() {
	     return getBorrowedBooks() * FEE_PER_BOOK;
	 }
	}
