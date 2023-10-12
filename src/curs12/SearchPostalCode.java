package curs12;

import java.util.Scanner;

/*
 * Programul trebuie sa caute un oras pe baza unui cod postal dat de user.
 * avem nevoie de o clasa care sa contina inca de la initializare o serie de coduti postale si orase asociate cu ele (6 orase).
 * daca codul nu exista, vreau sa aruncam PostalCodeException;
 * In cazul exceptiei vreau sa intreb din nou pana primesc un cod valid.
 */


public class SearchPostalCode {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		PostalCodes pc = new PostalCodes();
		int codPostal;
		
		do {
			System.out.println("Introdu codul postal:");
			codPostal = scan.nextInt();
			
			try {
				String oras = pc.findCity(codPostal);
				System.out.println("Orasul asociat codului: " + codPostal + " este " + oras);
			}
			catch(PostalCodeException e){
				System.out.println(e.getMessage());
			}
			
		}while(!pc.map.containsKey(codPostal));
	}
}
