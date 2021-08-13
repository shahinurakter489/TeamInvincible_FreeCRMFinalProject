package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMSignUpElements {
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;

	@FindBy (xpath = " //body/div[1]/main[1]/section[1]/a[1]")
	public WebElement SignUP;
}
