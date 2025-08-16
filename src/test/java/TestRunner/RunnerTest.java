package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"AllFeatureFiles"},
		glue= {"StepDefinition"},
		dryRun=false
		//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
