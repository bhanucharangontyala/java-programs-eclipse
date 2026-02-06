package casestudy;

import java.util.Scanner;

public class Login {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String cPass = "Java@123";
		int count = 0;
		do {
			System.out.println("Enter the password");
			String ch = sc.nextLine();
			if (ch.equals(cPass)) {
				System.out.println("Access Granted");
				break;
			} else {
				System.out.println("Enter valid password Retry!");
				count++;
			}

		} while (count <= 3);
		if (count > 3) {
			System.out.println("Account Locked !");
		}
	}

}
