package constructors;

public class BankAccount {
	long accountNo;
	String holderName;
	int balance;

	BankAccount(long accountNo) {
		System.out.println("one-arg constructor called");
		this.accountNo = accountNo;
	}

//	BankAccount(long accountNo, String name) {
//		System.out.println("two-arg constructor called");
//		this.accountNo = accountNo;
//		this.holderName = name;
//		this(accountNo);
//	}

	BankAccount(long accountNo, String name, int balance) {
		System.out.println("three-arg constructor called");
		this.accountNo = accountNo;
		this.holderName = name;
		this.balance = balance;
//		this(accountNo, name);
	}

	void show() {
		System.out.println("The Account Number is :" + accountNo);
		System.out.println("The Holders Name is : " + holderName);
		System.out.println("The Balance Amount is :" + balance);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1234567898L, "charan", 20000);
		b1.show();
	}

}
