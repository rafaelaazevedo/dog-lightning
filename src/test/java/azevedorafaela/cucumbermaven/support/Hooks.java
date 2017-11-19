package azevedorafaela.cucumbermaven.support;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {

	BaseUtil base;

	Properties prop = new Properties();
	InputStream input;

	public Hooks(BaseUtil base) {
		this.base = base;
	}

	@Before
	public void testInitializer() throws IOException {
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);
			//System.out.println(prop.getProperty("chromeDriver"));
			//System.setProperty("webdriver.chrome.driver", "../../src/test/resources/drivers/chromedriver");
			base.setDriver(new ChromeDriver());
			base.setBaseURl(prop.getProperty("baseUrl"));
			base.setUser(prop.getProperty("url"));
			base.setPassword(prop.getProperty("password"));
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			input.close();
		}
	}

	@After
	public void tearDownTest() {
		base.getDriver().close();
	}
}
