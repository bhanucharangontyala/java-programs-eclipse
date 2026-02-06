package operators;

public class Operators5 {
//    4.Logical Operators
//      -used to perform logical operations on boolean expressions 
//       returns boolean value
//      -crucial for decision making and control flow in programs
//      -used in if , while ,for 
//      - (&&) - Logical AND
//      - (||) - Logical OR
//      - (!)  - Logical NOT/Negate
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("*******Logical AND******");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		//one the case is false the remaining is dead code
//		System.out.println(false && true);//false
//		System.out.println(false && false);//false
		System.out.println(a < b && b < c);//true
		System.out.println(a < b && b > c);//false
		System.out.println(a > b && b < c);//false
		System.out.println(a > b && b == c);//false
		
		System.out.println("*******Logical OR*******");
//		System.out.println(true || true);//true
//		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		System.out.println(a != b || a < b);//true
		System.out.println(a != b || b > c);//true
		System.out.println(a == b || b < c);//true
		System.out.println(a == b || b == c);//false
		
		System.out.println("*******Logical NOT*******");
		System.out.println(!(a < b));//false
		System.out.println(!(a > b));//true
	}

}
