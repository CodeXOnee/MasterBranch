package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {
	
	@Given("user open hrm application")
	public void user_open_hrm_application() {
		BaseClass.initialize();
	}
	   
	@When("user enter valid {string} and {string} and then click on login button")
	public void user_enter_valid_and_and_then_click_on_login_button(String user, String password) {
	   HomePage obj=new HomePage();
	   obj.loginPageFunctionality(user, password);
}

}