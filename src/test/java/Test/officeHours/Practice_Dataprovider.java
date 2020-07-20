package Test.officeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class Practice_Dataprovider {
    WebDriver driver;
    @Test(dataProvider = "getData")
    public void homePageLogin(String username,String password){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://qa2.vytrack.com/user/login");

       driver.findElement(By.id("prependedInput")).sendKeys(username);
       driver.findElement(By.id("prependedInput2")).sendKeys(password);
       driver.findElement(By.id("_submit")).click();

    }
    @DataProvider
    public Object[][] getData(){
        return  new Object[][]{
                {"user22","UserUser123"},
                {"user23","UserUser123"},
                {"storemanager65","UserUser123"},
                {"storemanager66","UserUser123"},
                {"salesmanager122","UserUser123"},
                {"salesmanager123","UserUser123"},
                {"salesmanager124","UserUser123"}
        };
    }
}
