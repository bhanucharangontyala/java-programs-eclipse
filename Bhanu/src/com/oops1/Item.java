package com.oops1;

public class Item {
	String title;
	int id;

	public Item(String title, int id) {
		this.title = title;
		this.id = id;
	}

//	public Item() {
//
//	}

	public void showDetails() {
		System.out.println("Title of Book :" + title);
		System.out.println("Book Id :" + id);
	}
}
