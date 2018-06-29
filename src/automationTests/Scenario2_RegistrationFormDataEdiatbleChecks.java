package automationTests;

import static org.junit.Assert.*;

import org.junit.Test;

import pageObjects.methodRegistrationforms;


public class Scenario2_RegistrationFormDataEdiatbleChecks {

	@Test
	public void test() throws Exception {
		methodRegistrationforms methodRegistrationforms=new  methodRegistrationforms();
		//1. 1.Registration form Website should be opened without any error.
		methodRegistrationforms.testhomepageinit();
		
		//Extraa Check for The Content is Accessible and readable or not 
		methodRegistrationforms.testFirstpageObject();
		
		methodRegistrationforms.fieldsEditableChecks();
		
		methodRegistrationforms.closeBrowser();
		
	}

}
