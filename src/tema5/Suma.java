package tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Suma {
	
	List<Integer> numbers = new ArrayList<Integer>();
	int sum = 0;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Please enter a number: " + i + ':');
			int num = scan.nextInt();
			numbers.add(num);
		}
		scan.close();
	}
	
	public void CalculateSum() {
		
		for (int i = 0; i < 10; i ++) {
			sum += numbers.get(i);
			//System.out.println(numbers.get(i));
		}
		
		System.out.println("The sum of the numbers is: " + sum);
	}

}
