package student;

public class DataTypes {
	
	byte b = (byte)131;//value range from -128 to 127
	short sh = (short)32769;//value range from -32768 to 32767
	int num = (int)2147483649L;//value range from -2,147,483,648 to 2,147,483,647
	long lg = 9894788393L;//value range from -9223 3720 3685 4775 808 to 9,223,372,036,854,775,807
	
	float f = 3.4455344433f;//upto 6-7 decimals
	double d = 3.442223455511223444;//upto 15-16 decimals
	
	char c = 'm';
	boolean bl = true;
	

	public static void main(String[] args) {
		DataTypes obj1 = new DataTypes();
		System.out.println("value of byte: " + obj1.b );
		System.out.println("value of short: " + obj1.sh );
		System.out.println("value of integer: " + obj1.num );
		System.out.println("value of long: " + obj1.lg );
		System.out.printf("value of float: %.2f", obj1.f );
		System.out.println("value of double: " + obj1.d );
		System.out.println("value of character: " + obj1.c );
		System.out.println("value of boolean: " + obj1.bl );
	}

}
