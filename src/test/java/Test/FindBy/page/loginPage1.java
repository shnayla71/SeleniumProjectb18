package Test.FindBy.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage1 {
    WebDriver driver;

    public loginPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="prependedInput")
    public WebElement username1;

    @FindBy(id="prependedInput2")
    public WebElement password1;

    @FindBy(id="_submit")
    public WebElement logInButton;

    public void LogIn(String username,String password){
        username1.sendKeys(username);
        password1.sendKeys(password);
        logInButton.click();
    }
}
