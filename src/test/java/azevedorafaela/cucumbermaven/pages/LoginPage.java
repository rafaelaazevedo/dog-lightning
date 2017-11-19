package azevedorafaela.cucumbermaven.pages;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;

import azevedorafaela.cucumbermaven.support.BaseUtil;
import azevedorafaela.cucumbermaven.support.Support;

public class LoginPage extends BaseUtil {
    BaseUtil base;
    Support support = new Support(base);

    /*You can declare the elements of the page here (on top of the page)
    or you can create a library to declare the key and value 
    for the elements of each page*/
 
    // ELEMENTS
	WebElement userInput = support.findElementByName("log");
	WebElement passInput = support.findElementByName("pwd");
	WebElement submit = support.findElementByName("wp-submit");

    public LoginPage(BaseUtil base){
        this.base=base;
    }
    
	public void getLoginUrl() throws Throwable {
		support.loadBaseUrl();
	}

	public void login(String user) throws Throwable {
		userInput.click();
		userInput.sendKeys(base.getUser());

		passInput.click();
		passInput.sendKeys(base.getPassword());

		submit.click();
	}

	public void assertTitlePage(String title) throws Throwable {
		assertEquals(base.getDriver().getTitle(), title);
	}

}
