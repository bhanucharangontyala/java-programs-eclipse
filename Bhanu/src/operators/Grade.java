package operators;

import java.util.Scanner;

public class Grade {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Marks ");
		int marks = sc.nextInt();
		String ans = (marks > 100)?"wrong marks":
				     (marks >= 90 & marks < 100)?"A grade":
			         (marks >= 80 & marks < 90)?"B grade":
			        	 (marks >= 70 & marks < 80)?"C grade":
			         (marks >= 60 & marks < 70)?"D grade":"F grade";
		System.out.println(ans);
		String ans1 = (ans.equalsIgnoreCase("F grade"))?"fail": "pass";
//		String ans1 = (marks < 60)?"fail":"pass";
		System.out.println(ans1);	        	 
	}

}
