package operators;
//task-1 30-10-25
public class Calculator {
	int c,d,e;

	int sum(int a, int b) {
		c= a + b;
		return c;
	}

	int sub(int a, int c) {
		d= c - a;
		return d;
	}

	int mul(int a, int d) {
		e = d*a;
		return e;
	}

	double div(int a, int e) {
		return (double) a / e;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Sum of two numbers :"+ c1.sum(55,45));
		System.out.println("Sub of two numbers :"+ c1.sub(55,c1.c));
		System.out.println("Mul of two numbers :"+ c1.mul(20,c1.d));
		System.out.println("Div of two numbers :"+ c1.div(1000,c1.e));
	}

}
