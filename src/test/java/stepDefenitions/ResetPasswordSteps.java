package stepDefenitions;

import java.io.IOException;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Then;

import wiproassignment.gilleteproject_Pages.ResetPasswordPage;
import wiproassignment.gilleteproject_TestUtil.TestBase;

public class ResetPasswordSteps extends TestBase {
	

	Logger log = Logger.getLogger(LoginpageSteps.class);
	ResetPasswordPage resetP;
	

	public ResetPasswordSteps() throws IOException {
		super(driver);
	
	}

	
	@Then("^user verify reset password heading caption$")
	public void user_verify_reset_password_heading_caption() throws IOException {
		
		resetP = new ResetPasswordPage();
		resetP.verifyResetHeadingCaption();
	
	}

	@Then("^user enter emailId\"([^\"]*)\"$")
	public void user_enter_emailId(String emailId)  {
	   
		resetP.resetFillForm(emailId);
		
	}

	@Then("^user clicks on Create your new Password button$")
	public void user_clicks_on_Create_your_new_Password_button() {
	
		resetP.resetbuttonPress();
	}

	@Then("^user verify the response message after click on reset button$")
	public void user_verify_the_response_message_after_click_on_reset_button() {
		
		resetP.resetResponseMessageCaption();
	}

}
