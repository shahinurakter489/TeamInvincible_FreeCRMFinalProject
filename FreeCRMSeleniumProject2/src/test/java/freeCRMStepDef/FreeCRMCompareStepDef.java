package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMComparePageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMCompareStepDef {
	FreeCRMComparePageActions freeCRMComparePageAction = new FreeCRMComparePageActions();



	@Given("Customer is seeing the home page {string}")

	public void customer_is_seeing_the_home_page(String string) {

		freeCRMComparePageAction.getFreeCRMHomePage();

	}



	@When("Customer click on the Compare option")

	public void customer_click_on_the_Compare_option() {

		freeCRMComparePageAction.clickCompareButton();

	}



	@Then("They should be able to see the Compare page {string}")

	public void they_should_be_able_to_see_the_Compare_page(String string) {

		String expectedURL = "https://freecrm.com/compare.html";

		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();

		Assert.assertEquals(actualURL, expectedURL);

	}



}

