package operators;

public class Operators7 {
//	5.Unary operators
//	  - these operators only take one operand as the input and returns the calculated value
//	  - these are used for incrementing and decrementing a value
//	  - preincrement(++a) and postincrement(a++)
//	  - predecrement(--a) and postdecrement(a--)
//	  - pre means first operation then assign
//	  - post means first assign anf then operation
//	  - (+) - show postive number, ++
//	  - (-) - show negative number, --
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		System.out.println(+a);//10
		System.out.println(-b);//-1
		System.out.println(a++);//10 a=11
		System.out.println(++a);//12 a=12
		System.out.println(a--);//12 a=11
		System.out.println(--a);//10 a=10
		System.out.println(a++ + --a + a++ + a-- );//41
		
	}
}
