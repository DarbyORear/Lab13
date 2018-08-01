package lab13;

//Darby O'Rear 7/31


import java.util.Arrays;
import java.util.Scanner;

public class RoshamboApp {
	
    int opponent;    
	String input;

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
																		
		System.out.println("Hello! Welcome to Rock, Paper, Scissors!");
		System.out.println();
		String cont = "y";
		do {
		//Create user as a HumanPlayer
		String humanName = Validator.getString(scnr, "Please enter your name: ");
		HumanPlayer human = new HumanPlayer(humanName, scnr);
		System.out.println();
		
		
		//creates challenger as a ComputerPlayer
		int opponent = Validator.getInt(scnr, "Select your opponent(1 or 2): ", 1, 2);
		System.out.println();
	Player challenger;
			if(opponent == 1) {
			challenger = new RandomPlayer("Randy");
			System.out.println("You are playing Randy!\n");
				} else {
					challenger = new RockPlayer("Rocky");
					System.out.println("You are playing Rocky!\n");
		}
			
		
		//game loop structure:

			playTheGame(human, challenger);
			System.out.println();									
			
//			System.out.println("Would you like to play again?"); 	
		cont = Validator.getString(scnr, "Would you like to play again? (y/n?)");
		} while (cont.equals("y"));
		
	}

		
		
	private static void playTheGame(HumanPlayer human, Player challenger) { 			
		
		Roshambo input = human.generateRoshambo(); 				//human's turn
		
		Roshambo computerOutput = challenger.generateRoshambo();//computer's turn
	
		
		System.out.println();
		System.out.println("Your move: " + input);							
		System.out.println("Oppenent's move: " + computerOutput + "\n");
		
	
		if(input == computerOutput) {
			System.out.println("You tied with " + challenger.getName() + "!");
		} else if((input == Roshambo.ROCK && computerOutput == Roshambo.SCISSORS) || 
				(input == Roshambo.SCISSORS && computerOutput == Roshambo.PAPER) ||
				(input == Roshambo.PAPER && computerOutput == Roshambo.ROCK )) {
					System.out.println("Congratulations, " + human.getName() +"! You win!");
		} else {
			System.out.println("Sorry, " + human.getName() + ". You lost.");
		}
		
	}
	}
		

