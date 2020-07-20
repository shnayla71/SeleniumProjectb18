package Test.day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Warmup3_Account {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
      driver.findElement(By.name("user_login")).sendKeys("username");
      driver.findElement(By.name("user_password")).sendKeys("password");
      driver.findElement(By.name("user_remember_me")).click();
      driver.findElement(By.name("submit")).click();


        if(driver.getTitle().equals("Zero-Account Summary")){
            System.out.println("Landing Passed!");
        }else{
            System.out.println("Landing failed!!!");
        }
    }
}
