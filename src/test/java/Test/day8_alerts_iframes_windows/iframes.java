package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class iframes {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe ");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void iframePractice(){
        //Locating iframe as webelement
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
       // switch iframe using webelement
        driver.switchTo().frame(iframe);

     WebElement contentText=driver.findElement(By.xpath("//p"));

        Assert.assertTrue(contentText.isDisplayed());
        // we have to switch back to default html to locate a new one
        driver.switchTo().parentFrame();
        //switching to iframe using id or name
     //   driver.switchTo().frame("mce_0_ifr");

        WebElement h3Text=driver.findElement(By.xpath("//h3"));
       Assert.assertTrue(h3Text.isDisplayed());


    }
}
