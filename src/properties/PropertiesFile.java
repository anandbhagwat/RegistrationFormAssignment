package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import automationTests.TestCase1_RegistrationFormValidation;
import pageObjects.methodRegistrationforms;



public class PropertiesFile {
	static Properties properties = new Properties();
	
	public static void main(String[] args) {
		readProperties();
		writeProperties();
		readProperties();
	}
	public static void readProperties() {
		
		try {
			InputStream inputstream = new FileInputStream("D:\\personal\\Automation\\workspace\\Selenium\\src\\properties\\config.properties");
			properties.load(inputstream);
			System.out.println(properties.getProperty("browser"));
			methodRegistrationforms.Browser = properties.getProperty("browser");
			System.out.println(methodRegistrationforms.Browser);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	private static void writeProperties() {
		try {
			OutputStream outputstream = new FileOutputStream("D:\\\\personal\\\\Automation\\\\workspace\\\\Selenium\\\\src\\\\properties\\\\config.properties");
			properties.setProperty("browser", "chrome");
			properties.store(outputstream, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
