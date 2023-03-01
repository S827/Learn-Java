class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("Playing the movie");
	}
}
public class MovieTest {
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "The Blacklist";
		one.genre = "Thriller and Crime";
		one.rating = 6;
		
		Movie two = new Movie();
		two.title = "ZZombies";
		two.genre = "Disaster";
		two.rating = -1;
		two.playIt();
		
		Movie three = new Movie();
		three.title = "off to road";
		three.genre = "adventure";
		three.rating = 8;
	}
}