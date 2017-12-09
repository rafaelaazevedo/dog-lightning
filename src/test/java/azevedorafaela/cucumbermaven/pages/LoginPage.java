package azevedorafaela.cucumbermaven.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.support.World;

public class LoginPage extends BasePage {

	public String URL = "log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F";

	@Inject
	public LoginPage(World world) {
		super(world);
	}

	@FindBy	(id = "usernameOrEmail") WebElement username;
	@FindBy	(id = "password") WebElement password;
	@FindBy	(css = "button[type='submit']") WebElement submit;
	
	public void login(String user, String pass) {
		username.clear();
		username.sendKeys(user);
		submit.click();
		world.wait.waitElement(password);
		password.clear();
		password.sendKeys(pass);
		submit.click();
	}
	
	public void navigate() {
		world.driver.get(world.support.baseUrl + URL);
	}
	
	public void assertTitle(String expectedTitle) {
		Assert.assertEquals(world.driver.getTitle(), expectedTitle);
	}
}
