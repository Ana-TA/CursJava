package tema12;

import java.util.Scanner;

public class TestCatalog {

	public static void main(String[] args) {
		
		Catalog catalog = new Catalog();
		catalog.populateCatalog();
		catalog.displayCatalog();
		
		System.out.println("---------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cum te cheama?");
		String nume = scan.next();
		System.out.println("Ce nota ai luat?");
		int nota = scan.nextInt();
		
		if (catalog.findNameInCatalog(nume)) {
			if (nota <= catalog.getNoteForName(nume)) {
				System.out.println("Nu ai nevoide de alta nota.");
			}else {
				catalog.updateCatalatog(nume, nota, true);
				System.out.println("Catalogul a fost updatat. Noua nota este: " + nota);
			}
		}else {
			catalog.updateCatalatog(nume, nota, false);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
	
		System.out.println("---------------------------------------------------");
		
		catalog.displayCatalog();
	}

}
