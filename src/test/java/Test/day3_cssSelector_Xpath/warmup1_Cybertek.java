package Test.day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmup1_Cybertek {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("shnayla71@gmail.com");

        WebElement retriveButton=driver.findElement(By.id("form_submit"));
         retriveButton.click();
         //5-Verify URL contains
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="email_sent";
          if(actualUrl.contains(expectedUrl)){
              System.out.println("URL verification passed");
          }else{
              System.out.println("URL verification failed");
          }
        //6-verify textbox display the concent as expected
        WebElement confirmMessage=driver.findElement(By.name("confirmation_message"));
         String actualText=confirmMessage.getText();
         String expectedText="Your e-mail's been sent!";
          if(actualText.equals(expectedText)){
              System.out.println("Text is Passed!");
          }else{
              System.out.println("Text is Failed!");
          }

         if(confirmMessage.isDisplayed()){
             System.out.println("true");
         }else{
             System.out.println("false");
         }

    }
}
