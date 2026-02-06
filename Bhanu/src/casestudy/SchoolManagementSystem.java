package casestudy;

public class SchoolManagementSystem {
	int studentId;
	String studentName;
	char section;
	
	SchoolManagementSystem(int stdId,String stdName,char section) {
		this.studentId = stdId;
		this.studentName = stdName;
		this.section = section;
	}
	
	SchoolManagementSystem(SchoolManagementSystem s1,char section) {
		this.studentId = s1.studentId;
		this.studentName = s1.studentName;
		this.section = section;
	}
	
	void show() {
		System.out.println("Roll No :" + studentId);
		System.out.println("Student Name :" + studentName);
		System.out.println("Section :" + section);
	}
	public static void main(String[] args) {
		System.out.println("Student Details Before Transferring");
		SchoolManagementSystem s1  = new SchoolManagementSystem(101,"charan",'C');
		s1.show();
		System.out.println("Student Details After Transferring");
		SchoolManagementSystem s2 = new SchoolManagementSystem(s1, 'A');
		s2.show();
	}

}
