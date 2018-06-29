package automationTests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import pageObjects.methodRegistrationforms;

import properties.PropertiesFile;

public class TestCase1_RegistrationFormValidation {
	
	public static void main(String args[]) throws Exception {
		methodRegistrationforms mer=new  methodRegistrationforms();
		mer.testhomepageinit();
		mer.testFirstpageObject();
		//setBrowser();
		
		
	}
}
