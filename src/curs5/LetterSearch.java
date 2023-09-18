package curs5;

import java.util.Scanner;

/*
 * un program care cere un text de la tastatura 
 * cautam in text daca exista litera A
 * daca o gasim printam ca am gasit litera si de cate ori am gasit-o
 * daca nu o gasim, printam ca nu am gasit-o
 */

public class LetterSearch {
	
	String text;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text:");
		text = scan.nextLine();
		System.out.println(text.length());
		scan.close();
	}
	
	public void searchForA() {
		
		//askTheUser();
		int counter = 0;
		
		for (int i=0; i < text.length(); i++) {
			//text.toLowerCase() -->transforma textul in litere mici
			//text.toUpperCase() -->transforma textul in CAPS
			if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				counter++;
			}
		}
		
		if (counter == 0) {
			System.out.println("Nu s-a gasit litera A in text");
		}else {
			System.out.println("Litera A a fost gasita de :" + counter);
		}
		
		String result = (counter==0)? "Nu s-a gasit litera A in text" : "Litera A a fost gasita de :" + counter;
		System.out.println(result);
		
	}
		
}
