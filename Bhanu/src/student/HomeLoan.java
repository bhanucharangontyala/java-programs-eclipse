package student;

public class HomeLoan {
	
	String borrowerName;
	double loanAmount;
	int years;
	double totalRepay;
	
	static {
		System.out.println("Home Loan Department Activated");
	}
	
	public void calculateRepayment() {
		totalRepay = loanAmount + (0.08 * loanAmount * years );
//		System.out.println(totalRepay);
	}
	
	public void showDetails() {
		System.out.println("*****Customer Details*****");
		System.out.println(borrowerName);
		System.out.println(loanAmount);
		System.out.println(years);
		System.out.println(totalRepay);
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		HomeLoan customer1 = new HomeLoan();
		customer1.borrowerName = "Bhanu Charan";
		customer1.loanAmount = 10000;
		customer1.years = 7;
		customer1.calculateRepayment();
		customer1.showDetails();
		
		HomeLoan customer2 = new HomeLoan();
		customer2.borrowerName = "Gowtam";
		customer2.loanAmount = 85000;
		customer2.years = 9;
		customer2.calculateRepayment();
		customer2.showDetails();

	}

}
