package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class FooterPageObjectModel {
    WebDriver driver;

    public FooterPageObjectModel(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(id = "select-country")
    WebElement countryDropdown;

    @FindBy(xpath = ".//*[@id='footer']/div/div/div[2]/div/ul/li[1]/a")
    WebElement about;

    @FindBy(xpath = ".//*[@id='footer']/div/div/div[2]/div/ul/li[2]/a")
    WebElement contact;

    @FindBy(xpath = ".//*[@id='footer']/div/div/div[2]/div/ul/li[3]/a")
    WebElement downloadApp;

    @FindBy(xpath = ".//*[@id='footer']/div/div/div[2]/div/ul/li[4]/a")
    WebElement cookiePolicy;

    public void clickContact()
    {
        contact.click();
    }

    public void selectCountry(String country){
        Select drpCountry = new Select(countryDropdown);
        drpCountry.selectByVisibleText(country);
    }
}
