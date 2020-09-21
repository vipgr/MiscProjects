package stepDefenitions;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wiproassignment.gilleteproject_Pages.LandingPage;
import wiproassignment.gilleteproject_Pages.ProfileThankyouPage;
import wiproassignment.gilleteproject_Pages.Registration;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class UserRegistrationSteps extends TestBase {
	
	//public static WebDriver driver;
	LandingPage LandPage;
	Registration registration;
	ProfileThankyouPage signUppage;
	WebElement element;
	Logger log = Logger.getLogger(UserRegistrationSteps.class);
	
	public UserRegistrationSteps() throws Exception {
		super(driver);

	}



	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
		log.info("driver is getting initializing");
		driverIntialization();
		//UserRegistrationSteps.driver = getDriver();
		log.info("Driver is returned");
	
	}

	@Then("^user enter the url\"([^\"]*)\"$")
	public void user_enter_the_url(String urls) throws Throwable {
		log.info("Entering the url");
		launchUrl(urls);
		log.info("browser is launched with Url");
	}

	@Then("^user verifies the landingpage title$")
	public void user_verifies_the_landingpage_title() throws Throwable {

		LandPage = new LandingPage();
		LandPage.landingPageTitle();
		log.info("verified the title of landing page");

	}
	

	@Then("^user clicks on register link$")
	public void user_clicks_on_register_link() throws Throwable {
		LandPage.clickregisterPage();
		log.info("Clicked on registration link");

	}

	@Then("^user verify the register title page$")
	public void user_verify_the_register_title_page() throws Throwable {
		registration = new Registration();
		registration.registrationPageTitle();
		log.info("verified the title of Registration page");
	}

	@Then("^user fill all basic details to register account\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_fill_all_basic_details_to_register_account(String fname, String lname, String email, String password, String confpassword, String zipcode, String month, String year) throws Throwable {
		
		registration.fillUpRegForm(fname,lname,email,password,confpassword,zipcode,month,year);
		registration.checkSignmebox();
	}
	
	@Then("^user clicks on createProfilebutton$")
	public void user_clicks_on_createProfilebutton() throws Throwable {
		registration.createProfile();

	}
	
	@Then("^user verify the profilecreatedPage$")
	public void user_verify_the_profilecreatedPage() throws Throwable {
		signUppage = new ProfileThankyouPage();
		signUppage.signUpPageTitle();
		signUppage.signUpResponseMsg();
		
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		closeBrowser();
	
	}

}
