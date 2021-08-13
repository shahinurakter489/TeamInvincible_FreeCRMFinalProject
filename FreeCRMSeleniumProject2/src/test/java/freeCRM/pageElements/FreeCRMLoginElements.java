package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMLoginElements {
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;

	@FindBy (xpath = "//header/div[1]/nav[1]/div[1]/div[1]/a[1]/span[1]")
	public WebElement Login;
}
