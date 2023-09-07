package curs2;

public class StaticExample {
	
	String nume;
	static String prenume;
	
	String varsta;
	//varsta = "24";
	String masina = "Dacia";
	
	public static void main(String[] args) {
		
		StaticExample obj1 = new StaticExample();
		obj1.nume = "Maria";
		obj1.prenume = "Ioana";
		
		StaticExample obj2 = new StaticExample();
		obj2.nume = "Alina";
		obj2.prenume = "Carmenn";
		
		System.out.println(obj1.nume);
		System.out.println(obj1.prenume);
	}

}
