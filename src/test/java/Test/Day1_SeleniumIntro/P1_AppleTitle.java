package Test.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_AppleTitle {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.apple.com");

       if(driver.getTitle().equals("Apple")){
            System.out.println("Title is verified");
        }else{
            System.out.println("title is not verified");
        }
       // driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        if(driver.getCurrentUrl().equals("https://www.apple.com/")){
            System.out.println("Url is verified");
        }else{
            System.out.println("title is not ok");
        }
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        driver.close();
    }
}
