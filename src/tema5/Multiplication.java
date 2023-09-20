package tema5;

import java.util.Scanner;

public class Multiplication {
	
	int num;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		num = scan.nextInt();
	}
	
	public void doMultiplication() {
		
		for (int i = 1; i <= 10; i++) {
			int m = num * i;
			System.out.println(num + " * " + i + " = " + m);
		}
	}

}
