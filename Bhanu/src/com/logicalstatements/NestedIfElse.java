package com.logicalstatements;

import java.util.Scanner;

public class NestedIfElse {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Interview");
		System.out.println("Ok!, sit down");
		System.out.println("Tell me about yourself?");
		String about = sc.nextLine();
		System.out.println("about you :" + about);
		System.out.println("Tell me which language your are good at?");
		String lang = sc.nextLine();
		if (lang.equals("java") | lang.equals("python") | lang.equals("javascript")) {
			System.out.println("ok Nice ");
			System.out.println("Tell me the percentage in your graduation?");
			double per = sc.nextDouble();
			if (per > 70) {
				System.out.println("ok, now tell me what are your strength?");
				String stren = sc.next();
				if (stren.equals("teamplayer") | stren.equals("timemanagement") | stren.equals("adaptive")) {
					System.out.println("ok. tell me your expected salary");
					double sal = sc.nextDouble();
					if (sal >= 400000 & sal <= 800000) {
						System.out.println("ok we will inform your after the result ");
					} else {
						System.out.println("you can't get what you want");
						double sal2 = sc.nextDouble();
						if(sal2 < 800000) {
							System.out.println("ok");
						}
					}

				} else {
					System.out.println("we will get back to you");
				}
			} else {
				System.out.println("your profile not match the JD");
			}
		} else {
			System.out.println("sorry for the inconvience you can leave for the day");
		}
	}

}
