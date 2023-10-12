package curs12;

public class GenericExample {

	public static void main(String[] args) {
		
		printDetails("String");
		printDetails(20.23);
		printDetails(false);
		printDetails('x');
		
		printArguments(true, 1, "text", 2.3);
		printArguments("text");

	}
	
	public static <T> void printDetails(T obj) { //T-->orice tip de obiect
		System.out.println("Obiect " + obj);
		System.out.println("Data type obiect: " + obj.getClass().getName());
	}
	
	
	//public static <T extends Number> void printArguments(T...values) {
	//printArguments(2.2, 23, 4500);
	public static <T> void printArguments(T...values) {
		
		for (T element : values) {
			System.out.println(element);
		}
	}

}
