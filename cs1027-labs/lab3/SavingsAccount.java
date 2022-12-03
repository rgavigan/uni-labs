public class SavingsAccount extends BankAccount {

	// Instantiate instance variable interestRate
	private double interestRate;

	
	// Constructor with two parameters of type double for initialAmount inherited from BankAccount, and rate
	public SavingsAccount(double initialAmount, double rate) {
		super(initialAmount);
		interestRate = rate;
	}
	
	
	// Public getter method for interest rate
	public double getInterestRate() {
		return interestRate;
	}
	
	// Public calculate interest method for one month's interest
	public void calculateInterest() {
		double balance = getBalance();
		balance = interestRate * balance;
		super.deposit(balance);
	}
	
	// Return string representation of instance variables
	public String toString() {
		return "SavingsAccount: balance $" + getBalance() + ", interest rate " + interestRate;
	}

	
	public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(100.0,0.15);
		myAccount.calculateInterest();
		System.out.println(myAccount.toString());
	}
}
