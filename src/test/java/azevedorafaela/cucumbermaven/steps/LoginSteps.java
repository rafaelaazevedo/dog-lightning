package azevedorafaela.cucumbermaven.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;

	//This is just a basic test, so you need to add the browsers you want to run, etc.
	public LoginSteps() {
		//Place with 
		System.setProperty("webdriver.chrome.driver", "../driver/chromedriver");
		driver = new ChromeDriver();
	}

	@Given("^I have opened the browser$")
	public void I_have_opened_the_browser() throws Throwable {
		driver.get("https://wordpress.com/");
	}

	//This will fail since the user and the password are incorrect
	@When("^I send my credentials$")
	public void i_send_my_credentials() throws Throwable {
		driver.findElementByName("log").click();
		driver.findElementByName("log").sendKeys("test");

		driver.findElementByName("pwd").click();
		driver.findElementByName("pwd").sendKeys("testpassword");

		driver.findElementByName("wp-submit").click();
	}

	@Then("^I should see the title of the page$")
	public void i_should_see_the_title_of_the_page() throws Throwable {
		assertEquals(driver.getTitle(), "Wordpress");
		driver.close();
		driver.quit();
	}
}
