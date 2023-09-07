package curs2;

public class Tester {
	
	String nume;
	int varsta;
	int ratePerHour = 1;
	
	//constructori
	//constructor default
	//public Tester() {}
	
	public Tester(int salariuPeOra) {
		ratePerHour = salariuPeOra;
	}
	
	public Tester(int ratePerHour, int varsta, String nume) {
		this.ratePerHour = ratePerHour;
		this.varsta = varsta;
		this.nume = nume;
	}
	
	//metode
}
