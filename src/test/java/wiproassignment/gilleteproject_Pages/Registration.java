package wiproassignment.gilleteproject_Pages;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class Registration extends TestBase{
	
	Logger log = Logger.getLogger(Registration.class); 
	//static WebDriver driver;
	// String to verify
	String expectedTitle = "Create Profile";

	@FindBy(how = How.ID, using ="phdesktopbody_0_TitleText")
	@CacheLookup
	WebElement createAccountlabel;
	
	@FindBy(id = "phdesktopbody_0_grs_consumer[firstname]")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id = "phdesktopbody_0_grs_consumer[lastname]")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(id = "phdesktopbody_0_grs_account[emails][0][address]")
	@CacheLookup
	WebElement emailID;
	
	@FindBy(id ="phdesktopbody_0_grs_account[password][password]")
	WebElement paswrd;

	@FindBy(id ="phdesktopbody_0_grs_account[password][confirm]")
	@CacheLookup
	WebElement confirmpassword;
	
	@FindBy(id ="phdesktopbody_0_grs_account[addresses][0][postalarea]")
	@CacheLookup
	WebElement zipCode;
	
	@FindBy(id ="phdesktopbody_0_grs_consumer[birthdate][month]")
	@CacheLookup
	WebElement Month;
	
	@FindBy(id ="phdesktopbody_0_grs_consumer[birthdate][year]")
	@CacheLookup
	WebElement Year;
	
	@FindBy(id="phdesktopbody_0_ctl44")
	@CacheLookup
	WebElement signMecheckbox;
	
	@FindBy(id="phdesktopbody_0_submit")
	@CacheLookup
	WebElement createProfilebtn;
	
	
	
	// page objects Initialization
	public Registration() throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
			
	}

	// Actions 

	public void fillUpRegForm(String fName, String Lname,String email, String password, String confpassword, String zipcode, String month, String year) {
		findElementAndFillText(firstName, fName);
		findElementAndFillText(lastName, Lname);
		findElementAndFillText(emailID,email);
		findElementAndFillText(paswrd,password);
		findElementAndFillText(confirmpassword,confpassword);
		findElementAndFillText(zipCode,zipcode);
		selectionValFromDrpDwn(Month,month);
		selectionValFromDrpDwn(Year,year);
		log.info("All the basic details are filled ");
		
		
	}
	
	
	public void registrationPageTitle() {
		String actualTitle =getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Validated Registration  page Title:-  "+actualTitle);
		log.info("Registration title validated! ");
		
	}
	
	public void checkSignmebox() {
		clickWebelement(signMecheckbox);
		log.info("Checked the signIn");
	}
	
	public void createProfile() {
		clickWebelement(createProfilebtn);
		log.info("create profile button clicked");
	}

}
