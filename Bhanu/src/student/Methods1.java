package student;
//methods are used for reusability of the code
	//method is a block of code to perform the functionalites as per the requirments
	//syntax 
	//1. return_type method_name (){
	//	 statements		
	//	 }
	//2. <access modifiers> <modifiers> return_type method_name (<arguments>){
	//	 statements
	//	 }
	//types of methods are two divisions
	//1. pre-defined methods - like println ,System, etc..
	//2. user-defined methods - show, display, etc.. 
	//if method is of any division it two types 
	//1. static methods 2. instance methods
	//we have few other method types
	//3.abstract methods 4.final methods 5.synchronized methods 6.factory methods
	//7.default methods
	//ways to call methods 
	//four ways
	//1. no return_type + no arguments 
	//2. no return_type + with arguments 
	//3. with return_type + no arguments 
	//4. with return_type + with arguments 

public class Methods1 {
	int a = 10;
	int b = 20;
	//1. no return_type + no arguments 
	void add() {
		System.out.println(a + b);
	}
	
	//2. no return_type + with arguments 
	void add1(int a,int b) {
		System.out.println(a + b);
	}
	
	//3. with return_type + no arguments 
	int add2() {
		System.out.println("hello");
		return a+b;
	}
	
	//4. with return_type + with arguments 
	int add3(int a,int b) {
		System.out.println();
		return a+b;
	}
	
	void main() {
		System.out.println("hello");
		add();
		add1(10,20);
		add2();
		add3(10,20);
	}

}
