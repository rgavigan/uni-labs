
public class TestLab {

	public static void main(String[] args) {
	/**
	 * Instantiate a new Player object using my own name
	 */
		Player p1 = new Player("Riley Gavigan", "Center", 17);
	/**
	 * Use Getter methods to get information for Player
	 */
		System.out.println(p1.getName());
		System.out.println(p1.getPosition());
		System.out.println(p1.getJerseyNum());
	/**
	 * Use Setter methods to change all three values
	 */
		p1.setName("Riley Horne");
		p1.setPosition("Defense");
		p1.setJerseyNum(20);
	/**
	 * Re-print with new values
	 */
		System.out.println(p1.getName());
		System.out.println(p1.getPosition());
		System.out.println(p1.getJerseyNum());
	/**
	 * Print out the p1 Player object itself
	 */
		System.out.println(p1);
	/**
	 * Create a new Player and instantiate with setter values
	 */
		Player p2 = new Player("Riley Horne", "Defense", 20);
	/**
	 * Compare the two objects
	 */
		if (p1.equals(p2)) {
			 System.out.println("Same player");
			} else {
			 System.out.println("Different player");
			}
		
	}

}
