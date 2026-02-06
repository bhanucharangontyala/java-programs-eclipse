package com.oops1;

public class Restaurant {

	public static void main(String[] args) {
		Order ord1 = new Order(101, "Chicken Biryani", 1, "placed");
		ord1.setQuantity(3);
		ord1.updateOrderStatus("delivered");
		ord1.showDetails();

	}

}
