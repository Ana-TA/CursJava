package curs1;

public class FirstClass {
	

	public static void main(String[] args) {
		
		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		obiect.trimiteMesaj();
		
		trimiteSMS();

	}

	public static void trimiteSMS() {
		System.out.println("SMS");
	}
	
	public void trimiteMesaj() {
		
		System.out.println("Mesaj");
	}
}
