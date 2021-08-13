package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMPlayStoreElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMPlayStorePageActions  extends FreeCRMPricingPageActions {



		FreeCRMPlayStoreElements playstoreElements;



		public FreeCRMPlayStorePageActions() {

			this.playstoreElements = new FreeCRMPlayStoreElements();

			PageFactory.initElements(DriverSetUp.chromeDriver,playstoreElements);

		}



		public void clickPlaystoreButton() {

			playstoreElements.Playstore.click();



		}
}
