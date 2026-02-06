package operators;

public class Operators1 {
	//why operators ?
	/*-this are fundamental in any programming language, because they  
	   provide meaning to perform the actions and manipulate the data
	  -used to perform calculations, assigning values, for readability
	*/
	//what are operators?
	//-operators are the special keywords that are used to performed
    // specific operations on one or more operands and return the result
	
	//where we use operators in java?
	/*-used for performing mathematical calculations 
	  -used for assigning values to variable 
	  -comparing values and make decisions
	  -increment and decrement values
	  -perform bit-wise manipulation
	  -perform conditional operations
	  -checking object types*/
	
	/* types of operators in java 
	 *  1️. Arithmetic Operators
        2️. Assignment Operators
 		3️. Comparison (Relational) Operators
 		4️. Logical Operators
 		5️. Unary Operators
 		6️. Bitwise Operators
 		7️. Ternary (Conditional) Operator
 		8️. instanceof Operator
 		
	 * 1.arithematic operators 
	   	 - used to perform mathematical operation on integers 
	     - (+) - addition/concatenation 
	     - (-) - subtraction 
	     - (*) - multiplication 
	     - (/) - division - returns quotient 
	     - (%) - modulus - returns remainder
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("+" +a+b);//1020
		//because of first concatenation will be done next a will be
//		concatenat to be as a String
		System.out.println("+"+(a+b));//30
//		System.out.println("-"+a-b);
//		The operator - is undefined for the argument type(s) String, int
		System.out.println("-"+(a-b));//-10
//		note: for add and sub we have write operation inside of the braces
		System.out.println("*"+a*b);//200
		System.out.println("/" + b/a);//2
		System.out.println("%" + b%a);//0
		System.out.println((a*b)-(a/b)%(a*b));//200
	}

}
