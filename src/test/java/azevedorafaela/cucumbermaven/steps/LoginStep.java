package azevedorafaela.cucumbermaven.steps;

import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.pages.LoginPage;
import azevedorafaela.cucumbermaven.support.World;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	// Here you need to inject the pages that you need to use
	// Then you don't need to create new instance 
	@Inject
	private World world;

	@Inject
	private LoginPage loginPage;

	@Given("^I have opened the browser$")
	public void i_have_opened_the_browser() throws Throwable {
		loginPage.navigate();
	}

	@When("^I send my credentials$")
	public void i_send_my_credentials() throws Throwable {
		loginPage.login(world.support.user, world.support.pass);
	}

	@Then("^I should see the \"([^\"]*)\" title of the page$")
	public void i_should_see_the_title_of_the_page(String title) throws Throwable {
		loginPage.assertTitle(title);
	}
}
