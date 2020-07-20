package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // 1.Inspect the page source

        // 2. Find the ClassName of search box on Amazon.com
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");

        // 3. Type any item name (SendKeys)


        // 4. Clear your item name from search box
driver.findElement(By.id("twotabsearchtextbox")).clear();

        // 5. Find the ClassName of "Hello, Sign In Account & Lists"  on top right and click

driver.findElement(By.id("nav-link-accountList")).click();

        // 6. Find the ClassName of "Today's Deal" on top center and click
driver.navigate().back();
driver.findElement(By.linkText("Today's Deals")).click();


    }
}
