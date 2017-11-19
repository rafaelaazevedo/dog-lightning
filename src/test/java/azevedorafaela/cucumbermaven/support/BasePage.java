package azevedorafaela.cucumbermaven.support;

import java.net.URI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.java.Before;

@WebAppConfiguration
public class BasePage {

	private ChromeDriver driver;
	private URI baseUrl;
	private String password;

	@Before
	public void initialize() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		context.registerShutdownHook();
		baseUrl = context.getBean(BasePage.class).getBaseUrl();
		driver = context.getBean(BasePage.class).getDriver();
		password = context.getBean(BasePage.class).getPassword();
	}

	@Bean
	public ChromeDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		return driver;
	}

	@Bean
	public URI getBaseUrl() {
		return baseUrl;
	}

	@Bean
	public String getPassword() {
		return password;
	}

}
