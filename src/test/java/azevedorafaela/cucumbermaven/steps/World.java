package azevedorafaela.cucumbermaven.steps;

import azevedorafaela.cucumbermaven.pages.LoginPage;
import azevedorafaela.cucumbermaven.support.DriverFactory;
import azevedorafaela.cucumbermaven.support.Support;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class World {
    DriverFactory driverFactory;
    LoginPage loginPage;
    Support support;
}
