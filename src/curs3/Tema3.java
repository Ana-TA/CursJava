package curs3;

import java.util.Scanner;

public class Tema3 {

	public static void main(String[] args) {
		
		System.out.println("Ce varsta ai?");
		Scanner scan = new Scanner(System.in);
		int inputVarsta = scan.nextInt();
		
		if (inputVarsta < 18) {
			System.out.println("Esti minor!");
		}
		else {
			if (inputVarsta <= 65) {
				System.out.println("Esti Adult!");
			}
			else {
				System.out.println("Esti batran!");
			}
		}

	}

}
