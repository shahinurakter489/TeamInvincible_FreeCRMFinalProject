package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMAppStoreElements {

@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
public WebElement HomePage;

@FindBy(xpath = "//IMG[@alt='iTunes']")
public WebElement Appstore;
}

