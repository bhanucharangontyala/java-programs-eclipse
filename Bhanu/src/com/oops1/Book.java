package com.oops1;

public class Book extends Item {
	String author;

	public Book(String title, int id, String author) {
		super(title, id);
		this.author = author;
	}

//	public Book() {
//
//	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Author of the Book" + author);
	}

}
