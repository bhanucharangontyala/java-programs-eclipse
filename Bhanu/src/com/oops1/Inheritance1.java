package com.oops1;

public class Inheritance1 implements Cloneable{
	//why inheritance ?
	//  - we use inheritance for code reusability
	// 
	//  - inheritance ins the process of getting functionalities,data members 
	//    of parent,super,base classes to child,sub,derived class
	//  - we use inheritance with relation between the entity
	//  - the relations can be
	//    1. IS_A relation
//		    - class Vehicle
//	        - class Car extends Vehicle  ( Car IS_A Vehicle)
//	        - class Bike extends Vehicle ( Bike IS_A Vehicle)
//	        - class Auto extends Vehicle ( Auto IS_A Vehicle)
	
	//      - class Dog extends Vehicle( X it does not have the relation) 
	//    2. HAS_A Relation
		//	class Car{
		//		
		//		class Engine{
		//			//Car Has_A Engine
		//		}
		//	}
	//  we can achieve the Has_A Relation by using Inner Classes
	
//	//Types of inheritance
//	1.single inheritance
//	2.multi-level inheritance
//	3.multiple inheritance (java does not support multiple inheritance for class
//	 but it does support with the interfaces)
//	4.hybrid inheritance
//	5.Hierarchical inheritance
//	6.cyclic inheritance (Java does not support the cyclic inheritance)
	
	//Object class
	// - Object class is the parent class of the every class in java
	// - Object is the super class of every java class
	// - Object has 11 methods in it
	//	1. Object clone()
	//	   - clone method is used to clone the object to another object
	//	   - It returns the Object
	//	2. Boolean equals(Object obj)
	//	   - this method is used to compare the two objects
	//	   - It returns the boolean value
	//	3. void finalize()
	//	   - this method is used to check whether the garbage collector is being called
	//	   - this only invoke when a object is ready for the garbage collection
	//	   - It does not return any thing
	//    4. Class getClass()
	//       - this method is used to get the class of the object
	//       - it will return Fully Qualified name of the class
	//    5. int hashCode()
	//       - it is used to calculate the hexadecimal value of the address of the object 
	//       - it helps to differentiate the objects, we use in hashMap,hashSet
	//       - it will return integer
	//    6. String toString()
	//       - this method is used to convert a data type to string 
	//       - It will return the String
	//    	7. void wait()
	//    	   - it helps to achieve the synchronization 
	//    	   - it does not return any thing
	//    8. void wait(long ms)
	//    9. void wait(long ms, long ns)
	//	10. void notify()
	//	   - this method is used to notify the process in the multi threading
	//	   - it does not return anything
	//	11. void notifyAll()
	
//	@Override
//	protected void finalize()  throws Throwable{
//		System.out.println("Finalize is called");
//	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Inheritance1 obj = new Inheritance1();
		Inheritance1 obj2 = (Inheritance1) obj.clone();
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
//		String str = null;
		System.gc();
	}

}
