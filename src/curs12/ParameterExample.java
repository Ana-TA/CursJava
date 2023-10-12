package curs12;

public class ParameterExample {

	public static void main(String[] args) {
		
		//obj.executeScript("script.js", element);
		//obj.executeScript("script.js", element, element2);
		//obj.executeScript("script.js", element, element2, element3);
		
		printDetails("unu", "doi");
		printDetails("unu", "doi", "trei");
		printDetails("unu", "doi", "trei", "unu", "doi", "trei");
	}
	
	//public static void printDetails(int num, boolean flag, String...values)
	public static void printDetails(String...values) { //Argumente variabile =varags -> ultim parametru
		
		for (String element : values) {
			System.out.println(element);
		}
	}
	
	/*public static void printDetails(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static void printDetails(String str1, String str2, String str3) {
		System.out.println(str1 + str2 + str3);
	}*/
	
	
	

}
