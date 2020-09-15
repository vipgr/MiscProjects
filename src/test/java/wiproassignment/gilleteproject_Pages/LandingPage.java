package wiproassignment.gilleteproject_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import org.junit.Assert;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class LandingPage extends TestBase{
	
	
	//static WebDriver driver;
	// Strings to verify 

	String expctedTitle ="Men's razors and shavers | Gillette India";
	
	// Declaring the webElements
	//@FindBy(linkText = "REGISTER")
	@FindBy(xpath = "//a[@title ='REGISTER']")
	@CacheLookup
	WebElement registerLink;


	//Initialization the page objects
	public LandingPage(WebDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions classes
	
	public void landingPageTitle(WebDriver driver) {
		String actualTitle =getTitle();
		Assert.assertEquals(expctedTitle, actualTitle);
		System.out.println("Validated Landing page Title:-  "+actualTitle);
		
	}
	
	public Registration clickregisterPage() throws IOException{
		
		clickWebelement(registerLink);
		return  new Registration(driver);
		
		
	}
	
	
		
}
