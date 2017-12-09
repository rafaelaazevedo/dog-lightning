package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeManager extends DriverManager {

	protected ChromeDriver driver;
	
	@Override
	protected WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		return driver = new ChromeDriver(ChromeDriverService.createDefaultService());	
	}

	@Override
	public WebDriver getDriver() {
		if (driver == null){
			this.createDriver();
		}
		return driver;
	}

}