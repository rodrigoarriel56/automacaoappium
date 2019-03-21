package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features", tags = "@cadastroLogin", glue = "steps"

)

public class TestRunner {

}