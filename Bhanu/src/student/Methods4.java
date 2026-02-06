package student;
//16-10-2025

//creating methods with return type and without arguments
//here we are exhibiting the arithmetic operators 
//byte --> short --> int --> long --> float --> double
// by the order the smaller data types are automatically coverted to big one 
//this process is called Auto-Boxing

public class Methods4 {
	int a = 100;
	int b = 50;
	byte b1 = 50;
	byte b2 = 10;
	short s1 = 100;
	short s2 = 50;
	double d1 = 9876.98765;
	double d2 = 2346.65432;
	long l1 = 9876543210L;
	long l2 = 2345678910L;
	float f1 = 23.1234F;
	float f2 = 6789.1234F;

	byte sub() {
		// byte cannot returning directly we have to
		// use type casting even if all the required fields are byte
//		Type mismatch: cannot convert from int to byte
//		byte b = b1+b1;
		return (byte)(b1 - b2);
	}

	short mul() {
		// short cannot returning directly we have to
		// use type casting even if all the required fields are short
//		Type mismatch: cannot convert from int to byte
		return (short) (s1 * s2);
	}

	int add() {
		return a + b;
	}

	long mul2() {
		return l1 * l2;
	}

	float div2() {
		//double need the type-casting
		return b1 / b2;
	}

	double div() {
		return d1 / d2;
	}

	void main(String[] args) {
		
		byte sub = sub();
		short mul = mul();
		int ans = add();
		long mul2 = mul2();
		float div2 = div2();
		double div = div();
		
		
		System.out.println("Sum is:" + ans);
		System.out.println("Sub is:" + sub);
		System.out.println("Mul is:" + mul);
		System.out.println("Div is:" + div);
		System.out.println("Mul2 is:" + mul2);
		System.out.println("Div2 is:" + div2);
	}

}
