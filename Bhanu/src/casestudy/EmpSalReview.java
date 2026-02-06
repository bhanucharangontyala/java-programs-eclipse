package casestudy;

import java.util.Scanner;

public class EmpSalReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Employee");
		int n = sc.nextInt();
		double[] sal = new double[n];
		System.out.println("Enter the salary of employees");
		for (int i = 0; i < n; i++) {
			sal[i] = sc.nextDouble();
		}
		// average salary
		double sum = 0;
		for (double s : sal) {
			sum += s;
		}
		double avg = sum / n;
		// find lowest and highest
		double high = sal[0];
		double low = sal[0];
		for (double s : sal) {
			if (s > high) {
				high = s;
			}
			if (s < low) {
				low = s;
			}
		}
		// find no of lowest and highest salary employees
		double counth = 0;
		double countl = 0;
		for (double s : sal) {
			if (s == high) {
				counth++;
			}
			if (s == low) {
				countl++;
			}
		}
		// displaying
		System.out.println("The highest salary is :" + high);
		System.out.println("The lowest salary is :" + low);
		System.out.println("The Average salary is :" + avg);
		System.out.println("The Number of Highest Salary is :" + counth);
		System.out.println("The Number of Lowest Salary is :" + countl);
		sc.close();
	}

}
