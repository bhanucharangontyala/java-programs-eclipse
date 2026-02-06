package operators;

import java.util.Scanner;

public class Operators6 {
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome to driving license application");
		System.out.println("enter your country");
		String country = sc.next();
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(country.equalsIgnoreCase("india") && age >= 18) {
			System.out.println("driving license approved");
		}else {
			System.out.println("not approved");
		}
	}

}
