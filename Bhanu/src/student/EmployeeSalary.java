package student;

public class EmployeeSalary {
	
	static double yearlySalary;
	static double netSalary;
	double grossSalary;
	double cgst;
	double pf;
	double da;
	double gSalary;
	
	void salaryInfo() {
		cgst = grossSalary*0.1;
		pf = grossSalary*0.07;
		da = grossSalary*0.08;
		gSalary =grossSalary + da;
		netSalary = grossSalary + da - (cgst + pf); 
		
		System.out.println("Employee Salary Details");
		System.out.println("Salary : "+grossSalary);
		System.out.println("CGST : " + cgst);
		System.out.println("PF : " +pf);
		System.out.println("DA : " +da);
		System.out.println("Gross Salary : "+gSalary);
		System.out.println("NetSalary : " +netSalary);
		System.out.println();
		
	}
	
	void salaryInfoYearly() {
		yearlySalary = netSalary *12;
		System.out.println("Salary Per Annum : "+yearlySalary);
		System.out.println();
	}

	public static void main(String[] args) {
		EmployeeSalary emp1 = new EmployeeSalary();
		emp1.grossSalary = 60000;
		emp1.salaryInfo();
		emp1.salaryInfoYearly();
		
		EmployeeSalary emp2 = new EmployeeSalary();
		emp2.grossSalary = 30000;
		emp2.salaryInfo();
		emp2.salaryInfoYearly();

	}

}
