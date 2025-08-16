package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass{
	HomePage hp;

	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
		BaseClass.initialize();
	    String Url = driver.getCurrentUrl();
	    String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    if(Url.equals(ExpectedUrl)) 
	    {
	    		System.out.println(Url);
	    }
	    else 
	    {
	    		System.out.println("Not on Home Page");
	    }
	}

	@Given("User Enters Valid Credentials")
	public void user_enters_valid_credentials() 
	{
	    hp = new HomePage();
	    hp.working("Admin", "admin123");
	}

	@When("User Clicks on Login button")
	public void user_clicks_on_login_button() 
	{
		hp = new HomePage();
		hp.login();
	}

	@Then("User should navigate to Dashboard")
	public void user_should_navigate_to_dashboard() 
	{
		String Url = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    if(Url.equals(expectedUrl)) 
	    {
	    	System.out.println("Success   "+Url);
	    }
	    else 
	    {
	    		System.out.println(Url+"Not on Home Page");
	    }
	    	
	}
}