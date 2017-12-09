package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	
	protected abstract WebDriver createDriver();
	public abstract WebDriver getDriver();

}
