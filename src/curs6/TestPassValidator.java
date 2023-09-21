package curs6;

public class TestPassValidator {

	public static void main(String[] args) {
		
		PasswordValidator validator = new PasswordValidator();
		validator.printPasswordRules();
		validator.getUsername();
		validator.validatePassword();
		
		System.out.println("Parola valida!");

	}

}
