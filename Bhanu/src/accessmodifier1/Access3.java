package accessmodifier1;

//final
//  - this modifier means unchangeable or constant
//  - this can be used for classes, inner classes, variables, methods
//  - for variables we cannot change the value of initialization
//  - methods declared as final cannot be overridden 
//  - final classes cannot be extended 

//transient
//  - this modifier can be used only for variables
//  - tells the Java Serialization mechanism to skip that variable when 
//    writing the object to a stream.

//volatile
//  - this modifier can be used only for variables
//  - it tells the JVM that the value of the variable will be modified
//    by multiple threads

//native 
//  - this modifier can only be used for methods
//  - it used to declare the method that is implemented in another language 
//    like c and python.

public class Access3 {

	public static void main(String[] args) {
		Access1 obj = new Access1();
		obj.show();
	}

}
