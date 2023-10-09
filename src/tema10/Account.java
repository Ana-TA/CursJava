package tema10;

import java.util.Scanner;


public class Account {
	
	private int accountNumber;
	public double balance;
	private String name, address, email;
	Customer accountOwner = new Customer(name, address, email);
	
	public void widraw() throws InsufficientFundsException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to widraw: ");
		int amount = scan.nextInt();
		
		if (amount > balance) {
			System.out.println("The amount is greater than the available balance: " + balance);
			throw new InsufficientFundsException ("Insufficient funds for transaction.");	
		}

	}

}
