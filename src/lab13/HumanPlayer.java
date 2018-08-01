package lab13;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	//this is a private variable. we don't need other classes to know about it, so we actually don't need to set
	//getters or setters.
	private Scanner scnr;
	
	//constructor; does not return anything, not even void:
	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override //this @Override annotation reminds us that we are overriding the generateRoshambo() method in the Player class.
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scnr, "Would you like to play rock, paper, or scissors? ", "rock|paper|scissors");
		if(choice.equals("rock")) {
			return Roshambo.ROCK;
		} else if (choice.equals("paper")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	
	}

}
