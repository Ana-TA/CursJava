package curs7;

public class FindIndexOfElement {
	
	/*
	 * Avem un array si facem o metoda prin care vrem sa aflam indexul unui element.
	 */
	
	int[] numbers = {3, 5, 7, 8, 9, 22, 4};

	public static void main(String[] args) {
		FindIndexOfElement obj = new FindIndexOfElement();
		obj.rezolvareCuFor(8);
		obj.rezolvareCuFor(8);
		
	}
	
	public void rezolvareCuFor(int element) {
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i] == element) {
				System.out.println("Index pentru elemet " + element + " este " + i);
			}
		}
	}
	
	public void rezolvareCuForEach(int element) {
		int counter = 0;
		
		//while (numbers.hasNext()){}
		for (int numar : numbers) {
			if (numar == element) {
				System.out.println("Index pentru elemet " + element + " este " + counter);
			}
			counter++;
		}
	}

}
