package Test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTrxt {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();

        String actualLinkTitle = driver.getTitle();
        String expectedLinkTitle = "Gmail";

        if (actualLinkTitle.contains(expectedLinkTitle)) {
            System.out.println("Gmail title Passed!");
        } else {
            System.out.println("Gmail title Failed!");
        }

        driver.navigate().back();

        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google page is passed!");
        }else {
            System.out.println("Google page is failed!");
        }

    }
}