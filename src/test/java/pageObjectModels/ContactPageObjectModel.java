package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Lenovo G50-70 on 04-08-2017.
 */
public class ContactPageObjectModel {
    WebDriver driver;

    public ContactPageObjectModel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy(id = "message")
    WebElement txtMessage;

    @FindBy(id = "full_name")
    WebElement txtFullName;

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "contactform-submit")
    WebElement btnSubmit;

    @FindBy(xpath = "//*[@id='content']/div/div[2]/div/div/div")
    WebElement msgConfirmation;

    public void enterMessage(String text){
        txtMessage.sendKeys(text);
        System.out.println("Entered message: "+text);
    }

    public void enterEmail(String text){
        txtEmail.sendKeys(text);
        System.out.println("Entered email: "+text);
    }

    public void enterFullName(String text){
        txtFullName.sendKeys(text);
        System.out.println("Entered name: "+text);
    }

    public void clickSubmit(){
        btnSubmit.click();
        System.out.println("Clicked on Submit button.");
    }

    public String getSuccessStatus(){
        String status = msgConfirmation.getAttribute("class");
        if (status.equals("error-msg mb-16")) {
            System.out.println("Error");
            return "Error";
        }
        else {
            System.out.println("Success");
            return "Success";
        }
    }
}
