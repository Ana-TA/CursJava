package curs9;

public class MethodOverload {

	public static void main(String[] args) {
		
		multiply(2, 2.5);
		multiply(2, 2);
		
		System.out.println("ABC");
		System.out.println(123);
		System.out.println(2.5);
		System.out.println('*');

	}
	
	
	//supraincarcarea metodei
	public static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
		
	}
	
	public static void multiply(double num1, double num2) {
		System.out.println(num1 * num2);
		
	}

}
