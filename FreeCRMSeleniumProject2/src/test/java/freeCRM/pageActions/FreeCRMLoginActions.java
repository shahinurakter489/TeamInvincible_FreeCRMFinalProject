package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMLoginElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMLoginActions extends FreeCRMPricingPageActions{
	FreeCRMLoginElements freeCRMLoginElements ;
	public FreeCRMLoginActions() {
	this.freeCRMLoginElements =	new FreeCRMLoginElements();
	PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMLoginElements);
	
}
	public void clickLoginButton() {
		freeCRMLoginElements.Login.click();
	}
}