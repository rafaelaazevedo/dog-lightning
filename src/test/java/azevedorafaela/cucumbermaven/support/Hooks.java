package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {

	BaseUtil base;

	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void testInitializer() {
			base.setDriver(new ChromeDriver(ChromeDriverService.createDefaultService()));
			base.setBaseURl("https://wordpress.com/");
			base.setUser("user");
			base.setPassword("password");
	}

	@After
	public void tearDownTest() {
		base.getDriver().close();
	}
}
