package com.logicalstatements;

import java.util.Scanner;

public class SuperMarket {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("***Welcome to Super Market***");
		System.out.println("enter anything to start");
		double shoppingCart = 0;
		String start = sc.next();
		do {
			System.out.println("The categories we Have\n1.vegetables\n2.fruits\n3.namkeen\n4.cakes\n5.chocolates");
			System.out.println("choose any categories");
			int cat = sc.nextInt();
			switch (cat) {
				case 1 -> {
					String con;
					do {
						System.out.println(
								"the vegetables available are..\n1.tomato - 60rs\n2.potato - 40rs\n3.mirchi - 70rs\n4.lady finger - 50rs\n5.onion - 30rs\n choose the appropriate veggies code");
						int veg = sc.nextInt();
						switch (veg) {
						case 1 -> shoppingCart += 60;
						case 2 -> shoppingCart += 40;
						case 3 -> shoppingCart += 70;
						case 4 -> shoppingCart += 50;
						case 5 -> shoppingCart += 30;
						default -> System.out.println("Items not available");
						}
						System.out.println("do you want add more items \n enter Y or N");
						con = sc.next();
					} while (con.equalsIgnoreCase("Y"));
				}
				case 2 -> {
					String con;
					do {
						System.out.println(
								"the fruits available are..\n1.apple - 100rs\n2.oranges - 40rs\n3.banana - 60rs\n4.guava - 70rs\n5.black grapes - 150rs\n choose the appropriate fruits code");
						int fruit = sc.nextInt();
						switch (fruit) {
						case 1 -> shoppingCart += 100;
						case 2 -> shoppingCart += 40;
						case 3 -> shoppingCart += 60;
						case 4 -> shoppingCart += 70;
						case 5 -> shoppingCart += 150;
						default -> System.out.println("Items not available");
						}
						System.out.println("do you want add more items \n enter Y or N");
						con = sc.next();
					} while (con.equalsIgnoreCase("Y"));
				}
				case 3 -> {
					String con;
					do {
						System.out.println(
								"the namkeen available are..\n1.boondi - 80rs\n2.mixture - 90rs\n3.chips - 40rs\n4.sev - 100rs\n5.papdi - 120rs\n choose the appropriate namkeen code");
						int fruit = sc.nextInt();
						switch (fruit) {
						case 1 -> shoppingCart += 80;
						case 2 -> shoppingCart += 90;
						case 3 -> shoppingCart += 40;
						case 4 -> shoppingCart += 100;
						case 5 -> shoppingCart += 120;
						default -> System.out.println("Items not available");
						}
						System.out.println("do you want add more items \n enter Y or N");
						con = sc.next();
					} while (con.equalsIgnoreCase("Y"));
				}
				case 4 -> {
					String con;
					do {
						System.out.println(
								"the cakes available are..\n1.pineapple - 300rs\n2.strawberry - 400rs\n3.butter scotch - 350rs\n4.red velvet - 600rs\n5.black forest - 800rs\n choose the appropriate cakes code");
						int cakes = sc.nextInt();
						switch (cakes) {
						case 1 -> shoppingCart += 300;
						case 2 -> shoppingCart += 400;
						case 3 -> shoppingCart += 350;
						case 4 -> shoppingCart += 600;
						case 5 -> shoppingCart += 800;
						default -> System.out.println("Items not available");
						}
						System.out.println("do you want add more items \n enter Y or N");
						con = sc.next();
					} while (con.equalsIgnoreCase("Y"));
				}
				case 5 -> {
					String con;
					do {
						System.out.println(
								"the fruits available are..\n1.dairymilk - 80rs\n2.kitkat - 120rs\n3.munch - 20rs\n4.perk - 30rs\n5.sneakers - 70rs\n choose the appropriate chocolate code");
						int choco = sc.nextInt();
						switch (choco) {
						case 1 -> shoppingCart += 80;
						case 2 -> shoppingCart += 120;
						case 3 -> shoppingCart += 20;
						case 4 -> shoppingCart += 30;
						case 5 -> shoppingCart += 70;
						default -> System.out.println("Items not available");
						}
						System.out.println("do you want add more items \n enter Y or N");
						con = sc.next();
					} while (con.equalsIgnoreCase("Y"));
				}
				default -> System.out.println("your items are not available");
			}
		System.out.println("do you want continue to add items from different categories \n enter Y or N");
		start = sc.next();
		}while(start.equalsIgnoreCase("y"));
		System.out.println("the total bill of cart  :" + shoppingCart);
		System.out.println("thank you for shopping \n *****visit again*****");
	}
}
