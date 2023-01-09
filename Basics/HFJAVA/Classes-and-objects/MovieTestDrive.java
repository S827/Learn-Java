class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt() {
		System.out.println(title + " Playing..." + " Genre " + genre + " Movie Rating: " + rating);
	}
}
public class MovieTestDrive{
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Titanic";
		one.genre = "Drama";
		one.rating = 7;
		
		Movie two = new Movie();
		two.title = "Fight Club";
		two.genre = "Crime";
		two.rating = 9;
		
		Movie three = new Movie();
		three.title = "Cast Away";
		three.genre = "Adventure";
		three.rating = 9;
		
		one.playIt();
		two.playIt();
		three.playIt();
	}
}