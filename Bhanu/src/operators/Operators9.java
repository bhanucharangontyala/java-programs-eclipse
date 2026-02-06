package operators;

public class Operators9 {
//	7.Ternary Operators
//	  -also known as conditional operator can be used in place of a 
//	   if-else statement in one line
//	  - it is the only operator that takes three operands 
//	  -syntax
//	       result = condition ? trueValue : falseValue;
//	  - ?, :
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 80;
		int d = 40;
		int res = (a > b) ? a : b;
		System.out.println(res);
		int res2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(res2);
		int res3 = (a > b & a > c & a > d) ? a : 
				   (b > a & b > c & b > d) ? b : 
				   (c > a & c > b & c > d) ? c : d;
		System.out.println(res3);
	}

}
