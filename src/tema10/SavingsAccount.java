package tema10;

import java.util.Scanner;

public class SavingsAccount extends Account {
	
	private int accountNumber;
	public double balance;
	private String name, address, email;
	
	Customer accountOwner = new Customer(name, address, email);

	public void SavingsAcoount(Customer accountOwner, double balance, int accountNumber) {
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void widraw(int accountNumber) throws InsufficientFundsException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to widraw: ");
		int amount = scan.nextInt();
		
		if (amount <= 0) {
			System.out.println("Please enter a valid balance!");
		}else if (amount > balance) {
			System.out.println("The amount is greater than the available balance: " + balance);
			System.out.println("Thank you for using our ATM!");
			throw new InsufficientFundsException ("Insufficient funds for transaction.");	
		}else {
			double newBalance = balance - amount;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + newBalance);
			System.out.println("Thank you for using our ATM!");
		}

	}

}
