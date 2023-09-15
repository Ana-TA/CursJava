package tema4;

import java.util.Scanner;

public class Punctaj {
	
	int punctaj;
	String calificativ;
	
	private void citestePunctaj( ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu punctajul:");
		punctaj = scan.nextInt();
		
	}
	
	public void verificaPunctaj() {
		
		citestePunctaj();
		calificativ = (punctaj >= 90)? "FB" : (punctaj >= 80)? "B" : "S"; 
		//System.out.println("Calificativul este " + calificativ);
		
		String result = (calificativ == "FB")? "Ai primit: Foarte Bine" : (calificativ == "B")? "Ai primit: Bine" : "Ai primit suficient";
		System.out.println("Rezultatul este " + result);
	}

}
