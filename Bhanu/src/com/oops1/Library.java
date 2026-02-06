package com.oops1;

public class Library {

	public static void main(String[] args) {
		Book b1 = new Book("Game Of Thrones", 101, "James Smith");
		b1.showDetails();
		EBook eb1 = new EBook("Harry Potter", 102, "Nicolus Cameron", 3000);
		eb1.showDetails();
	}

}
