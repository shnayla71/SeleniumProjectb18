package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.instagram.com/");

        // 1.Inspect the elements

        // 2.Find the name of email input box, type random email (Sendkeys)
driver.findElement(By.name("username")).sendKeys("anyname@gmail.com");

        // 3.Find the name of password input box, type random password (Sendkeys)
driver.findElement(By.name("password")).sendKeys("pass1234"+ Keys.ENTER);

        // 4.And press ENTER (SendKeys(Keys.ENTER))


        // 5. Close the tab
driver.close();
    }

}
