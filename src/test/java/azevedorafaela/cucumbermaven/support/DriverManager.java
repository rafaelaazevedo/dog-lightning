package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	// Abstract class to be implemented for each
	// browser according to each one's settings
	protected abstract WebDriver createDriver();

	public abstract WebDriver getDriver();

}
