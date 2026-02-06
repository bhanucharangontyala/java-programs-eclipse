package com.excceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		System.out.println("main method started");
		// IOException
		// it will arises when we try to create the new file in a folder
		File f = new File("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb.txt");
		f.createNewFile();
		// FileNotFoundException
		// it will arises when compiler didn't find the file in the specified
		// folder
		FileReader fr = new FileReader("C:\\Users\\Bhanucharan\\OneDrive\\Desktop\\java\\files\\gb.txt");
		//it will start the cursor from starting of the file
		// it will only read one character at a time
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			// it will helps go to next character
			i = fr.read();
			// InterruptedException
			// when we use sleep method then compiler will asks to throw
			Thread.sleep(100);
		}
		System.out.println();
		System.out.println("main method ended");
		fr.close();
	}

}
