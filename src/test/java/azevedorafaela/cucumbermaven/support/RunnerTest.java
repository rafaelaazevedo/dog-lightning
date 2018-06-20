package azevedorafaela.cucumbermaven.support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Features is the folder that contains your feature files
//Glue is the package that contains your step definition classes
//Pretty is the report format, you can add or edit
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" }, features = "classpath:features", glue = "azevedorafaela.cucumbermaven.steps")
public class RunnerTest {

}
