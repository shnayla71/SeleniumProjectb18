package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Alert_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts ");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void alert(){
    WebElement button= driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]"));
    button.click();
   //click to alert button
   //alert olusturma
        Alert alert=driver.switchTo().alert();
    // use alert to accept the alert
        alert.accept();
        WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(result.isDisplayed());
    }
   @Test
    public void confirm(){
  WebElement confirm=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
   confirm.click();
    Alert alert=driver.switchTo().alert();
    alert.dismiss();

    WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
    Assert.assertTrue(result.isDisplayed());

    }
  @Test
    public void promt(){
      WebElement prompt=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
      prompt.click();
      Alert alert=driver.switchTo().alert();
      alert.sendKeys("ayla");
      alert.accept();

      WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
      Assert.assertTrue(result.isDisplayed());

  }






}
