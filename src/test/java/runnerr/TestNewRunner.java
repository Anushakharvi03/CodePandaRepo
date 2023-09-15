package runnerr;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//mention path of feature file in 'features=' and mention path of stepDefinition package in 'glue='
@CucumberOptions(features="src/test/java/features",glue={"stepDefinition", "helper"},tags="@Reg")
public class TestNewRunner {
}