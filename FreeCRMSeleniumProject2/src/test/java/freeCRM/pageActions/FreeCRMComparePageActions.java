package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMCompareElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMComparePageActions  extends FreeCRMPricingPageActions {



		FreeCRMCompareElements compareElements;



		public FreeCRMComparePageActions() {

			this.compareElements = new FreeCRMCompareElements();

			PageFactory.initElements(DriverSetUp.chromeDriver, compareElements);



		}



		public void clickCompareButton() {

			compareElements.Compare.click();

		}
}
