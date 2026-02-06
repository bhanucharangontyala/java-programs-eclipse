package student;

import java.util.Scanner;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	double discountPercentage;
	
	void m1(){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Book ID ");
		bookId = sc.nextInt();
		System.out.println("Enter Title ");
		title = sc.next();
		System.out.println("Enter Author");
		author = sc.next();
		System.out.println("Enter Price");
		price = sc.nextDouble();
		System.out.println("Enter Discount Price ");
		discountPercentage = sc.nextDouble();
		sc.close();
	}
	
	void displayBooksDetails() {
		double discountPrice = price * discountPercentage/100;
		double finalPrice = price - discountPrice;
		System.out.println("*****Book Details*****");
		System.out.println("Book ID :" + bookId);
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Original Price :" + price);
		System.out.println("Discount :" + discountPercentage);
		System.out.println("Discount Amount: " + discountPrice);
		System.out.println("Final Price :" + finalPrice);
		System.out.println();
	}
	

	public static void main(String[] args) {
//		Book b1 = new Book();
//		b1.bookId =1;
//		b1.title = "Game of Thrones";
//		b1.author = "James";
//		b1.price = 2580;
//		b1.discountPercentage = 15;
//		b1.displayBooksDetails();
//		
//		Book b2 = new Book();
//		b2.bookId = 2;
//		b2.title = "Lord of the Rings";
//		b2.author = "William";
//		b2.price = 3500;
//		b2.discountPercentage = 20;
//		b2.displayBooksDetails();
//		
		Book obj = new Book();
		obj.m1();
		obj.displayBooksDetails();
	}

}
