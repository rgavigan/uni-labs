
public class Person implements Comparable<Person> {
	
	/* Attribute declarations */
	private String name;
	private String city;
	private String email;
			
	/**
	 * Constructor initializes the person's name and email address
	 */
	public Person(String name, String email, String city) {
		this.name = name;
		this.email = email;
		this.city = city;
	}

	/**
	 * toString to display the person's info in a clean format
	 * return String of the person's info
	 */
	public String toString() {
		String s = String.format("%10s\t\t%30s\t\t%10s", name, email, city);
		return s;
	}



    // 3 Public Getter Methods
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}
	
	// 3 Private Helper Methods
	private int compareByName(Person other) {
		if (this.getName().compareTo(other.getName()) > 0) {
			return 1;
		}
		else if (this.getName().compareTo(other.getName()) == 0) {
			return 0;
		}
		return -1;
	}
	
	private int compareByEmail(Person other) {
		if (this.getEmail().compareTo(other.getEmail()) > 0) {
			return 1;
		}
		else if (this.getEmail().compareTo(other.getEmail()) == 0) {
			return 0;
		}
		return -1;
	}
	
	private int compareByCity(Person other) {
		if (this.getCity().compareTo(other.getCity()) > 0) {
			return 1;
		}
		else if (this.getCity().compareTo(other.getCity()) == 0) {
			return 0;
		}
		return -1;
	}


	/**
	 * compareTo determines the order of the contacts
	 */
	public int compareTo(Person other) {
        // Write your code here     
		if (ContactList.sortBy == 'n') {
			return this.compareByName(other);
		}
		else if (ContactList.sortBy == 'e') {
			return this.compareByEmail(other);
		}
		return this.compareByCity(other);
	}

}