package Test.FindBy.testCase;

import Test.FindBy.page.loginPage1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class loginpageTest {
    @Test
    public void homePageFindby(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        loginPage1 lg1=new loginPage1(driver);
        lg1.LogIn("user22","UserUser123");
    }
}
