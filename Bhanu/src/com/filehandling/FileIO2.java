package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bike implements Serializable {
	private static final long serialVersionUID = 4121806043008828860L;
	String username = "BhanuCharan92";
	transient String password = "GBhanu@123";
	transient long cardNo = 123456781234L;
	transient int cvv = 345;
}

public class FileIO2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		Bike obj = new Bike();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("main method ended ");
		oos.close();
		fos.close();
	}

}
