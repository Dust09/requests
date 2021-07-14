package cucumber.cucumberOption;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//feature
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/features",  // where my .feature
        glue = "cucumber/defenation" //package name
)
public class TestRunner {


}
