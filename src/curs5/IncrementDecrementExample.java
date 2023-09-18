package curs5;

public class IncrementDecrementExample {

	public static void main(String[] args) {
		
		// nr++  --> nr+1 / nr = nr+1 / nr+=1
		
		//post increment
		int nr = 10;
		System.out.println(nr++);
		System.out.println(nr);
		
		//pre increment
		nr = 5;
		System.out.println(++nr);
		System.out.println(nr);
		
		//post decrement
		int nr3 = 20;
		System.out.println(nr3--);
		System.out.println(nr3);

	}

}
