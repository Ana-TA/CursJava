package curs6;

import java.util.Scanner;

public class CalculatorSalarial {

	/* Un program care caulculeaza salariul pe o saptamana.
	 * Intrebam utilizatorul cate ore a lucrat.
	 * Calculam daca a lucrat max, 40h sau min. 1h
	 * Daca introduce un numar invalid de ore, il rugam sa introduca din nou.
	 * Rate per hour = 15
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner (System.in);
		int oreLucrate = scan.nextInt();
		
		while (oreLucrate < 1 || oreLucrate >40) {
			
			System.out.println("Numar invalid de ore");
			System.out.println("Introdu intre 1 si 40");
			oreLucrate = scan.nextInt();
		}
		
		System.out.println("Salariul tau este : " + oreLucrate*15);

	}

}
