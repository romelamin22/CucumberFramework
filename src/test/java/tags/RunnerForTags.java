package tags;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Tags"},
        glue = {"tags/step_def"},
        tags = {"@SmokeTest"},
        plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-html-report.html"}
)
public class RunnerForTags {

}
