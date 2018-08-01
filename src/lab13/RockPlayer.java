package lab13;

public class RockPlayer extends Player {

	//constructor
	public RockPlayer(String name) {     //the name parameter is the only thing that needs to be added to the constructor
		super(name); //super has to be called first
	}

public Roshambo generateRoshambo() {
	return Roshambo.ROCK;   //this player will always return rock
}
	
	
}











//the whole point of an abstract method is that you have to implement it in the subclasses.