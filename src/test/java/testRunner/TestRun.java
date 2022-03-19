package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features=".//Features//Login.feature",
        glue="stepDefinitions",
      plugin={"pretty","html:test-output"},
        monochrome=true,
        dryRun=false
        )

public class TestRun {

}

