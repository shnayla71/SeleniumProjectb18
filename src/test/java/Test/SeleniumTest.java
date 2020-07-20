package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();//asagiyi yazmazsak bos data sayfasi acar
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());// Google

        //browser Navigations
        Thread.sleep(2000);//2 seconds wait
        driver.navigate().back();//will take user to the previous page

        Thread.sleep(2000);
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.facebook.com");

        System.out.println(driver.getTitle());// sayfa ismini yaziyor

        System.out.println(driver.getCurrentUrl());//url aciyor

        System.out.println(driver.getPageSource());//sayfa bilgilerini gozteriyor

       driver.manage().window().maximize(); //tam ekran yapiyor
        driver.close();// web sayfasindan cikip intelijya donmek icin
    }
}
