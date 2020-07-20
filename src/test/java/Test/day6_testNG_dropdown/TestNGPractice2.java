package Test.day6_testNG_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNGPractice2 {
   WebDriver driver;

   @BeforeMethod
   public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://www.google.com");
   }
   @AfterMethod
   public void tearDown()throws InterruptedException{
       Thread.sleep(2000);
       driver.quit();
   }

    @Test
    public void googleTitleTest(){

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test
    public void googleSearchBox(){
     //   WebDriver driver=WebDriverFactory.getDriver("chrome");
     //   driver.get("https://www.google.com");
        WebElement appleSearchBox=driver.findElement(By.name("q"));
        appleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String actualTitle="apple";
        String expectedTitle=driver.getTitle();

        Assert.assertTrue(expectedTitle.contains(actualTitle));

      //  Thread.sleep(2000);
      //  driver.close();
    }
}
