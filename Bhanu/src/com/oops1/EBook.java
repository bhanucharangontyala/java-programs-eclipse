package com.oops1;

public class EBook extends Book {
	int fileSize;

	public EBook(String title, int id, String author, int fileSize) {
		super(title, id, author);
//		super.author = b1.author;
//		super.id = b1.id;
//		super.title = b1.title;
		if (fileSize > 100 && fileSize < 500) {
			this.fileSize = fileSize;
		} else {
			System.out.println("Invalid File Size");
		}
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("The file size is " + fileSize);
	}

}
