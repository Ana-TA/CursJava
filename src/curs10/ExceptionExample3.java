package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter number1: ");
			int num1 = scan.nextInt();
			System.out.println("Please enter number: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			
			System.out.println("Division: " + num1/num2);
			
		}catch(ArithmeticException e) {
			System.out.println("Nu mai imparti la 0");
			System.out.println(e.getMessage());
			
		}catch (InputMismatchException e) {
			System.out.println("Introdu doar numere");
			System.out.println(e.getMessage());
			
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter number1: ");
			int num1 = scan.nextInt();
			System.out.println("Please enter number: ");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			
			System.out.println("Division: " + num1/num2);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
