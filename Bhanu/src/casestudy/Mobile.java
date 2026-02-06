package casestudy;

public class Mobile {
	private int mobileId;
	private String brandName;
	private String modelName;
	private double price;
	private int stock;
	private double totalAmount;

	public Mobile(int mobileId, String brandName, String modelName, double price, int stock) {
		super();
		this.mobileId = mobileId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.stock = stock;
	}

	public void addStock(int qty) {
		if (qty > 0) {
			stock += 1;
		} else {
			System.out.println("Invalid Stock");
		}
	}

	public double sellPhones(int qty) {
		if (stock > 0 && qty <= stock && qty >0) {
			totalAmount += (price * qty);
			stock -= qty;
		} else {
			System.out.println("Stock not Available (or) Inavalid Quantity");
		}
		return totalAmount;
	}

	public void generateBill() {
		System.out.println("-------------------------");
		System.out.println("| Sri Vinayaka Mobiles  |");
		System.out.println("| MobileId : " + mobileId + "        |");
		System.out.println("| Brand Name :" + brandName + "      |");
		System.out.println("| Model Name :" + modelName + "      |");
		System.out.println("| Price :" + price + "        |");
		System.out.println("| Available Stock :" + stock + "    |");
		System.out.println("| Total Amount :" + totalAmount + " |");
		System.out.println("|                       |");
		System.out.println("| ******Thank You****** |");
		System.out.println("| *****Visit Again***** |");
		System.out.println("-------------------------");
	}
}
