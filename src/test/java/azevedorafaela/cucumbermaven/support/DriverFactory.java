package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.WebDriver;

// Need to implement the other browsers and create a switch
public class DriverFactory {
	public WebDriver getManager() {
		return new ChromeManager().getDriver();
	}
}
