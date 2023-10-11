package curs11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	public void writeFile(String text) {  //writeFile("Ana are mere")	
		try {	
			FileWriter myFileWriter =  new FileWriter("file.txt");
			myFileWriter.write(text);
			myFileWriter.close();
			System.out.println("Sucessfully wrote to file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Cannot write to file");
		}		
	}
	
	public void readTxtFile() {
		
		try {
			File objFile = new File("file.txt");
			Scanner scan = new Scanner(objFile);
				while(scan.hasNext()) {
					System.out.println( scan.nextLine());
				}
			scan.close();
				
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}