package wiproassignment.gilleteproject_testrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//src/test/java/wiproassignment/gilleteproject_Features/
		//src/test/java/wiproassignment/gilleteproject_stepDefenitions/
		//D:\Project\JavaSelenium\gilleteproject\src\test\java\wiproassignment\gilleteproject_stepDefenitions
		
		
		features = {"src/test/java/wiproassignment/gilleteproject_Features/"},
		glue = {"stepDefenitions"},
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty"}
		)

public class TestRunner {

}
