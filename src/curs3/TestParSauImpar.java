package curs3;

public class TestParSauImpar {

	public static void main(String[] args) {
		
		ParSauImpar obj = new ParSauImpar();
		obj.askTheUserForANumber();
		System.out.println(obj.CheckParSauImpar(obj.number));

	}

}
