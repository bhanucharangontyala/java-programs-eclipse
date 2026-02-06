package student;

public class CalculateMarks {
	
	int s1;
	int s2;
	int s3;
	int s4;
	int s5;
	
	static int totalMarks;
	static float averageMarks;
	
	void marksInfo() {
		totalMarks = s1+s2+s3+s4+s5;
		System.out.println(totalMarks);
		averageMarks = (float)totalMarks/5;
		System.out.println(averageMarks);
	}
	
	public static void main(String[] args) {
		CalculateMarks std1 = new CalculateMarks();
		std1.s1 = 78;
		std1.s2 = 65;
		std1.s3 = 69;
		std1.s4 = 80;
		std1.s5 = 89;
		std1.marksInfo();
		
		CalculateMarks std2 = new CalculateMarks();
		std2.s1 = 90;
		std2.s2 = 75;
		std2.s3 = 98;
		std2.s4 = 70;
		std2.s5 = 86;
		std2.marksInfo();
		
		
		
	}

}
