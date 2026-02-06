package operators;

public class Operators2 {
	/*
	 * 2.assignment operators
	 *  - these operators are use to assign the values to variables 
	 *  - (=) - simple assign 
	 *  - (+=),(-=),(*=),(/=),(%=) - short-hand assignment operators
	 *    combining assignment and arithmetic operators
	 */
	public static void main(String[] args) {
		int a = 10;//here = means assigning
//		a = a+4.5;//here we are unable add the double value to int
		a += 4.5;//by using short hand assignment operators we can achieve
		System.out.println(a);
//		a = a - 3.4;a=7//here we are unable sub the double value to int
		a -= 3.4;//a=3 = 7-3.4 = 3.6 it rounds up the only int value
		System.out.println(a);
//		System.out.println(a++ - ++a + a-- - --a + a++ -a + --a + a-- - ++a);
//		System.out.println(a++ - ++a - a++ + --a + a-- - a + ++a - a--);
		a *= 3.8;
		System.out.println(a);
		a /= 2.5;
		System.out.println(a);
		a %= 3.5;
		System.out.println(a);
		
	}

}
