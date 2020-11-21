package EX2T4;

/**
 * 
 * @author GR
 *
 */

public class BankAccount {
	
	private static double balance ;
	private double interest ;
	
	public BankAccount() {
		BankAccount.balance = 0.0 ;
		this.interest = 0.0 ;
	}
	
	public double getBalance() {
		return balance ;
	}
	
	public boolean put(double num1) {
		if(num1 > 0) {
			BankAccount.balance += num1 ;
			return true ;
		}
		return false ;
	}
	
	public double get(double num2) {
		if(num2 <= BankAccount.balance)
			BankAccount.balance -= num2 ;
		else
			BankAccount.balance = 0 ;
		return balance ;
		}
	
	public double getInterest() {
		return interest ;
	}
	
	public double setInterest(double value) {
		this.interest = value ;
		return 0;
	}
	
}
