package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Example_Apple {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement iphonelink=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
         iphonelink.click();

      List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));// body haric tum linkleri yazar
        int linksWithoutText=0;// linksiz bosluklar
        int linksWithText=0; // linki olan textler
        for(WebElement eachlink:allLinks) {
            // System.out.println(eachlink.getText());
            String textOfLink=eachlink.getText();
            if(textOfLink.isEmpty()){
                linksWithoutText++;
            }else {
                System.out.println(textOfLink);
                // how many link has text
                linksWithText++;
            }
        }   // link has text
        System.out.println("the number of has text: "+linksWithText);
        System.out.println("the number of has not text: "+linksWithoutText);

        System.out.println("total link on page: "+allLinks.size());
    }



    }

