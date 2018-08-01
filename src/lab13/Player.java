package lab13;

public abstract class Player {
//we know Player has a name:
	private String name;
	
	//you don't always have to give a getter and a setter. setter just means we could change the name later.
	//we don't need to do that, so we'll just give it a getter.
	
	//constructor: (note: Constructors have no return type and same name as the class)
	public Player(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	//return on of ROCK, PAPER, or SCISSORS:
	abstract public Roshambo generateRoshambo(); //this is type Roshambo which is an enum
	
	public String toString() {
		return "Player " + name;
	}
}


//part of setting up a RockPlayer is setting up a new Player. when you create the rock player, it's going to have to delegate to the player,
//which is why we have to have these java bean things even though it's abstract (is that right??)