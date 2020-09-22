@functionalityTest
Feature: Gillete Project

@Registration
Scenario Outline: Register an account on gilleteApp
	Given user launch the browser
	Then  user enter the url"<url>"
	Then  user verifies the landingpage title
	Then  user clicks on register link
	Then  user verify the register title page
	Then  user fill all basic details to register account"<firstName>""<lastName>""<email>""<password>""<confpassword>""<zipcode>""<month>""<year>"
	Then  user clicks on createProfilebutton	
	Then  user verify the profilecreatedPage
	Then  close the browser
	
		
Examples:
	|url							 | firstName | lastName | email                 | password | confpassword| zipcode	| month	| year	|
	|https://www.gillette.co.in/en-in| Dipinqac     | Maneshc   | rsab.test2@gmail.com| test1A31    | test1A31	  | 671124	| 1		| 1984	|


@Login
Scenario Outline: Login verification with multiple users
	Given 	user launch the browser
	Then 	user enter the url"<url>"
	Then    user verifies the landingpage title
	Then 	user clicks on SignIn link
	Then 	user verify the signIn page title and heading
	Then 	user enter email"<email>" as loginName and password"<password>"
	Then  	user clicks on the SignIn button
	Then 	user verify the homepage afterlogin pagetitle and profile name
	Then    close the browser
Examples:
| url | email |password |
|https://www.gillette.co.in/en-in |rsab.test2@gmail.com|test1A31 |	


@forgotpswd
Scenario Outline: Forgot Password functionality with multiple users
	Given 	user launch the browser
	Then 	user enter the url"<url>"
	Then    user verifies the landingpage title
	Then 	user clicks on SignIn link
	Then 	user verify the signIn page title and heading
	Then  	user clicks on the forgotPassword link
	Then    close the browser
	
Examples:
| url | email |password |
|https://www.gillette.co.in/en-in |rsab.test2@gmail.com|test1A31 |	

@ResetPassword
Scenario Outline: Reset Password with multiple users
	Given 	user launch the browser
	Then 	user enter the url"<url>"
	Then    user verifies the landingpage title
	Then 	user clicks on SignIn link
	Then 	user verify the signIn page title and heading
	Then  	user clicks on the forgotPassword link
	Then 	user verify reset password heading caption
	Then 	user enter emailId"<email>" 
	Then 	user clicks on Create your new Password button
	Then 	user verify the response message after click on reset button
	Then    close the browser
	
Examples:
| url | email |
|https://www.gillette.co.in/en-in |rsab.test2@gmail.com|

