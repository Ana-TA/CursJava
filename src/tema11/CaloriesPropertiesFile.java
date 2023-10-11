package tema11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CaloriesPropertiesFile {
	
	public void writePropertiesFile()
	{
		try(OutputStream outPutStream = new FileOutputStream("Calories.properties")) {
			
			
			Properties propFile = new Properties();
			propFile.setProperty("morcov", "58");
			propFile.setProperty("rosie", "40");
			propFile.setProperty("ardei", "30");
			propFile.setProperty("castravete", "20");
			propFile.setProperty("varza", "60");

			propFile.store(outPutStream, "fisierul este salvat");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String readValuesPropertiesFile(String key ) {
		
		String value = "";
		
		try(InputStream inputStream =  new FileInputStream("Calories.properties")){
			
			Properties propFile =  new Properties();
			propFile.load(inputStream);
			
			value = propFile.getProperty(key);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return value;	
	}

}
