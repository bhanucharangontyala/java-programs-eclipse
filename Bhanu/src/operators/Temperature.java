package operators;

//task-2 30-10-25
public class Temperature {

	double cToF(int celcius) {
		return ((celcius * 9 / 5) + 32);
	}

	int fToC(double farenheat) {
		return (int) ((farenheat - 32) * 5 / 9);
	}

	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		System.out.println(t1.cToF(36));
		System.out.println(t1.fToC(96.8));
	}

}
