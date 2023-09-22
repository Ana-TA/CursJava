package tema6;

public class TestFibonacci {

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		obj.AskTheNumber();
		
		obj.ComputeFibonacci1();
		obj.PrintFibonacci();
		
		System.out.println("------------------------------");
		
		obj.ComputeFibonacci2();
		obj.PrintFibonacci();

	}

}
