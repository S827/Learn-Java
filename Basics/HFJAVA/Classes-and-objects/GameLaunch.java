
class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNum = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true){
			System.out.println("Number to be guessed is " + targetNum);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.n;
			System.out.println("Player1 guessed " + guessp1);
			guessp2 = p2.n;
			System.out.println("Player2 guessed " + guessp2);
			guessp3 = p3.n;
			System.out.println("Player3 guessed " + guessp3);
			
			if(guessp1 == targetNum){
				p1isRight = true;
			}
			if(guessp2 == targetNum){
				p2isRight = true;
			}
			if(guessp3 == targetNum){
				p3isRight = true;
			}
			if(p1isRight || p2isRight || p3isRight){
				System.out.println("We have a winner!");
				System.out.println("Player1 got it right? " + p1isRight);
				System.out.println("Player1 got it right? " + p2isRight);
				System.out.println("Player1 got it right? " + p3isRight);
				System.out.println("Game Over!");
				break;
			} else {
				System.out.println("Play again");
			}

		}
	}
}
class Player {
	int n = 0;
	public void guess() {
		n = (int)(Math.random()*10);
		System.out.println("I'm guessing " + n);
	}
}
public class GameLaunch {
	public static void main(String[] args){
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
