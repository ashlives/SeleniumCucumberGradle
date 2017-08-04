package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjectModels.ContactPageObjectModel;
import pageObjectModels.CookiesNoticePageObjectModel;
import pageObjectModels.FooterPageObjectModel;

/**
 * Created by Lenovo G50-70 on 04-08-2017.
 */
public class Contact_Form {
    public static WebDriver driver;
    public static ContactPageObjectModel objContact;
    public static CookiesNoticePageObjectModel objCookies;

    @Given("^I am on Home Page of \"([^\"]*)\"$")
    public void i_am_on_Home_Page_of(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
        objContact = new ContactPageObjectModel(driver);
        objCookies = new CookiesNoticePageObjectModel(driver);
    }

    @Given("^Dismiss cookies popup$")
    public void dismiss_cookies_popup() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objCookies.acceptCookies();
    }

    @When("^I enter message as \"([^\"]*)\"$")
    public void i_enter_message_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objContact.enterMessage(arg1);
    }

    @When("^I enter full name as \"([^\"]*)\"$")
    public void i_enter_full_name_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objContact.enterFullName(arg1);
    }

    @When("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objContact.enterEmail(arg1);
    }

    @When("^I click on Submit button$")
    public void i_click_on_Submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        objContact.clickSubmit();
    }

    @Then("^I see success message$")
    public void i_see_success_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String status = objContact.getSuccessStatus();
        Assert.assertEquals(status, "Success");
        driver.quit();
    }
}
