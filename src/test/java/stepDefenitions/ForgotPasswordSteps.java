package stepDefenitions;

import java.io.IOException;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Then;
import wiproassignment.gilleteproject_Pages.LoginPage;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class ForgotPasswordSteps extends TestBase{

	Logger log = Logger.getLogger(LoginpageSteps.class);

	LoginPage LoginP;
	
	public ForgotPasswordSteps() throws IOException {
		super(driver);
	}
	
	
	@Then("^user clicks on the forgotPassword link$")
	public void user_clicks_on_the_forgotPassword_link() throws Throwable {
		LoginP = new LoginPage();
		LoginP.forgotPaswdlink();
	
	}

	
	

}
