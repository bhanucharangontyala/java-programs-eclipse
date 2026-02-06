package constructors;

/*
 * constructor : 
 * -constructor is used to create the object/instance of a class
 * -in java we must need constructor to create the class 
 * -constructors are similar like methods but they doesnot return anything 
 * not even void, if we return something to a constructor 
 * we not get any error simply it will consider as method in 
 */

/* Java we have 5 types of constructors
 * 1.default constructors 
 * 	-if we are not creating any explicit constructor the JVM will create
 * 	 default constructor that helps us to create object   
 * 2.no-arg constructors 
 * 	-if we want to initialize the default values or some values 
 *   other than values of JVM we can use no-arg constructor and 
 *   set the values that takes no arguments.
 * 3.parameterized/argumented constructors 
 * 	-this type of constructor will take N no of arguments as parameters
 *   to perform specific task using the arguments
 *  -by using this we need not to assign every single value using obj
 *   we can directly assign using them as parameters 
 * 4.constructor chaining 
    - this is the process of calling the one constructor in another 
    - The primary purpose is to promote code reusability and ensure 
      consistent object initialization. 
    - it can be in same class or between subclass and superclass
 * 5.copy constructors
    - is the process of using data values of one object to another object
      to avoid duplication of code 
    - we can use through using the object reference with the class name
      ex: Apple a = new Apple(23);
          Apple a2 = new Apple(a,"red");//initializing 
          
          Apple(Apple.a, String col){
          }
 */

/*we have two keywords to invoke the data members in constructors 
   1.this
     - this keyword is used to call the value from the current class 
   2.super 
     - super keyword is used to call the value from the parent class
  we have two types of calling methods to call the constructors inside another constructor
   1. this()
     - this() is used to call the constructor of the current class constructors
     - we use this achieve the constructor chaining 
     - we can only use one method calling for constructor in a constructor
     - It must be the first statement within the constructor until java24.
     - from JAVA25 it can be in anywhere in the constructor
   2. super()
     - super() is used to call constructor of the parent class 
     - if we create any constructor in child class then super() is 
       definitely is called in the parent class,if we call a explicit super() calling
       then it will not called  
     - we can only use one method calling for constructor in a constructor 
     - It must be the first statement within the constructor until java24.
     - from JAVA25 it can be in anywhere in the constructor
   */ 

public class Constructor1 {
	String name = "abc";
	int rollNo = 20;
	double salary = 23000;

	// no-arg constructor
	Constructor1() {
		System.out.println("no-arg constructor");
		name = "unknown";
		rollNo = 0;
		salary = 0.0;
	}

	// parameterized constructor
	Constructor1(String name, int rollno, double salary) {
		this.name = name;
		this.rollNo = rollno;
		this.salary = salary;
	}

	void show() {
		System.out.println("Name:" + name);
		System.out.println("RollNo:" + rollNo);
		System.out.println("Salary:" + salary);
	}

	public static void main(String[] args) {
		Constructor1 obj = new Constructor1();
		obj.show();

		Constructor1 obj1 = new Constructor1();
		obj1.name = "bhanu";
		obj1.rollNo = 42;
		obj1.salary = 50000;
		obj1.show();

		Constructor1 obj3 = new Constructor1("gowtam", 27, 34000);
		obj3.show();

	}

}
