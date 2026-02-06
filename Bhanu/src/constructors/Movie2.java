package constructors;
//23-10-25 task

//constructor chaining 

public class Movie2 {
	String title;
	String director;
	double rating;

	Movie2() {
		this("Bahubali");
//		System.out.println("no-arg constructor");
	}

	Movie2(String title) {
		this(title, "rajamouli");
//		System.out.println("one-arg constructor");
	}

	Movie2(String title, String director) {
		this(title, director, 4.5);
//		System.out.println("two-arg constructor");
	}

	Movie2(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
//		System.out.println("all-arg constructor");
	}

	void show() {
		System.out.println("Movie Title :" + title);
		System.out.println("Movie Director :" + director);
		System.out.println("Movie Rating :" + rating);
	}

	public static void main(String[] args) {
		Movie2 m1 = new Movie2();
		m1.show();

	}

}