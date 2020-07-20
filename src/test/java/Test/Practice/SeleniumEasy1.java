package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

      driver.findElement(By.id("sum1")).sendKeys("10", Keys.ENTER);
      driver.findElement(By.id("sum2")).sendKeys("24",Keys.ENTER);
      driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();



    }
}
