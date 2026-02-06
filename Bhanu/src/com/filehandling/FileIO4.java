package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIO4 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f = new File("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		fr.close();
		System.out.println("main method ended");
	}

}
