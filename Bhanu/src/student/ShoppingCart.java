package student;

public class ShoppingCart {
	String itemName;
	double price;
	int quantity;
	double total;
	double discountAmount;
	
	static{
		System.out.println("Welcome to ShoppingCart");
	}
	
	public void calculateTotal() {
		System.out.println("itemname : "+itemName);
		System.out.println("quantity : "+ quantity);
		total = price * quantity;
		System.out.println("Total Amount : " + total);
		applyDiscount(total);
	}
	
	public void applyDiscount(double total) {
		
		discountAmount = total/10;
		System.out.println("discount amount : " + discountAmount);
		total = total-discountAmount;
		System.out.println("Amount After Discount : " + total);
		System.out.println();
	}
	  
	
	public static void main(String[] args) {
		ShoppingCart item1 = new ShoppingCart();
		item1.itemName = "tomato";
		item1.price = 36;
		item1.quantity = 2;
		item1.calculateTotal();
		
		ShoppingCart item2 = new ShoppingCart();
		item2.itemName = "oranges";
		item2.price = 78.5;
		item2.quantity = 2;
		item2.calculateTotal();

	}

}
