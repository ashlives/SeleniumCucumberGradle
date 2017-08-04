package tests;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"},glue={"stepDef"},format={"pretty", "html:target/Destination"})

public class Test_Runner extends AbstractTestNGCucumberTests {

}
