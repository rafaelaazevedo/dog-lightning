package azevedorafaela.cucumbermaven.steps;

import azevedorafaela.cucumbermaven.pages.LoginPage;
import azevedorafaela.cucumbermaven.support.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private final BaseUtil base;
	LoginPage loginPage;

	public LoginSteps(BaseUtil base) {
		this.base = base;
		loginPage = new LoginPage(base);
	}


	@Given("^I have opened the browser$")
	public void I_have_opened_the_browser() throws Throwable {
		loginPage.getLoginUrl();
	}

	// This will fail since the user and the password are incorrect
	@When("^I send my credentials \"([^\"]*)\"$")
	public void i_send_my_credentials(String user) throws Throwable {
		loginPage.login(user);
	}

	@Then("^I should see the \"([^\"]*)\" title of the page$")
	public void i_should_see_the_title_of_the_page(String title) throws Throwable {
		loginPage.assertTitlePage(title);
	}
}
