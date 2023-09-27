package tema7;

import java.util.Scanner;

public class SumTenNumbers {
	
	int len = 10;
	int[] arrayNumbers = new int[len];
	
	public void AskTheNumbers() {
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			System.out.println("Te rog introdu numarul:");
			arrayNumbers[i] = scan.nextInt();
		}
	}
	
	public void ComputeSum() {
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arrayNumbers[i];
		}
		
		System.out.println("Suma celor 10 numere este: " + sum);
	}

}
