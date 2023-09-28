package curs8;

import java.util.Arrays;
import java.util.Random;

/*
 * Un program care genereaza 6 numere random intre 0 si 9.
 * Numerele le va tine intr-un array.
 * Nu tine numere duplicate.
 * Printeaza array-ul.
 * 
 * metoda care genereaza si pune in array
 * metoda pentru duplicate
 * metoda de print array
 */

public class RandomNumberGenerator {
	
	private final int LENGTH = 6;
	private final int MAX_NUMBERS = 9;
	private int[] numbers = new int[LENGTH];
	
	public void GenerateNumbers() {
		
		Random random = new Random();
		
		System.out.println(random.nextInt(MAX_NUMBERS));
		
		for (int i = 0; i < LENGTH; i++) {
			
			int randomNumber = 0; 
			
			do {
				randomNumber = random.nextInt(MAX_NUMBERS);
				
			}while (CheckDuplicateNumber(numbers, randomNumber));
			
			numbers[i] = randomNumber;
			
			//if (!CheckDuplciteNumber(numbers, randomNumber)) {
				//numbers[i] = randomNumber;
				//System.out.println(numbers[i]);
				//System.out.println(Arrays.toString(numbers));
			//}
		}
	}
	
	private boolean CheckDuplicateNumber(int[] array, int  nr ) {
		
		for (int num : array) {
			if (nr == num) {
				return true;
		     }
		}
		return false;
	}
	
	public void PrintArrray() {
		for (int nr: numbers) {
			System.out.print(nr + " | ");
		}
	}
	

}
