package student;

public class Practice {
	static int AMOUNT = 100;
	static int PENCIL = 7;
	
	void calculate() {
		int remaining = AMOUNT%PENCIL;
		int noOfPencils = AMOUNT/PENCIL;
		System.out.println("Remaining Amount: "+remaining);
		System.out.println("No of Penicls: "+noOfPencils);
	}
	//test marks=5 mistakes below
	public static void main(String[] args) {
		Practice obj = new Practice();
		obj.calculate();
		
//		char c = 'A' +1;
//		System.out.println(c);//B
		
//		byte b =127;
//		b +=1;
//		System.out.println(b);//-128
		
//		char l = 'A';
//		int ascii = l;
//		System.out.println(ascii);//65
		
//		char a ='D';
//		char b ='A';
//		System.out.println(a-b);//3
		
//		char c = 'B';
//		int n = 3;
//		String str = "X";
//		System.out.println(c + n + str);//69X
//		System.out.println(str + c + n);//XB3
		
		
	}

}
