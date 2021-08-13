package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMLogoElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMLogoActions extends FreeCRMPricingPageActions{
	FreeCRMLogoElements freeCRMLogoElements;
public	FreeCRMLogoActions() {
	this.freeCRMLogoElements = new FreeCRMLogoElements();
	PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMLogoElements);
}
public void clickLogo() {
	freeCRMLogoElements.CRM.isDisplayed();
	freeCRMLogoElements.Free.isDisplayed();
}
}
