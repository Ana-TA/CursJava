package tema11;

import java.util.Scanner;

public class TestCaloriesPropertiesFile {

	public static void main(String[] args) {
		
		CaloriesPropertiesFile objFile = new CaloriesPropertiesFile();
		objFile.writePropertiesFile();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ce leguma doresti sa cumperi?");
		
		String calories = "";
		
		do {
			String leguma = scan.next();
			calories = objFile.readValuesPropertiesFile(leguma);
				
			if (calories != null)
			{
				System.out.println("Leguma aleasa de tine are " + calories  + " calorii");
				break;
			}else {
				System.out.println("Nu vindem aceasta leguma. Te rugam alege alta leguma: ");
				}

			}while (calories == null);
	}

}
