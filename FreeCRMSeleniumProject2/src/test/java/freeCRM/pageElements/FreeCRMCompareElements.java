package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMCompareElements {
	@FindBy(xpath = "(//A[@href='https://freecrm.com'])[1]")

	public WebElement HomePage;

	@FindBy(xpath = "//a[normalize-space()='Compare']")

	public WebElement Compare;

}
