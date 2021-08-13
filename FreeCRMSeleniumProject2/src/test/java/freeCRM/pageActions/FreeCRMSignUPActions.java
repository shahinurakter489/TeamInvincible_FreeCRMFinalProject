package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMSignUpElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMSignUPActions extends FreeCRMPricingPageActions{
	FreeCRMSignUpElements  freeCRMSignUpElements ;
	public  FreeCRMSignUPActions() {
		this.freeCRMSignUpElements = new FreeCRMSignUpElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMSignUpElements);
	}
public void clickSignUpButton() {
	freeCRMSignUpElements.SignUP.click();
}
}
