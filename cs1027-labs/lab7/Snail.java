
public class Snail {
	
	public static char icon = '@';
	private int position;
	private QueueADT<Integer> movePattern;
	
	public Snail (int[] pattern) {
		position = 0;
		// To add to movePattern from pattern
		movePattern = new LinkedQueue<Integer>();
		for (int i = 0; i < pattern.length; i++) {
			movePattern.enqueue(pattern[i]);
		}
	}
	
	public void move () {
		int step = movePattern.dequeue();
		movePattern.enqueue(step);
		int desiredPos = position + step;
		if (desiredPos > SnailRace.raceLength) {
			position = SnailRace.raceLength;
		}
		else {
			position = desiredPos;
		}	
	}
	
	public int getPosition () {
		return position;
	}
	
	public void display () {
		int dashesBefore = position;
		int dashesAfter = SnailRace.raceLength - position;
		
		System.out.print("-".repeat(dashesBefore) + "@" + "-".repeat(dashesAfter) + "\n");
	}

}
