package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tests/features",
        plugin = {"pretty","html:target/CucumberHTMLReport.html"})
public class Runner {
}