package Test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // option+enter for manual import
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        driver.findElement(By.name("btnK")).click();
        String actualTitle=driver.getTitle();
        String expectedTitle="apple";

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Search title Passed!");
        }else{
            System.out.println("Search title not Passed!");
        }
        
        

    }

}
