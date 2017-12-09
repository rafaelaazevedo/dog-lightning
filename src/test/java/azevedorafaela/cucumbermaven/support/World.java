package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.WebDriver;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class World {
	public WebDriver driver = new DriverFactory().getManager();
	public Support support = new Support();
	public Wait wait = new Wait(driver);
}
