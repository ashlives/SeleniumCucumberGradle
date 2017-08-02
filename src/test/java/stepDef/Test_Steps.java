package stepDef;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Lenovo G50-70 on 02-08-2017.
 */
public class Test_Steps {
    public static WebDriver driver;
    @Given("^I am on Home Page of \"([^\"]*)\"$")
    public void i_am_on_Home_Page_of(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
    }

    @Given("^I click on Contact in Footer$")
    public void i_click_on_Contact_in_Footer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I'm taken to Contact Page$")
    public void i_m_taken_to_Contact_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
