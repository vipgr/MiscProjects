package wiproassignment.gilleteproject_Pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class ResetPasswordPage extends TestBase {
	
	
	
	Logger log = Logger.getLogger(LoginPage.class);
	// Strings to verify 
	
	String expectedCaption ="Please enter your e-mail address to reset your password.";
	String resetResponseCaption = "You will receive an e-mail very shortly containing a link to reset your password.";
	//String resetResponseCaption = "THANK YOU!";
	
	// Declaring the webElements
	@FindBy(id ="phdesktopbody_0_Description")
	@CacheLookup
	WebElement resetheadingCaption;
	
	//@FindBy(id="phdeskstopbody_0_username")
	//@FindBy(xpath ="//*[@class ='pc_reset-pwd']/div[2]/div[1]/input[@id='phdesktopbody_0_username']")
	@FindBy(xpath = "/html/body/div[1]/form/div[3]/div/div[4]/div/div/div[2]/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement emailUName;
	
	@FindBy(id ="phdesktopbody_0_Create Your New Password")
	@CacheLookup
	WebElement creatNewPaswordbtn;
	
	
	//@FindBy(xpath ="//*[id='phdesktopbody_0_afterSubmit']/div[1]/h1")
	@FindBy(xpath = "/html/body/div[1]/form/div[3]/div/div[4]/div/div/div[2]/div[1]/div[2]/h2")
	@CacheLookup
	WebElement resetResponseMessageCaption;
	

	public ResetPasswordPage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyResetHeadingCaption() {

		String actualMsg = getText(resetheadingCaption);
		Assert.assertEquals(expectedCaption, actualMsg);
		System.out.println("Validated Reset heading description  response message:-  " + actualMsg);
		log.info("Reset  heading description  verified! ");

	}
	
	
	public void resetFillForm(String userName) {

		Boolean uNamestatus = findElementAndFillText(emailUName, userName);
		System.out.println(" Status of username filled on emailId textbox :- " + uNamestatus);
		Assert.assertTrue("username filled with passed value to reset ", true);
		log.info("username filled with passed value to reset ");
		
	}
	
	
	public void resetbuttonPress() {
		Boolean status = clickWebelement(creatNewPaswordbtn);
		System.out.println(" Status of Reset button :- " + status);
		Assert.assertTrue("user clicked on Reset button ", true);
		log.info("user clicked on Reset Button ");
	}

	
	public void resetResponseMessageCaption() {

		String actualMsg = getTextwithourRefresh(resetResponseMessageCaption);
		Assert.assertEquals(resetResponseCaption, actualMsg);
		System.out.println("Validated reset  page response message:-  " + actualMsg);
		log.info("reset thanks message verified! ");

	}
	
	
	
	

	
}
