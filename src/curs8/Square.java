package curs8;

public class Square extends Shape{

	public Square(String culoare, String nume) {
		super(culoare, nume);
	}
	
	String nume = "Patrat";
	String culoare = "Galben";
	
	public void PrintDetails() {
		System.out.println("Numele este " + super.nume + " si culoarea este " + super.culoare);
	}

}
