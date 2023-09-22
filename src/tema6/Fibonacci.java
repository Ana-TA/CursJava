package tema6;

import java.util.Scanner;

public class Fibonacci {
	
	int number;
	
	int[] FibonacciList = new int[100];
	
	public void AskTheNumber() {
		System.out.println("Introdu numarul:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}
	
	public void ComputeFibonacci1() {
		
		FibonacciList[0] = 0;
		FibonacciList[1] = 1;
		
		for (int i = 1; i < number; i++) {
			
			FibonacciList[i+1] = FibonacciList[i] + FibonacciList[i-1];
		}
	}
	
	public void ComputeFibonacci2() {
		
		FibonacciList[0] = 0;
		FibonacciList[1] = 1;
		int i = 1;
		
		while (i < number) {
			
			FibonacciList[i+1] = FibonacciList[i] + FibonacciList[i-1];
			i++;
		}
	}
	
	public void PrintFibonacci() {

		for (int i = 0; i < number; i++) {
			
			System.out.println(FibonacciList[i]);
		}
	}
	
	
	

}
