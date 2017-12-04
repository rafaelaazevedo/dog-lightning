package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DriverFactory {

	protected ChromeDriver getDriver() {
		return new ChromeDriver(ChromeDriverService.createDefaultService());
	}

}
