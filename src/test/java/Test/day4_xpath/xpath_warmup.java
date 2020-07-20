package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

/*
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” textd. E-mail input box
e. “Retrieve password” button
f. “Powered byCybertek School” text
 4. Verify all WebElements are displayed.
 */
public class xpath_warmup {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

       WebElement homeLink= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        if(homeLink.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        WebElement forgotPassword=driver.findElement(By.xpath("//*[@id='content']/div/h2"));
        if(forgotPassword.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
        if(Email.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
       WebElement Retrieve=driver.findElement(By.xpath("//*[@id=\"form_submit\"]"));
        if(Retrieve.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
     // byCybertek school
     WebElement Cybertek=driver.findElement(By.xpath("//*[@id='page-footer']/div/div"));
         if(Cybertek.isDisplayed()){
             System.out.println("passed");
         }else{
             System.out.println("failed");
         }
    }
}
