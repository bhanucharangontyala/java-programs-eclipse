package student;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ObjectDataTypes {
	
	//by default all the object data types have the value null
	//Wrapper class Objects are Byte, Short , Integer, Long, Float, Double, Character, Boolean
	//converting wrapper class data to primitive data type is called Auto-Boxing
	//converting primitive data type to Wrapper Class data is called Auto-Unboxing
	//Primitive to Wrapper conversion is happening automatically
	
	Byte b = (byte) 100;
//	byte b1 = b;//Auto-boxing
	Short s = 1000;
//	int i1;
	Integer i = 10000;//Auto-unboxing
	Long l = 9866984343L;
	
	Float f = 9.8f;
	Double d = 9.88888;
	
	Character c = 'M';
	Boolean bl = true;
	//String Literals --> in SCP (String Constant Pool)
	String st = "Hello";//value Store in Directly SCP
	String st2 = new String();//We can only create object when the class contains its constructor
	//the value of the string using constructor is stored in heap area a copy is stored 
	//in SCP but without reference is not there to the value in SCP   
	String st1 = new String("Bhanu Charan");
	
	//BigInteger does not have the No arg constructor we can only create object using string as arg
	//and some other ways which are already is specified in the class
	BigInteger bi = new BigInteger("921221221212121212212");
	BigInteger bi1 = new BigInteger("921221221212121212212");
	
	//BigDecimal can be initialized using direct BigDecimal Value , long value, double value, char, int 
	//String
	BigDecimal bd = new BigDecimal("9.037373999999292999");
	BigDecimal bd1 = new BigDecimal("9.037373999999292999");
	
	
	public static void main(String[] args) {
		ObjectDataTypes obj1 = new ObjectDataTypes();
		
		System.out.println("value of Byte:" + obj1.b);
		System.out.println("value of Short:" + obj1.s);
		System.out.println("value of Integer:" + obj1.i);
		System.out.println("value of Long:" + obj1.l);
		System.out.println("value of Float:" + obj1.f);
		System.out.println("value of Double:" + obj1.d);
		System.out.println("value of Character:" + obj1.c);
		System.out.println("value of Boolean:" + obj1.bl);
		System.out.println("value of String:" + obj1.st);
		System.out.println("value of BigInteger:" + obj1.bi);
		System.out.println("value of BigDecimal" + obj1.bd);
		
		//We can not perform operations using operators we have to use methods that are already
		//specified in the object class like add, subtract ,multiply, divide, mod etc...
		System.out.println(obj1.bi.add(obj1.bi1));
		System.out.println(obj1.bi.subtract(obj1.bi1));
		System.out.println(obj1.bi.multiply(obj1.bi1));
		System.out.println(obj1.bi.divide(obj1.bi1));
		System.out.println(obj1.bi.mod(obj1.bi1));
		//for BigDecimal also We can not perform operations using operators we have to use methods that are already
		//specified in the object class but mod can not be used 
		System.out.println(obj1.bd.add(obj1.bd1));
		System.out.println(obj1.bd.add(obj1.bd1));
		System.out.println(obj1.bd.add(obj1.bd1));
		System.out.println(obj1.bd.multiply(obj1.bd1));
		
		
	}

}
