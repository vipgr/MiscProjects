@Login
Feature: Login functionality

Scenario Outline: Login verification with multiple users
	Given 	user launch the browser
	Then 	user enter the url"<url>"
	Then    user verifies the landingpage title
	Then 	user clicks on SignIn link
	Then 	user verify the signIn page title and heading
	Then 	user enter email"<username>" as loginName and password"<password>"
	Then  	user clicks on the SignIn button
	Then 	user verify the homepage afterlogin pagetitle and profile name
	
Examples:
| url | email |password |
|https://www.gillette.co.in/en-in |rsab.test2@gmail.com|test1A31 |	