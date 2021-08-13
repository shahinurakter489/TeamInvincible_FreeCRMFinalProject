package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMSignUPActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMSignUpStepDef {
	FreeCRMSignUPActions freeCRMSignUPActions = new FreeCRMSignUPActions();
	@Given("Customer is on the  Free CRM home page")
	public void customer_is_on_the_Free_CRM_home_page() {
		freeCRMSignUPActions.getFreeCRMHomePage();
	}

	@When("Customer click on the Sign up button")
	public void customer_click_on_the_Sign_up_button() {
		freeCRMSignUPActions.clickSignUpButton();
	}

	@Then("Customer Should be able to redirected to the registration page {string}")
	public void customer_Should_be_able_to_redirected_to_the_registration_page(String string) {
		String expectedURL = "https://register.freecrm.com/register/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
