package stepDefenitions;

import org.apache.log4j.Logger;

import cucumber.api.java.en.*;
import wiproassignment.gilleteproject_Pages.LandingPage;
import wiproassignment.gilleteproject_Pages.LoginPage;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class LoginpageSteps extends TestBase {

	Logger log = Logger.getLogger(LoginpageSteps.class);

	LandingPage LandPage;
	LoginPage LoginP;

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
		LoginP = new LoginPage();
		LoginP.signInpageTitle();
		LoginP.verifyHeadingCaption();
	}

	@Then("^user enter email\"([^\"]*)\" as loginName and password\"([^\"]*)\"$")
	public void user_enter_email_as_loginName_and_password(String userName, String pswd) throws Throwable {

		LoginP.loginFillForm(userName, pswd);

	}

	@Then("^user clicks on the SignIn button$")
	public void user_clicks_on_the_SignIn_button() throws Throwable {
		
		LoginP.SignInbuttonPress();
	}

	@Then("^user verify the homepage afterlogin pagetitle and profile name$")
	public void user_verify_the_homepage_afterlogin_pagetitle_and_profile_name() throws Throwable {
		
		LoginP.verifyhomepageafterlogin();
	}
	
	

}
