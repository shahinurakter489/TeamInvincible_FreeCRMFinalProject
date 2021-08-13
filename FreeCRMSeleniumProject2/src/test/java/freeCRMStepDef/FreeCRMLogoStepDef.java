package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMLogoActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMLogoStepDef {
	FreeCRMLogoActions freeCRMLogoActions = new FreeCRMLogoActions();
	@When("Customer click the logo button")
	public void customer_click_the_logo_button() {
		freeCRMLogoActions.clickLogo();
	}

	@Then("Customer Should be able to see the logo in home page")
	public void customer_Should_be_able_to_see_the_logo_in_home_page() {
		String expectedURL = "https://freecrm.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
