package Test.day3_cssSelector_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class cssSelector_Example {
    public static void main(String[] args)throws Exception {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

      WebElement amazonSearch= driver.findElement(By.cssSelector("input[tabindex='19']"));
      amazonSearch.sendKeys("wooden spoon"+ Keys.ENTER);

      String actualTitle=driver.getTitle();
      String expectedTitle="wooden spoon";

      Thread.sleep(1000);
      if(actualTitle.contains(expectedTitle)){
          System.out.println("Passed");
      }else{
          System.out.println("Failed");
      }


    }
}
