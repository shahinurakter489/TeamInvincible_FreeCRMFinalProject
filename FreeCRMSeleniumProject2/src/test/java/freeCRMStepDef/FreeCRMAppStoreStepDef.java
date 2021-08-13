package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMAppStorePageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMAppStoreStepDef {

	FreeCRMAppStorePageActions freeCRMAppstorePageAction = new FreeCRMAppStorePageActions();

	@Given("User is on the homepage of freeCRM {string}")

	public void user_is_on_the_homepage_of_freeCRM(String string) {

		freeCRMAppstorePageAction.getFreeCRMHomePage();

	}

	@When("User clicks on the Appstore button")

	public void user_clicks_on_the_Appstore_button() {

		freeCRMAppstorePageAction.clickAppstoreButton();

	}

	@Then("User should be able to redirect to the Appstore Page {string}")

	public void user_should_be_able_to_redirect_to_the_Appstore_Page(String string) {

		String expectedURL = "https://apps.apple.com/us/app/cogmento/id1291380634";

		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();

		Assert.assertNotEquals(expectedURL, actualURL);


}
}