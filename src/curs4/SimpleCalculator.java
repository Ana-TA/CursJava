package curs4;

import java.util.Scanner;

/*
 * Un calculator care are operatiile: (+)adunare, (-)scadere, *(inmultire), / (impartire)
 * intrebam userul primul numar
 * intrebam userul operatia matematica
 * intrebam userul al 2lea numar
 * printam rezulatul
 * Ex: 2 + 2 = 4
 */

public class SimpleCalculator {
	
	int num1, num2;
	char operator;
	int result = 0;
	
	/*
	 * masina   masina.charAt(3) == "i"
	 * 012345   masina.length == 6
	 */
	
	private void askTheUSer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the operator:");
		operator = scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
		
	}
	
	public void simpleCalculator() {
		askTheUSer();
		int result = 0;
		boolean flag = true;
		
		if ( operator == '+' ) {
			result = num1 + num2;
		} else if ( operator == '-' ) {
			result = num1 - num2;
		} else if ( operator == '*' ) {
			result = num1 * num2;
		} else if ( operator == '/' ) {
			result = num1 / num2;
		} else {
			System.out.println("Wrong operation!");
			flag = false;
		}
		
		if (flag) {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
	}
	
	//public void PrintResult() {
		//System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	//}

}
