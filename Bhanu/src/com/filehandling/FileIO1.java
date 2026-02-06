package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f1 = new File("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb1.txt");
		File f2 = new File("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb.txt");
		File f3 = new File("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb2.txt");
		FileReader fr1 = new FileReader(f1);
		FileReader fr2 = new FileReader(f2);
		FileWriter fw1 = new FileWriter(f3);
		BufferedWriter bf1 = new BufferedWriter(fw1);

		int i1 = fr1.read();
		while (i1 != -1) {
			bf1.write(i1);
			i1 = fr1.read();
		}
		bf1.newLine();
		int i2 = fr2.read();
		while (i2 != -1) {
			bf1.write(i2);
			i2 = fr2.read();
		}

		bf1.close();
		fw1.close();
		fr2.close();
		fr1.close();
		System.out.println("main method ended");
	}

}
