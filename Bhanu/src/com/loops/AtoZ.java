package com.loops;

public class AtoZ {

	public static void main(String[] args) {
		//for A-Z
		for (char i = 65; i <= 90; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//For a-z
		for (char i = 97; i <= 122; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//for A -> 1 to Z -> 26
		for (char i = 1; i <= 26; i++) {
			System.out.println((char)(i+64) +"->"+(int)i);
		}
	}

}
