package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"AllFeatureFiles"},
		glue= {"StepDefinition"},
		dryRun=false
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
