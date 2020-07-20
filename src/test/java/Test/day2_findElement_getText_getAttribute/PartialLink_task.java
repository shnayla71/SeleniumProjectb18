package Test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink_task {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

       // driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");

        driver.findElement(By.className("wt-input-btn-group__btn")).click();


        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed!!");
        }else{
            System.out.println("Failed!!");
        }
    }
}
