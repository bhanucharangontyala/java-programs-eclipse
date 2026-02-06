package constructors;

public class Movie {
	String title;
	String director;
	float rating;

	Movie() {
		title = "unknown";
		director = "unknown";
		rating = 0;
	}

	Movie(String title, String director, float rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}

	void show() {
		System.out.println("Movie Title :" + title);
		System.out.println("Movie Director :" + director);
		System.out.println("Movie Rating :" + rating);
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.show();

		Movie m2 = new Movie("Bahubali", "Rajamouli", 4.5f);
		m2.show();
	}

}
