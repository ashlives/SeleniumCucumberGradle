package stepDef;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjectModels.FooterPageObjectModel;

import static stepDef.Given_Steps.objContact;

public class Then_Steps {


    @Then("^I see success message$")
    public void i_see_success_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String status = objContact.getSuccessStatus();
        Assert.assertEquals(status, "Success");
    }
}
