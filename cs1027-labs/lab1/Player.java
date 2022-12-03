
/**
 * This class represents a hockey player. Each player has
 * a name, position, and jersey number.
 * @author Riley Gavigan - 251150776
 *
 */

public class Player {
/**
 * Name, position, and jerseyNum of player
 */
	private String name;
	private String position;
	private int jerseyNum;
	
/**
 * Constructor method with three parameters for players
 * @param name of the player
 * @param position of the player
 * @param jerseyNum of the player
 */
	public Player(String name, String position, int jerseyNum) {
	/**
	 * This is the constructor so we will be
	 * initializing the member variables here
	 */
		
		this.name = name;
		this.position = position;
		this.jerseyNum = jerseyNum;
	}
	
/**
 * Getter method that returns the player's name
 * @return player's name
 */
	public String getName() {
		// Get the player's name
		return name;
	}


/**
 * Getter method that returns the player's position
 * @return player's position
 */
	public String getPosition() {
		return position;
	}
	

/**
 * Getter method that returns the player's jersey number
 * @return player's jersey number
 */
	public int getJerseyNum() {
		return jerseyNum;
	}


/**
 * Setter method that returns the player's name
 * @param newName of player
 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	
	
/**
 * Setter method that returns the player's position
 * @param newPosition of player
 */
	public void setPosition(String newPosition) {
		this.position = newPosition;
	}
	
	
/**
 * Setter method that returns the player's jersey number
 * @param newJerseyNum of player
 */
	public void setJerseyNum(int newJerseyNum) {
		this.jerseyNum = newJerseyNum;
	}

/**
 * toString method that will return a String type
 * @return String of player
 */
	public String toString() {
		return this.name + ": #" + this.jerseyNum;
	}
	
/**
 * Equals method with boolean return type
 * @param other player object to compare to
 * @return true of false, depending on equality of name and jerseyNum
 */
	public boolean equals(Player other) {
		if (this.name.equals(other.name) && this.jerseyNum == other.jerseyNum) {
			return true;
		}
		else {
			return false;
		}
	}
}
