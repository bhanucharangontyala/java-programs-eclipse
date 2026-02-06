package student;

public class Literals {
	//literals are values of the variables
	//there are total six types of literals
	// 1.Integral literals, 2.Floating Literals, 3.char Literals, 4.String literals, 5.Boolean literals
	// 6.Null Literals
	public static void main(String[] args) {
		
		//integral Literals
		//3 types 1.Octal, 2.Decimal, 3.Hexa-Decimal 
		int i = 927;//decimal --> 0 to 9
		int i1 = 0127;//octal --> 0 to 7 starts with 0
		// 1*8^2 + 2*8^1 + 7*8^0 = 64 + 16 + 7 = 87
		int i2 = 0x1A4F;//hexa-decimal --> 0 to 9 and a/A to f/F
		//1  A  4  F //a-10, b-11. c-12, d-13, e-14, f-15
		//1*16^3 + 10*16^2 + 4*16^1 + 15*16^0 = 4096 + 2560 + 64 + 15 = 6735
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println();
		
		
		
		//floating Literals
		float f = 10;
		float f1 = 0132;
		float f2 = 0x98A;
//		float f3 = 10.5;//Type mismatch: cannot convert from double to float
		float f4 = 10.5f;
//		float f5 = 0123.3;//Type mismatch: cannot convert from double to float
		float f6 = 0123.5f;
//		float f7 = 0x98A.5f;//Invalid hex literal number
//		float f8 = 0x12D.4;//Invalid hex literal number
//		float f9 = 83.4d;//Type mismatch: cannot convert from double to float
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f6);
		System.out.println();
		
		
		//Character Literals
		char c = 'a';//single character 
		char c1 = 67;//ASCII code values
		char c2 = '\u0023';//UNICODE values
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		
		//String Literals
		String s = "Bhanu Charan";//value directly stored in String Constant Pool (SCP)
		String s3 = "Bhanu Charan";
		//if we create another variable with similar value then the old value is 
//		referenced to new variable  
		String s1  = "";
		String s2 = new String("Bhanu Charan");//value stored in heap memory and a copy is 
//		stored in string Constant pool without reference  
		String s4 = new String("Bhanu Charan");
		//if we create another variable with similar value then it creates new object in heap 
		//memory but referenced to old value in SCP
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s == s3);//true
		System.out.println(s == s2);//false
		System.out.println(s2 == s4);//false
		System.out.println(s2 == s3);//false
		
		
		
		//Boolean Literals
		boolean isCute = false;
		boolean isUgly = true;
		System.out.println(isCute);
		System.out.println(isUgly);
		System.out.println();
		
		
		//null Literals
		
		String n = null;
		//Attempting to perform operations on a null reference will result in a NullPointerException. 
//		int l = n.length();
		System.out.println(n);
		System.out.println();
		
		
		
		//Double 
		double d = 235;
		double d1 = 0127;
		double d2 = 0x1Af;
		double d3 = 10.3;
		double d4 = 10.5f;
		double d5 = 0123.4;
		double d6 = 0123.4f;
//		double d7 = 0x1Af.3;//Invalid hex literal number
//		double d8 = 0x1Af.3f;//Invalid hex literal number
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println();
		System.out.println();
		
		
		}

}
