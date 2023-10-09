package tema10;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {
		
		Customer objCustomer = new Customer("Ionut", "Bucuresti", "email@email.com");
		SavingsAccount objSavingsAcc = new SavingsAccount();
		objSavingsAcc.SavingsAcoount(objCustomer, 500, 12345);
		System.out.println("Hi " + objCustomer.getName());
		
		try {
			objSavingsAcc.widraw(objSavingsAcc.getAccountNumber());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}