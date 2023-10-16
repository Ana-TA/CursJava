package tema12;

import java.util.Comparator;

public class Generics {
	
	public <E extends Comparable<E>> void sortArray(E[] arr) {
	    for (int j = arr.length - 1; j >= 0; j--) {
	        for (int i = 1; i <= j; i++) {
	            if (arr[i-1].compareTo(arr[i]) > 0) {
	                E tmp = arr[i-1];
	                arr[i-1] = arr[i];
	                arr[i] = tmp;
	            }
	        }
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
