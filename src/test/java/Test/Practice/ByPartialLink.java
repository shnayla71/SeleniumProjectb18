package Test.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLink {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        driver.findElement(By.partialLinkText("Service")).click();

        driver.navigate().back();

        driver.findElement(By.linkText("Sell Your Services on Amazon")).click();
    }
}
