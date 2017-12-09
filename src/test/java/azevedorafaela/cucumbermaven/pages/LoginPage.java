package azevedorafaela.cucumbermaven.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.support.World;

public class LoginPage {
	private World world;

	@Inject
	public LoginPage(World world) {
		this.world = world;
	}

	public String URL = "log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F";
	
	@FindBy	(id = "usernameOrEmail") WebElement username;
	@FindBy	(id = "password") WebElement password;
	@FindBy	(css = "button[type='submit']") WebElement submit;
	
	public void login(String user, String pass) {
		username.clear();
		username.sendKeys(user);
		submit.click();
		password.clear();
		password.sendKeys(pass);
		submit.click();
	}
	
	public void navigate() {
		System.out.println(world.support.user);
		this.world.driver.get(world.support.baseUrl + URL);
	}
	
	public void assertTitle(String expectedTitle) {
		Assert.assertEquals(this.world.driver.getTitle(), expectedTitle);
	}
}
