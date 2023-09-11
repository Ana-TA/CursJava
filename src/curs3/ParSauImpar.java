package curs3;

import java.util.Scanner;

/*
 * Daca numarul este par: printeaza numarul este par
 * Daca numarul este impar: printeaza numarul este impar
 */
public class ParSauImpar {
	
	int number;
	
	public void askTheUserForANumber()
	{
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}
	
	public int askTheUserForANumber2()
	{
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public String CheckParSauImpar(int number) {
		
		if (number %2 == 0) {
			return "Numarul este par!";
			
		}else {
			return "Numarul este impar!";
		}
		
	}
	
	public String CheckParSauImpar2() {
		
		if (askTheUserForANumber2() %2 == 0) {
			return "Numarul este par!";
			
		}else {
			return "Numarul este impar!";
		}
		
	}

}
