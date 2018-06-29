package automationTests;

import static org.junit.Assert.*;

import org.junit.Test;

import pageObjects.methodRegistrationforms;


public class Scenario3_RequiredFieldsChecksandValidations {

	@Test
	public void test() throws Exception {
		methodRegistrationforms methodRegistrationforms=new  methodRegistrationforms();
		//1. 1.Registration form Website should be opened without any error.
		methodRegistrationforms.testhomepageinit();
		
		//2.After Registration form website is opened cross check the Address of the website is same and it is not pointing to any proxy server or dummy look alike URL
		//3.The protocol of the website if it is not secured website check it have only HTTP and if it is secured website check it have SSL enabled protocol i.e. HTTPS
		methodRegistrationforms.checkWebsiteURL();
		
		//4. The name on websites registration form showing "Registration Form" at the top heading
		//5.The Content is readble
		methodRegistrationforms.testFirstpageObject();
		
		//6. The title pointing to url and not pointing to any meaningful title -Failing
		methodRegistrationforms.checkPageTitleIsCorrect();
		methodRegistrationforms.closeBrowser();
		
	}

}
