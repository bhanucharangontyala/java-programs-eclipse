package operators;

import java.util.Scanner;

public class EvenOrOdd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your number");
		double a = sc.nextInt(); 
		String ans = (a/2 > (int)a/2) ? "odd" : "even";
		System.out.println(ans);
	}

}
