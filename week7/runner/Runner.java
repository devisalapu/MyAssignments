package runner;


import io.cucumber.testng.CucumberOptions;
import steps.Baseclass;

@CucumberOptions(features="src/test/java/feature/MergeLead.feature",
glue="steps",
monochrome=true)
//tags = "@Smoke")

public class Runner extends Baseclass {
	
}
