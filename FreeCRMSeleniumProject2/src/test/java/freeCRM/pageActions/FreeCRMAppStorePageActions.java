package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMAppStoreElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMAppStorePageActions extends FreeCRMPricingPageActions {
	FreeCRMAppStoreElements appstoreElements;



	public FreeCRMAppStorePageActions() {

		this.appstoreElements = new FreeCRMAppStoreElements();

		PageFactory.initElements(DriverSetUp.chromeDriver,appstoreElements);



	}



	public void clickAppstoreButton() {

		appstoreElements.Appstore.click();

	}
}
