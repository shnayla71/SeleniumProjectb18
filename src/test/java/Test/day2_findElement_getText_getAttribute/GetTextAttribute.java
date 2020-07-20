package Test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println(driver.findElement(By.linkText("Gmail")).getText());

        System.out.println(driver.findElement(By.linkText("Gmail")).getAttribute("href"));

    }
}
