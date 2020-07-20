package Test.TaskSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class forgot_password {
    public static void main(String[] args) {
        /*
           //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
           //1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            //2. Go to
            http://practice.cybertekschool.com/forgot_password
            driver.get("http://practice.cybertekschool.com/forgot_password");
            //3. Locate all the WebElements on the page using XPATH locator only (total of 6)
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

          driver.findElement(By.xpath("//a[@class='nav-link']"));
       // driver.navigate().back();
          driver.findElement(By.xpath("//h2[.='Forgot Password']"));

          driver.findElement(By.xpath("//label[@for='email']"));

          driver.findElement(By.xpath("//input[@name='email']"));

          driver.findElement(By.xpath("//button[@id='form_submit']"));

          driver.findElement(By.xpath("//a[.='Cybertek School']"));


    }
}
