package tests;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"},glue={"stepDef"})

public class Test_Runner extends AbstractTestNGCucumberTests {

}
