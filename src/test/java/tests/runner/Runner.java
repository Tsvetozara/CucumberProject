package tests.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tests/features",
        glue = "tests.stepdefinitions",
        plugin = {"pretty", "html:target/CucumberHTMLReport.html"},
        tags = "@all"
)
public class Runner {
}