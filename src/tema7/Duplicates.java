package tema7;

public class Duplicates {
	
	String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};

	public void CheckDuplicates() {
		
		int len =  myStringArray.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				
				if (myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat " + myStringArray[i]);
				}
			}
		}
	}

}
