package wiproassignment.gilleteproject_Pages;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class Registration extends TestBase{
	
	static WebDriver driver;
	// String to verify
	String expectedTitle = "Create Profile";
	
	@FindBy(how = How.ID, using ="phdesktopbody_0_TitleText")
	WebElement createAccountlabel;
	
	@FindBy(id = "phdesktopbody_0_grs_consumer[firstname]")
	WebElement firstName;
	
	@FindBy(id = "phdesktopbody_0_grs_consumer[lastname]")
	WebElement lastName;
	

	// page objects Initialization
	public Registration(WebDriver driver) throws IOException {
		super(driver);
		PageFactory.initElements(driver, this);
			
	}

	// Actions 
	
	public void fillUpRegForm(String fName, String Lname) {
		
	
	}

}
