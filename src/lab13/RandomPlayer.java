package lab13;

//import java.util.concurrent.ThreadLocalRandom;

public class RandomPlayer extends Player {
	
	public RandomPlayer(String name) {
		super(name);
	}
	
	public Roshambo generateRoshambo() {  				//note that the return type is Roshambo, which is the enum. we're saying, return rock, paper, or scissors depending on the random number that is generated between 1 and 3.
		int rIndex = (int) (Math.random() * 3);
//		int random = ThreadLocalRandom.current().nextInt(1, 4);  //this is another way to get a random number
		
		return Roshambo.values()[rIndex];
		
//		switch (random) {
//		case 1:
//			return Roshambo.ROCK;
////			break; no breaks, becasue return
//		case 2:
//			return Roshambo.PAPER;
////			break; no breaks, becasue return
//		case 3:
//			return Roshambo.SCISSORS;
////			break; no breaks, becasue return
//		default :
//			return null;
//		}
	}
}
