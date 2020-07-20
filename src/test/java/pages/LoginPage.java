package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/*
this class will store all login page releated web elements and methods in it
 */
public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
   // WebElement username=Driver.getDriver().findElement(By)
    @FindBy(id="prependedInput")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id="_submit")
    public WebElement login;

    @FindBy(xpath="//div[@class='alert alert-error']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[3]/a")
    public WebElement forgotText;

    public void login(String username1,String password1){
        username.sendKeys(username1);
        password.sendKeys(password1);
        login.click();
    }


}
