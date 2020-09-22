package wiproassignment.gilleteproject_Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class LandingPage extends TestBase{
	
	
	//static WebDriver driver;
	// Strings to verify 
	Logger log = Logger.getLogger(LandingPage.class);
	String expectedTitle ="Men's razors and shavers | Gillette India";
	
	// Declaring the webElements
	//@FindBy(linkText = "REGISTER")
	@FindBy(xpath = "//a[@title ='REGISTER']")
	@CacheLookup
	 WebElement registerLink;
	
	@FindBy(linkText = "SIGN IN")
	@CacheLookup
	WebElement SignInLink;


	//Initialization the page objects
	public LandingPage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions classes
	
	public void landingPageTitle() {
		String actualTitle =getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Validated Landing page Title:-  "+actualTitle);
		Assert.assertTrue("Validated Landing page Title ", true);
		log.info("Validated Landing page Title");
	}
	
	public void  clickregisterPage() throws IOException{
		
		clickWebelement(registerLink);

	}
	
	public void  sigInLink() throws IOException{
		
		Boolean status = clickWebelement(SignInLink);
		System.out.println(" Status of signIn click :- "+status);
		Assert.assertTrue("user clicked on signIn link ", true);
		log.info("user clicked on signIn link");

	}
	
	
		
}
