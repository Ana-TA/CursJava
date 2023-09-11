package curs3;

import java.util.Scanner;

/*
 * Facem un program care verifica daca autentificarea este corecta.
 * User: Test
 * Pass: 1234
 * Daca auth. este corect, printam login succesfull
 * daca auth. este gresit, printam username sau parola gresita.
 */
public class IfElseExample {

	public static void main(String[] args) {
		String user = "Test";
		int pass = 1234;
			
		String inputUsername;
		int inputPassword;
		
		System.out.println("Te rog introdu username:");
		Scanner scan = new Scanner(System.in);
		inputUsername = scan.next();
		System.out.println("Te rog introdu o parola:");
		inputPassword = scan.nextInt();
		
		//&& --> operator AND
		//--> || --> operator OR
		
		//comparam valoarea nu adresa memoriei.
		//in Java Stringurile se compara cu equals, nu cu ==
		if((inputUsername.equals(user)) && (inputPassword==pass)) {
			System.out.println("login succesull!");
			
		}else {
			System.out.println("login failed!");
		}
		

	}

}
