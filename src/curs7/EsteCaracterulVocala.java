package curs7;

import java.util.Scanner;

public class EsteCaracterulVocala {
	
	/*
	 * Un program care citeste o litera de la tastatura
	 * Verifica daca este vocala sau consoana
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Te rog introduc litera:");
		char litera = scan.next().charAt(0);
		
		//rezolvare cu IF
		
		if (litera == 'a' || litera == 'A' || litera == 'e' ||  litera == 'E' ||  litera == 'i' || litera == 'I' ||  litera == 'o' ||
				 litera == 'O' ||  litera == 'u' ||  litera == 'U') {
			System.out.println("Este vocala!");
		} else {
			System.out.println("Este consoana!");
		}
		
		
		// rezolvare cu switch
		
		switch(litera) {
		case 'A':
		case 'a': 
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u' :
			System.out.println(litera + " este vocala!");
			break;
		default:
			System.out.println(litera + " este consoana!");
		}
	}

}
