package casestudy;

public class MobileShop {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(101, "OPPO", "F 15", 21000.00, 5);
		m1.addStock(2);
		m1.sellPhones(4);
		m1.generateBill();
	}

}
