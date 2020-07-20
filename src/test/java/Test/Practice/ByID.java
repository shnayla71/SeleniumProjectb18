package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://facebook.com");

        // 1.Inspect the elements

        // 2.Find the id of email input box, type random email (Sendkey)

        driver.findElement(By.id("email")).sendKeys("anyemail@gmail.com");
        // 3.Find the id of password input box, type random password (Sendkey)
driver.findElement(By.id("pass")).sendKeys("mypassword");

        // 4.Find the id of Log in Button then click.
driver.findElement(By.id("u_0_b")).click();

        // 5. Close the tab
driver.close();
    }
}
