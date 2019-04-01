package main.java.pulsebeat02.properties.filegeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	
	public static void main(String[] args) {
		
		boolean doesExist = checkPropertiesFile("\\");
		
		if (!doesExist) {
			
			try {
				
				Properties properties = new Properties();
				properties.setProperty("version", "1.0.0");
				properties.setProperty("mouseSensitivity", "0.5");
				properties.setProperty("particles", "1");
				

				File file = new File("zombie.properties");
				FileOutputStream fileOut = new FileOutputStream(file);
				properties.store(fileOut, "Properties File");
				
				fileOut.close();
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
	      
	}

	public static boolean checkPropertiesFile(String path) {
		
		// TODO Auto-generated method stub
		
		File f = new File(path);
		
		if (f.exists() && !f.isDirectory()) { 
			
			return true;
		   
		}
		
		else {
			
			return false;
			
		}
		
	}

}
