package curs9;

public class ExampleEncapsulare {
	
	private int numar;
	
	public ExampleEncapsulare(int numar) {
		//this.numar = numar;
		setNumber(numar);
	}
	
	public int getNumar() {
		return numar;
	}
	
	private void setNumber(int numar) {
		if (numar > 0 ) {
			this.numar = numar;
		}else {
			//System.out.println("Valoare trebuie sa fie mai mare ca zero!");
			throw new IllegalArgumentException("Valoare trebuie sa fie mai mare ca zero!");
		}
	}

}
