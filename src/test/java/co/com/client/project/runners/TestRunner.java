package co.com.client.project.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/feature.feature"},
        glue = "co.com.client.project.stepdefinitions")
public class TestRunner {
}
