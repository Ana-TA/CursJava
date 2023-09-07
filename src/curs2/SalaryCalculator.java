package curs2;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester(30);
		//tester1.nume = "Maria";
		tester1.varsta = 25;
		System.out.println(tester1.ratePerHour);
		
		Tester tester2 = new Tester(35);
		//tester2.nume = "Ion";
		//tester2.ratePerHour = 45;
		System.out.println(tester2.ratePerHour);
		
		Tester tester3 = new Tester(25, 40, "Oana");
		System.out.println(tester3.ratePerHour);
		System.out.println(tester3.varsta);
		//System.out.println(tester3.nume);
		
		SalaryCalculator salCalc = new SalaryCalculator();
		
		System.out.println("Salariul lui " + tester3.nume + " este " + salCalc.calculateSalary(tester3.ratePerHour));
		
	}
	
	public int calculateSalary(int ratePerHour) {
		
		return ratePerHour * 40;
	}
	
}
