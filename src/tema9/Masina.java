package tema9;

public class Masina extends Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	private double motorizare;
	
	public Masina (String brand, int nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie =  vitezaMedie;
	}
	
	public double motorizare() {
		
		return motorizare;
	}
	
	public void setMotorizare(double motorizare) {
		this.motorizare = motorizare;
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru masina: " + this.brand +  " este: " + this.nivelPoluare +
				" si viteza medie atinsa este de: " + this.vitezaMedie + " km/h");
	}
	
	
	public void verificaMotorizarea(Vehicul vehicul) {
		
		System.out.println("Nume: " + vehicul.nume() + " | " + " Motorizare: " + motorizare());
	}
}
