package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMpageStep {
	PIMPage page;
	@Given("user is on PIM page and valid the PIM page")
	public void user_is_on_pim_page_and_valid_the_pim_page() {
	   BaseClass.initialize();
	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {
	}

	@Then("user add employee {string} and {string} and {string}")
	public void user_add_employee_and_and(String firstname, String middlename, String lastname) {
	    page=new PIMPage();
	    page.ValidatePIMPageFunctionality(firstname, middlename, lastname);
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
	    
	}

}
