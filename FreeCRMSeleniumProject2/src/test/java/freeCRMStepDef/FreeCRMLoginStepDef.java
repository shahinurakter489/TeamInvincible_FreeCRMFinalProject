package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMLoginActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMLoginStepDef {

	FreeCRMLoginActions freeCRMLoginActions = new FreeCRMLoginActions();

	@When("Customer login with valid userid and password")
	public void customer_login_with_valid_userid_and_password() {
		freeCRMLoginActions.clickLoginButton();
	}

	@Then("Customer Should be able to redirected to the login page {string}")
	public void customer_Should_be_able_to_redirected_to_the_login_page(String string) {
		String expectedURL = "https://ui.cogmento.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
