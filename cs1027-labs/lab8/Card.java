
public class Card implements Comparable<Card> {
	
	private String suit; // Spades, Hearts, Diamonds, or Clubs
	private String rank; // Ace, 2, 3, ..., 10, Jack, Qeen), or Kng

	public Card (String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit () {
		return suit;
	}
	
	public String getRank () {
		return rank;
	}
	
	public void setSuit (String suit) {
		this.suit = suit;
	}
	
	public void setRank (String rank) {
		this.rank = rank;
	}
	
	public String toString () {
		return rank + " of " + suit;
	}
	
	// Equals method
	public boolean equals(Card other) {
		if (this.getRank() == other.getRank() && this.getSuit() == other.getSuit()) {
			return true;
		}
		return false;
	}
	
	// Method to return integer value for suit value
	public int getSuitValue() {
		if (this.getSuit() == "Diamonds") {
			return 1;
		}
		else if (this.getSuit() == "Clubs") {
			return 2;
		}
		else if (this.getSuit() == "Hearts") {
			return 3;
		}
		else if (this.getSuit() == "Spades") {
			return 4;
		}
		return -1;
	}
	
	// Method to return integer value for rank value
	public int getRankValue() {
		if (this.getRank() == "2") {
			return 2;
		}
		else if (this.getRank() == "3") {
			return 3;
		}
		else if (this.getRank() == "4") {
			return 4;
		}
		else if (this.getRank() == "5") {
			return 5;
		}
		else if (this.getRank() == "6") {
			return 6;
		}
		else if (this.getRank() == "7") {
			return 7;
		}
		else if (this.getRank() == "8") {
			return 8;
		}
		else if (this.getRank() == "9") {
			return 9;
		}
		else if (this.getRank() == "10") {
			return 10;
		}
		else if (this.getRank() == "Jack" || this.getRank() == "Queen" || this.getRank() == "King") {
			return 11;
		}
		else if (this.getRank() == "Ace") {
			return 12;
		}
		return -1;
	}

	// Method to compare two cards
	public int compareTo(Card other) {
		// TODO Auto-generated method stub
		if (this.equals(other)) {
			return 0;
		}
		else if (this.getRankValue() != other.getRankValue()) {
			if (this.getRankValue() > other.getRankValue()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else if (this.getSuitValue() == other.getSuitValue()) {
			return 1;
		}
		return 0;
	}

}
