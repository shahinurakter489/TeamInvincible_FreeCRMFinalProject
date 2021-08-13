package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMPlayStorePageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMPlayStoreStepDef {
	FreeCRMPlayStorePageActions freeCRMPlaystorePageAction = new FreeCRMPlayStorePageActions();

	@Given("User on the homepage of freeCRM {string}")

	public void user_on_the_homepage_of_freeCRM(String string) {

		freeCRMPlaystorePageAction.getFreeCRMHomePage();

	}

	@When("User clicks on Playstore button")

	public void user_clicks_on_Playstore_button() {

		freeCRMPlaystorePageAction.clickPlaystoreButton();

	}

	@Then("User should be redirected to the Playstore Page {string}")

	public void user_should_be_redirected_to_the_Playstore_Page(String string) {

		String expectedURL = "https://play.google.com/store/apps/details?id=com.cogmento.app";

		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();

		Assert.assertNotEquals(expectedURL, actualURL);

	}

}
