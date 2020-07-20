package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RequestPages {
    public RequestPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement username2;

    @FindBy(xpath="//button[.='Request']")
    public WebElement requestButton;

    @FindBy(xpath="//div[@class='alert alert-error']")
    public WebElement errorMessage;
}
