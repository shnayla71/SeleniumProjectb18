package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading7pages {
    public Loading7pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//strong")
    public WebElement doneMessage;

    @FindBy(xpath="//*[@id=\"content\"]/img")
    public WebElement sponeBobImage;
}
