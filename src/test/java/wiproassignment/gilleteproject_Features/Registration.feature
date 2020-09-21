@Registration
Feature: Account Registration on gillete app

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
