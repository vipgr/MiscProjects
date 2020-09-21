package wiproassignment.gilleteproject_Pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class ProfileThankyouPage extends TestBase {
	
	//static WebDriver driver;
	Logger log = Logger.getLogger(ProfileThankyouPage.class); 
	
	
	@FindBy(id = "phdesktopbody_0_Header")
	@CacheLookup
	WebElement signUpVerification;
	
	String expectedTitle = "Your Registration Is Complete";
	String signUpverifyMsg = "YOUR REGISTRATION IS COMPLETE";
	
	public ProfileThankyouPage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void signUpPageTitle() {
		String actualTitle =getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Validated signUp  page Title:-  "+actualTitle);
		log.info("signUp title validated! ");
		
	}
	
	
	public void signUpResponseMsg() {
		
		String actualMsg =getText(signUpVerification);
		Assert.assertEquals(signUpverifyMsg, actualMsg);
		System.out.println("Validated signUp  page response message:-  "+actualMsg);
		log.info("signUp message verified! ");
		
	}
	

}
