package CucumberOptionsss;



import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@RunWith(Cucumber.class)
//@RunWith(CucumberWithSerenity.class)
@CucumberOptions 

(
		features ="src/test/resources/features",
		glue ="StepDefinitions" 
		
		)
//@Listeners(CucumberOptionsss.TestJiraListener.class)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	
}


	




	
