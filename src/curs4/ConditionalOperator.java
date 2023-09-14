package curs4;

import java.util.Scanner;

/*
 * Citim 2 numere de la tastatura.
 * Verificam fiecare numar daca este pozitiv sau negativ.
 * Verificam daca ambele numere sunt pozitive
 * Verificam care dintre cele 2 nr este cel mai mic tinand cont ca ar putea fi egale.
 * Printam: Este pozitiv sau este negativ.
 */

public class ConditionalOperator {
	
	int num1, num2;
	
	private void askTheUSer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter tfirst number:");
		num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
	}
	
	public void verifyTheNumbers() {
		
		if (num1 > 0) {
			System.out.println("Este pozitiv!");
		}else {
			System.out.println("Este negativ!");
		}
		
		String result = (num1 > 0)? "Este pozitiv" : "Este negativ";
		System.out.println(result);
		
		//verific num2
		result = (num2 > 0)? "Este pozitiv" : "Este negativ";
		System.out.println(result);
		
		//verific daca ambele sunt pozitive sau negative
		result = ((num1 > 0) && (num2 > 0))? "Sunt pozitive" : "Sunt negative";
		System.out.println(result);
		
		//verific care este mai mare (ar putea fi egale)
		result = (num1 >= num2)? "Num1 is the greatest" : (num2>num1)? "Num2 is the greatest" : "Numbers are equal";
	}

}
