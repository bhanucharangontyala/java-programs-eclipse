package com.oops1;

public class MethodOverriding {

//	- Inheritance is the one of the four pillars of the java
//	- we use inheritance in order to the code reusability
//	- In inheritance we Use functionalities from parent,super,base class to 
//	  sub,child,derived class 
//	- In this process if the child does not satisfy with the parent class functionalities,
//	  Then we go for the Overriding concept
//	- Overriding is the process of changing the functionalities of parent class in child class
//	- In order to Achieve this we need to follow 8 Rules
//	- 1. The method Signature Must be same in parent and child
//		 - Where Method Signature means method name + method arguments
//		 - but it does not include the return type
//			ex: public int add (int a,int b) {
//						   (Method Signature)
//			}
//	- 2. The return type must be the same until Java 1.4, After that from 1.5 they introduced 
//		 co-varient data types
//		 - it means object data type have their sub types 
//		 - from 1.5 all the primitive data type should be same in parent and child 
//		 - where object data types can be same or their sub types
//		 - but reverse can not happen
//	     - But if it is String we have to use String in child because String class is final 
//		   ex: Number is object data type it have sub types of Integer, Double, etc...
//			   class A{
//				   public Number div() {
//					   return 500;
//				   }
//			   }
//			   class B extends A{
//				   @Override
//				public Number div() {
//					return 1000;
//				}
//				  
//			   }
//	- 3. The scope should not be reduced
//		  - it means if we declare public for a method in parent class, We must declare public 
//		    in child class also
//		  - for protected we can use either protected or public 
//		  - for <default> we can use either <default> or protected or public
//		  - Whereas for private methods we cannot override them
//			   class A{
//				   Number div() {
//					   return 500;
//				   }
//			   }
//			   class B extends A{
//				   @Override
//				protected Number div() {
//					return 1000;
//				}
//				  
//			   }
//	- 4. The private methods cannot be override but, to use them in child we have remove the 
//		 @override annotation to the method it works as child class method and it works without
//		 any compile or runtime errors
//			  class A{
//				   private Number div() {
//					   return 500;
//				   }
//			   }
//			   class B extends A{
//				   @Override(We get Compile Time Error)
//				without annotation
//				public Number div() {
//					return 1000;
//				}
//			   }
//	- 5. static methods can not be override because the compiler will load the static related 
//	     information when class is loaded where as overriding is concept which perform at 
//	     runtime 
//	     - still we can use them in child class without using @override annotation it works 
//	       without any problems
//	     - this process is called as Method Hiding
//		          class A{
//					   static Number div() {
//						   return 500;
//					   }
//				   }
//				   class B extends A{
//					   @Override(We get Compile Time Error)
//					without annotation
//					static Number div() {
//						return 1000;
//					}
//				   }
//	- 6. final methods can not be overridden because overriding is the concept of changing 
//	     functionalities where final means fixed we cannot change it and we cannot extends 
//	     the final class so inheritance is not possible for overriding
//	     - but still we can use them without using @override annotation
//	     - Every method in final class is final
//	     - In final class every variable need not to be final
//	     - but still we can access the final methods using the class object 
//	           final class A{
//				   final Number div() {
//					   return 500;
//				   }
//			   }
//			   class B extends A{
//				   @Override(We get Compile Time Error)
//				without annotation
//				final Number div() {
//					return 1000;
//				}
//			   }
//	- 7. Whenever Parent throws any exception child need not to throw any exception
//	     whereas when a child throws any exception parent should throws the same exception
//	     or the parent of the exception
//	     - the reverse of this not possible
//	     - ex: class A{
//	    	 void b() throws Exception{
//	    		 System.out.println("Hii");
//	    	 }
//	     }
//		  class C extends A{
//			  @override
//			  void b() throws InterruptedException{
//				  System.out.println("How Are You");
//			  }
//		  }
//	- 8. In a abstract parent class we have abstract method ,Then it should be overridden in 
//	     the child class, because for the abstract methods we do not have the implementation
//	     - whereas if the child is again extended into another abstract class then the 
//	     implemented methods can be declared as abstract 
//			abstract class A{
//				abstract void hello();
//			}
//			class B extends A{
//				@override 
//				void hello() {
//					System.out.println("Hey hii !..");
//				}
//			}
//	        abstract class C extends B{
//	        	abstract void hello();
//	        }

	
	public static void main(String[] args) {
		
	}

}
