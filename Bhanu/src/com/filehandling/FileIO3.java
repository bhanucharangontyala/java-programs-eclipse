package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileIO3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");
		FileInputStream fis = new FileInputStream("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bike obj2 = (Bike) ois.readObject();
		System.out.println(obj2.username);
		System.out.println(obj2.password);
		System.out.println(obj2.cardNo);
		System.out.println(obj2.cvv);

		ois.close();
		fis.close();
		System.out.println("main method ended");
	}

}
