package wiproassignment.gilleteproject_testrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {"src/test/java/wiproassignment/gilleteproject_Features/"},
		//tags = {"@Registration","@Login","@ForgotPassword","@ResetPassword"},
		tags = {"@functionalityTest"},
		glue = {"stepDefenitions"},
		monochrome = true,// It display the console o/p in good readable format
		strict = true,// It will check any step is not defined in stepDef with respect to feature file
		dryRun = false,// to check the mapping is matching with feature file and stepDef
		plugin = {"pretty"}
		)

public class TestRunner {

}
