package stepDefenitions;

import org.apache.log4j.Logger;

import cucumber.api.java.en.*;
import wiproassignment.gilleteproject_Pages.LandingPage;

import wiproassignment.gilleteproject_TestUtil.TestBase;

public class LoginpageSteps extends TestBase {

	Logger log = Logger.getLogger(LoginpageSteps.class); 
	
	LandingPage LandPage;
	
	
	public LoginpageSteps() throws Exception {
		super(driver);
		
	}
	


	@Then("^user clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
		LandPage = new LandingPage();
		LandPage.sigInLink();
	}

	@Then("^user verify the signIn page title and heading$")
	public void user_verify_the_signIn_page_title_and_heading() throws Throwable {
	
	}

	@Then("^user enter email\"([^\"]*)\" as loginName and password\"([^\"]*)\"$")
	public void user_enter_email_as_loginName_and_password(String arg1, String arg2) throws Throwable {
	 
	}

	@Then("^user clicks on the SignIn button$")
	public void user_clicks_on_the_SignIn_button() throws Throwable {
	 
	}

	@Then("^user verify the homepage afterlogin pagetitle and profile name$")
	public void user_verify_the_homepage_afterlogin_pagetitle_and_profile_name() throws Throwable {
	  
	}

	

	
	
}
