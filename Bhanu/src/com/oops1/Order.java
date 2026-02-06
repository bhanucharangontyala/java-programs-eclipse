package com.oops1;

public class Order {
	private int orderId;
	private String itemName;
	private int quantity;
	private String status;

	public Order(int orderId, String itemName, int quantity, String status) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.status = status;
	}

	public void setQuantity(int quantity) {
		if (quantity > 1) {
			this.quantity = quantity;
		}
	}

	public void updateOrderStatus(String status) {
		if (this.status.equals("placed")) {
			this.status = status;
		}
	}

	public void showDetails() {
		System.out.println("Order Id :" +orderId);
		System.out.println("Item Name :" +itemName);
		System.out.println("Quantity :" +quantity);
		System.out.println("Status :" +status);
	}
}
