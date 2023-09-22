package tema6;

import java.util.Scanner;

public class Login {
	
	String user = "TestUser";
	String pass = "1234";
	Scanner scan = new Scanner (System.in);
	
	private String getUsername() {
		System.out.println("Introdu username:");
		return scan.next();
		
	}
	
	private String getPassword() {
		System.out.println("Introdu password:");
		return scan.next();
	}
	
	
	
	public void ValidateCredentials() {
		int counter = 0;
		boolean isValid = true;
		
		do {
			String currentUser = getUsername();
			String currentPass = getPassword();
			
			isValid = (currentUser.equals(user)) && (currentPass.equals(pass));
			
			if (isValid) {
				System.out.println("Login Sucessful!");
			}else {
				System.out.println("Login Error!");
				counter ++;
			}
			
			if (counter == 3) {
				System.out.println("Maximum attempts reached. User blocked");
				break;
			}
			
		}while (!isValid);
	}
	

}
