package azevedorafaela.cucumbermaven.steps;

import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	private World world;

	@Inject
	public LoginSteps(World world) {
		this.world = world;
	}

	@Given("^I have opened the browser$")
	public void I_have_opened_the_browser() throws Throwable {
        world.loginPage = new LoginPage();
        world.loginPage.getLoginUrl();
	}

	@When("^I send my credentials \"([^\"]*)\"$")
	public void i_send_my_credentials(String user) throws Throwable {
	}

	@Then("^I should see the \"([^\"]*)\" title of the page$")
	public void i_should_see_the_title_of_the_page(String title) throws Throwable {
	}
}
