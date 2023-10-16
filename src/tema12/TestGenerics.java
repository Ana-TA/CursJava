package tema12;

import java.util.Comparator;

public class TestGenerics {

	public static void main(String[] args) {
		
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		int[] intArray = {100, 500, 300, 400, 200 , 50};
		Character[] charArray = {'a', 'b', 'r', 'd', 'c' };
		
		Generics obj = new Generics();
		
		obj.sortArray(textArray);
		
		System.out.println("------------------------------------------------");
		//obj.sortArray(intArray);
		
		System.out.println("------------------------------------------------");
		obj.sortArray(charArray);
	}

}
