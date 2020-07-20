package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bylinktext {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        // 1. Inspect the page source


        // 2. Maximize the window
  driver.manage().window().maximize();

        // 3. Find the LinkText of "AmazonBasics" and click

 driver.findElement(By.linkText("AmazonBasics")).click();
        // 4. Navigate your browser back
driver.findElement(By.linkText("Free Shipping")).click();

        // 5. Find the LinkText of  "Free Shipping" and click


        // 6. Refresh your browser

driver.navigate().refresh();
        // 7. Close the tab

driver.close();

    }
}
