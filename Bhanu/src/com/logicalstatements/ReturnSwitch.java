package com.logicalstatements;

import java.util.Scanner;

public class ReturnSwitch {
	//we return a switch statement int the return_value
	static Scanner  sc= new Scanner(System.in);
	int bill = 0;
	
	int vegetables(int veg) {
		return switch(veg) {
		case 1->bill += 40;
		case 2->bill += 30;
		default -> -1;
		};
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Super Market");
		System.out.println("The items in veggies \n1.tomato - 40rs\n2.potato - 30rs");
		int veg = sc.nextInt();
		ReturnSwitch r1 = new ReturnSwitch();
		r1.vegetables(veg);
		System.out.println(r1.bill);
	}
	

}
