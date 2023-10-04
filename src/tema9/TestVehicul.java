package tema9;

public class TestVehicul {

	public static void main(String[] args) {
		
		Bicicleta bicicleta = new Bicicleta("MTB", 0, 20);
		bicicleta.detaliiVehicul();
		bicicleta.setNume("MTB V2");
		bicicleta.verificaMotorizarea(bicicleta);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		Masina masina = new Masina("Suzuki", 3, 180);
		masina.detaliiVehicul();
		masina.setNume("Vitara");
		masina.setMotorizare(2.0);
		masina.verificaMotorizarea(masina);
		
	}

}
