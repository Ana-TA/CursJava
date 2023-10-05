package curs10;

public class AgeVerifier {
	
	public void checkAgeLimit(int age) throws InvalidAgException {
		
		if (age < 18) {
			
			throw new InvalidAgException("Invalid age to proceed!"); 
			
		}else {
			System.out.println("You are allowed");
		}
	}

}
