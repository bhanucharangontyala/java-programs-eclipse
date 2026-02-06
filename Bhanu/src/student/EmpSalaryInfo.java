package student;

public class EmpSalaryInfo {
	Integer empNo;
	String empName;
	Integer salary;
	String hireDate;
	Integer experience;
	
	{
		empNo = 100;
		empName = "Charan";
		salary = 10000;
		hireDate = "07/06/2025";
		experience = 2;
		int annualSalary = salary * 12;
		int annualBonus =(int) (annualSalary * 0.1);
		int totalAnnualEarnings = annualSalary +annualBonus;
		System.out.println("*********Employee Details******* ");
		System.out.println("Employee Number : "+ empNo);
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee Salary : "+ salary);
		System.out.println("Employee Hire-Date : "+ hireDate);
		System.out.println("Employee Experience : "+ experience);
		System.out.println("Employee Annual Salary : "+ annualSalary);
		System.out.println("Employee Annual Bonus : "+ annualBonus);
		System.out.println("Employee Total Annual Earnings : "+ totalAnnualEarnings);
		
	}
	
	void main() {
		 
	}

}
