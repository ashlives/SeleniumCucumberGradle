package stepDef;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModels.CookiesNoticePageObjectModel;
import pageObjectModels.FooterPageObjectModel;

import java.util.List;

public class Given_Steps {

    public static WebDriver driver;
    public static FooterPageObjectModel objFooter;
    public static CookiesNoticePageObjectModel objCookies;
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
        objFooter = new FooterPageObjectModel(driver);
        objFooter.clickContact();
    }

    @Given("^I click OK on Cookies Popup$")
    public void i_click_OK_on_Cookies_Popup(){
        objCookies = new CookiesNoticePageObjectModel(driver);
        objCookies.acceptCookies();
    }

}
