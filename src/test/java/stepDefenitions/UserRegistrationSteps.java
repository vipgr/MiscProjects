package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wiproassignment.gilleteproject_Pages.LandingPage;
import wiproassignment.gilleteproject_Pages.Registration;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class UserRegistrationSteps extends TestBase {
	
	public UserRegistrationSteps() throws Exception {
		super(driver);
	}

	public static  WebDriver driver;
	LandingPage LandPage;
	Registration registration;
	WebElement element;

	
	
	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
	 
		driverIntialization();
		
	}

	@Then("^user enter the url$")
	public void user_enter_the_url() throws Throwable {
	 
		launchUrl();
	}

	@Then("^user verifies the homepage title$")
	public void user_verifies_the_homepage_title() throws Throwable {
		LandPage = new LandingPage(driver);
		LandPage.landingPageTitle(driver);
		
	}

	@Then("^user clicks on register link$")
	public void user_clicks_on_register_link() throws Throwable {
		
		
	}

	@Then("^user verify the register title page$")
	public void user_verify_the_register_title_page() throws Throwable {
	}

	@Then("^user fill all basic details to register account$")
	public void user_fill_all_basic_details_to_register_account() throws Throwable {

	}


	
}
