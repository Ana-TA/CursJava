package curs6;

public class BreakContinueExample {

	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			
			if (i == 4) {
				//break; // iese din bucla/for
				continue; //face skip la iteratie; reseteaza bucla; la urmatorul pas (fara 4./trece la 5)
			}
			System.out.println(i);
		}

	}

}
