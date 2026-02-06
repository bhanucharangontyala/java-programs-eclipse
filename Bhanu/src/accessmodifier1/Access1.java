package accessmodifier1;

//Access Modifiers
//Private 
//  - This Modifier is used to Inner classes, Variables,Methods,Constructors only 
//  - if we use for classes or interfaces it will get Illegal modifier 
//  - the block scope is the class scope we cannot us any modifier to blocks
//  - if we use private to the constructor we can not use that constructor in 
//    another classes because the scope is within the class

//<default>
//  - this modifier can be used for all except blocks
//  - the scope of this modifier is within the package
//  - we need not to specify the modifier explicitly if we not give any 
//    modifier then its <default>

//protected
//  - this modifier can be used for inner classes, variables, methods,
//    constructors not for blocks, classes and interfaces 
//  - the scope if this modifier is class scope it is the reason for
//    not using for classes and interfaces
//  - if protected is used we cannot access outside of the class

//public
//  - this modifier can be used for all except blocks
//  - the scope of this modifier is project level
//  - we can access anywhere in the project


public class Access1 {
	  
	public Access1() {
		System.out.println("No Arg Constructor Is called ");
	}

	static {
		System.out.println("Static block is called");
	}

	{
		System.out.println("Instance Block Is called");
	}

	private int a = 10;

	void show() {
		System.out.println("The Number is :" + a);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

	}

}
