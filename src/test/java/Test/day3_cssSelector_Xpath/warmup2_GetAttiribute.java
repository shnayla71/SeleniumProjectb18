package Test.day3_cssSelector_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class warmup2_GetAttiribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

       // System.out.println(driver.findElement(By.linkText("Forgot your password?")).getAttribute("href"));

        WebElement forgotpassLink =driver.findElement(By.partialLinkText("Forgot"));

        String actualLink=forgotpassLink.getAttribute("href");
        String expectedLink="/forgot-password.html";

                if(actualLink.contains(expectedLink)){
                    System.out.println("passed");
                }else{
                    System.out.println("failed");
                 }

    }
}
