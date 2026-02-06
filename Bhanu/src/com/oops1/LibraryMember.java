package com.oops1;


abstract class LibraryMember {
	private String memberName;
	private String bookName;
	private int borrowedBooks;

	public LibraryMember(String memberName, String bookName, int borrowedBooks) {
		this.memberName = memberName;
		this.bookName = bookName;
		this.borrowedBooks = borrowedBooks;
	}

	public String getMemberName() {
		return memberName;
	}
	public String getBookName() {
		return bookName;
	}
	public int getBorrowedBooks() {
		return borrowedBooks;
	}
	public abstract double calculateFee();
}
