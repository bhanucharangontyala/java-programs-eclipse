package student;

public class LibrarySystem {
	
	static int maxBooksAllowed;
	int memberId;
	int booksIssued;
	static int nextId = 20000;
	
	
	static {
		maxBooksAllowed = 5;
	}
	
	
	{
		memberId  = nextId;
		nextId++;	
	}
	
	static void displayLibraryRules(){
		System.out.println("********Welcome Library System");
		System.out.println("One Student Can Only Borrow 5 Books !!");
	}
		
	void displayDetails(){
		System.out.println("member Id : " + memberId);
		System.out.println("BooksBorrowed : " + booksIssued);	
	}
	
	void issueBooks(int n){
		if(n <= maxBooksAllowed) {
			booksIssued = n;
			int remaining = maxBooksAllowed - n;
			System.out.println("Remaining :" + remaining );
		} else {
			booksIssued  = maxBooksAllowed;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		displayLibraryRules();
		
		LibrarySystem obj1 = new LibrarySystem();
		System.out.println(obj1.memberId);
		obj1.issueBooks(3);
		obj1.displayDetails();
	
		LibrarySystem obj2 = new LibrarySystem();
		System.out.println(obj2.memberId);
		obj2.issueBooks(5);
		obj2.displayDetails();
		
		LibrarySystem obj3 = new LibrarySystem();
		System.out.println(obj3.memberId);
		obj3.issueBooks(8);
		obj3.displayDetails();
	}

}
