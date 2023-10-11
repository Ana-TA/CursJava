package curs11;

public class TestPropertiesFile {

	public static void main(String[] args) {
		PropertiesFileProcessor obj =  new PropertiesFileProcessor();
		obj.writePropertiesFile();	
		obj.readPropertiesFile("email");
		obj.updatePropertiesFile("email", "nimic@nimic");
		obj.readPropertiesFile("email");

	}

}