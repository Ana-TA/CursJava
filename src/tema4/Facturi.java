package tema4;

import java.util.Scanner;

public class Facturi {
	
	int factura;

	private void citesteFactura( ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu valoarea facturii:");
		factura = scan.nextInt();
	}
	
	public void discountFacturi( ) {
		
		citesteFactura();	
		int result = (factura > 100)? (factura - (factura * 10/100)) : (factura - (factura * 5/100));
		
		System.out.println(result);
		
	}
}
