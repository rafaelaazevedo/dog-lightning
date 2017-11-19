package azevedorafaela.cucumbermaven.pages;

import static org.junit.Assert.*;

import java.net.URI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import azevedorafaela.cucumbermaven.support.BasePage;

@ContextConfiguration(classes = { BasePage.class })
public class LoginPage {

	@Autowired
	protected ChromeDriver driver;

	@Autowired
	protected URI getBaseUrl;

	@Autowired
	protected String getPassword;

	public void getLoginUrl() throws Throwable {
		driver.get(getBaseUrl.toString());
	}

	public void login(String user) throws Throwable {
		driver.findElementByName("log").click();
		driver.findElementByName("log").sendKeys(user);

		driver.findElementByName("pwd").click();
		driver.findElementByName("pwd").sendKeys(getPassword);

		driver.findElementByName("wp-submit").click();
	}

	public void assertTitlePage(String title) throws Throwable {
		assertEquals(driver.getTitle(), title);
	}

}
