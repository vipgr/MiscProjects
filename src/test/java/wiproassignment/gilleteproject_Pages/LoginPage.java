package wiproassignment.gilleteproject_Pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class LoginPage extends TestBase {

	Logger log = Logger.getLogger(LoginPage.class);
	// Strings to verify
	String expectedTitle = "Login Page";
	String expectedCaption = "SIGN INTO YOUR ACCOUNT";
	String homePageAfterloginCaption = "YOUR PROFILE";

	// Declaring the webElements
	@FindBy(id = "phdesktopbody_0_Description")
	@CacheLookup
	WebElement headingCaption;

	@FindBy(id = "phdesktopbody_0_username")
	@CacheLookup
	WebElement emailUserName;

	@FindBy(xpath = "//*[@id='phdesktopbody_0_Container']/div[2]/input[@name='phdesktopbody_0$ctl04'][@type='password']")
	@CacheLookup
	WebElement password;

	@FindBy(id = "phdesktopbody_0_Sign In")
	@CacheLookup
	WebElement SignInButton;

	@FindBy(id = "phdesktopbody_0_TitleText")
	@CacheLookup
	WebElement homepageCaption;
	

	@FindBy(id = "phdesktopbody_0_forgotpassword")
	@CacheLookup
	WebElement forgotPasswordLink;
	

	// Initialization the page objects

	public LoginPage() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Actions methods

	public void signInpageTitle() {
		String actualTitle = getTitle();
		System.out.println("Validated signIn page Title:-  " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertTrue("Validated signIn page Title ", true);
		log.info("Validated signIn page Title");
	}

	public void verifyHeadingCaption() {

		String actualMsg = getText(headingCaption);
		Assert.assertEquals(expectedCaption, actualMsg);
		System.out.println("Validated signUp  page response message:-  " + actualMsg);
		log.info("signUp message verified! ");

	}

	public void loginFillForm(String userName, String pswd) {

		Boolean uNamestatus = findElementAndFillText(emailUserName, userName);
		System.out.println(" Status of username filled :- " + uNamestatus);
		Assert.assertTrue("username filled with passed value ", true);
		log.info("username filled with passed value ");
		Boolean pwdStatus = findElementAndFillText(password, pswd);
		System.out.println(" Status of password filled :- " + pwdStatus);
		Assert.assertTrue("password filled with passed value ", true);
		log.info("password filled with passed value ");
	}

	public void SignInbuttonPress() {
		Boolean status = clickWebelement(SignInButton);
		System.out.println(" Status of signIn button :- " + status);
		Assert.assertTrue("user clicked on signIn button ", true);
		log.info("user clicked on SignInButton ");
	}

	public void verifyhomepageafterlogin() {

		String actualMsg = getText(homepageCaption);
		Assert.assertEquals(homePageAfterloginCaption, actualMsg);
		System.out.println("Validated home page response message after login:-  " + actualMsg);
		log.info(" home page response message verified! ");

	}

	public void forgotPaswdlink() {
		Boolean status = clickWebelement(forgotPasswordLink);
		System.out.println(" Status of forgotPasswordLink  :- " + status);
		Assert.assertTrue("user clicked onforgotPasswordLink  ", true);
		log.info("user clicked on forgotPasswordLink ");
	}

	


}
