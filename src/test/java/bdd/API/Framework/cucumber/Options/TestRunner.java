package bdd.API.Framework.cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bdd/API/Framework/features",
                    glue = "Framework/stepDefination")
public class TestRunner {

}
