package pageObjects;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationFormObjects {
	String headingXpath = "//h2//b[text()='Registration Form']";
	String firstNameLabelXpath = "//label[text()='First Name']";
	String firstNameInputBoxlabel = "//label[text()='First Name']//parent::div//following-sibling::input[@name='first_name']";
	String lastNameLabelXpath = "//label[text()='Last Name']";
	String lastNameInputBoxlabel = "//label[text()='Last Name']//parent::div//following-sibling::input[@name='last_name']";
	
	
	String departmentLabelXpath = "//label[text()='Department / Office']";
	String departmentSelectListXpath = "//label[text()='Department / Office']//parent::div//following-sibling::select[@name='department']";
	String usernameLabelXpath = "//label[contains(text(),'Username')]";
	String usernameInputBoxlabel = "//label[text()='Username ']//parent::div//following-sibling::input[@name='user_name']";
	
	
	String passwordLabelXpath = "//label[text()='Password ']";
	String passwordInputBoxlabelXpath = "//label[text()='Password ']//parent::div//following-sibling::input[@name='user_password']";
	
	
	String confirmPasswordlabelXpath = "//label[text()='Confirm Password']";
	String confirmPasswordInputBoxlabelXpath = "//label[text()='Confirm Password']//parent::div//following-sibling::input[@name='confirm_password']";

	String e_MailPasswordlabelXpath = "//label[text()='E-Mail']";
	String e_MailPasswordlabelInputBoxlabelXpath = "//label[text()='E-Mail']//parent::div//following-sibling::input[@name='email']";

	String contactNumberlabelXpath = "//label[text()='Contact No.']";
	String contactNumberlabelInputBoxlabelXpath = "//label[text()='Contact No.']//parent::div//following-sibling::input[@name='contact_no']";

	
	String submitButtonXpath = "//button[@type='submit']";
	public static void main(String args[]) {
		final String headingXpath = "//h2//b[text()='Registration Form']";
		String firstNameLabelXpath = "//label[text()='First Name']";
		String firstNameInputBoxlabel = "//label[text()='First Name']//parent::div//following-sibling::input[@name='first_name']";
		
		
		
		
		
	
	}

	
	
}
