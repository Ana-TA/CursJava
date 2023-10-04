package tema9;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	private String nume;
	private double motorizare;
	
	public String nume() {
		
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public double motorizare() {
		
		return motorizare;
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru masina: " + this.brand +  " este: " + this.nivelPoluare + 
				" si viteza medie atinsa este de " + this.vitezaMedie + " km/h");
		
	}
}
