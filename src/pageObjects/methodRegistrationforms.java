package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

import properties.PropertiesFile;

public class methodRegistrationforms {
	public static WebDriver driver;
	public static String Browser;
	public void testhomepageinit() throws Exception {
		PropertiesFile.readProperties();
		//PropertiesFile.
		browserConfig();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		openURL();
	}
	public static void setBrowser()
	{
		
		Browser = "Firefox";
	}
	public static void closeBrowser()
	{
		
		driver.close();
	}
	
	public static void browserConfig() {
		if (Browser.contains("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
			driver = new FirefoxDriver();
		}
		
		if(Browser.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		driver = new ChromeDriver();
		}
	}
	public static void openURL() throws Exception {
		driver.get("http://adjiva.com/qa-test/");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.id("menu_documentation"))).build().perform();;
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("D:\\personal\\Automation"+".png"));
//		act.moveToElement(driver.findElement(By.id("menu_documentation"))).build().perform();
//		
//		//driver.findElement(By.xpath("//a[@href='https://seleniumconf.us/']")).click();
//
//		System.out.println("************************************************************************************");
//
////		String ab = driver.getWindowHandle();
////		System.out.println("*************************************+"+ab+"***********************************************");
////
////
////		for(String winHandle : driver.getWindowHandles())
////		{
////			driver.switchTo().window(winHandle);driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////			System.out.println("*************************************+"+winHandle+"***********************************************");
////		}	
////
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		
////		act.moveToElement(driver.findElement(By.id("menu_documentation"))).build().perform();
////		driver.findElement(By.xpath("//a[@href='/selenium-conf-2018/proposal/new']")).click();


	}
	
	public void checkWebsiteURL() {
		String uRLActual= "http://adjiva.com/qa-test/";
		Assert.assertTrue(uRLActual.equals(driver.getCurrentUrl()));
	}
	
	public void checkPageTitleIsCorrect()
	{
		//Assuming the Browser tab should be Registration Form-Website Name
		String webSiteTitle = "Registration Form-Website Name";
		Assert.assertTrue(webSiteTitle.equals(driver.getTitle()));
	}
	
	//4. The name on websites registration form showing "Registration Form" at the top heading
	public void testFirstpageObject() {
		RegistrationFormObjects reg = new RegistrationFormObjects();
		Assert.assertTrue(driver.findElement(By.xpath(reg.headingXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.firstNameLabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.firstNameInputBoxlabel)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.lastNameLabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.lastNameInputBoxlabel)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.departmentLabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.departmentSelectListXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.usernameLabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.usernameInputBoxlabel)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.passwordLabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.passwordInputBoxlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.confirmPasswordlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.confirmPasswordInputBoxlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.e_MailPasswordlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.e_MailPasswordlabelInputBoxlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.contactNumberlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.confirmPasswordInputBoxlabelXpath)).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath(reg.submitButtonXpath)).isDisplayed());
		
		
		
	}
	
	
	
	public void fieldsEditableChecks() {
		RegistrationFormObjects reg = new RegistrationFormObjects();
		
		WebElement fisrtnametextbox = driver.findElement(By.xpath(reg.firstNameInputBoxlabel));
		//Accessing element to send keys
		fisrtnametextbox.sendKeys("SampleFirstName");

		//If Required Extraa Checks
//		String getEnteredFisrtnameText=fisrtnametextbox.getText();
//		Assert.assertTrue(getEnteredFisrtnameText.equals("SampleFirstName"));
		
		
		WebElement lastnametextbox = driver.findElement(By.xpath(reg.lastNameInputBoxlabel));
		//Accessing element to send keys
		lastnametextbox.sendKeys("SampleLastName");
//		String getEnteredlastnameText=lastnametextbox.getText();
//		Assert.assertTrue(getEnteredlastnameText.equals("SampleLastName"));
				
		
		WebElement departmentselectlist = driver.findElement(By.xpath(reg.departmentSelectListXpath));
		Select deparmentselect = new Select(departmentselectlist);
		//Accessing element to select option
		deparmentselect.selectByVisibleText("Engineering");
		WebElement getselecteddepartmentOption=deparmentselect.getFirstSelectedOption();
//		String getselecteddepartmentOptionText = getselecteddepartmentOption.getText();
//		Assert.assertTrue(getselecteddepartmentOptionText.equals("Engineering"));
		
	
		
		
		WebElement passwordtextbox = driver.findElement(By.xpath(reg.passwordInputBoxlabelXpath));
		passwordtextbox.sendKeys("SampleSecretPassword");
//		String getEnteredpasswordText=passwordtextbox.getText();
//		Assert.assertTrue(getEnteredpasswordText.equals("SampleSecretPassword"));
		
		
		WebElement confirmPasswordtextbox = driver.findElement(By.xpath(reg.passwordInputBoxlabelXpath));
		confirmPasswordtextbox.sendKeys("SampleSecretPassword");
//		String getEnteredconfirmPasswordText=confirmPasswordtextbox.getText();
//		Assert.assertTrue(getEnteredconfirmPasswordText.equals("SampleSecretPassword"));
//		
		

		WebElement emailtextbox = driver.findElement(By.xpath(reg.passwordInputBoxlabelXpath));
		emailtextbox.sendKeys("someone@example.com");
//		String getEnteredEmailtextboxText=emailtextbox.getText();
//		Assert.assertTrue(getEnteredEmailtextboxText.equals("someone@example.com"));
//		
		WebElement contactnumbertextbox = driver.findElement(By.xpath(reg.passwordInputBoxlabelXpath));
		contactnumbertextbox.sendKeys("7276261087");
//		String getEnteredcontactnumberText=contactnumbertextbox.getText();
//		Assert.assertTrue(getEnteredcontactnumberText.equals("7276261087"));
//		
		
		driver.findElement(By.xpath(reg.submitButtonXpath)).click();
	}
	
	public void requiredValueSignCheckandValidation() {
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Password ']//i[text()='*']")).isDisplayed());
		
		
		
	}
	
}
