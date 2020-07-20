package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElement_meriamWebster {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.merriam-webster.com/");

        //linktext creating a list of webElements and storing values returned
      List<WebElement> listOfLinks=driver.findElements(By.xpath("//body//a"));
     // ArrayList<Integer> list={3,5,6,7,8,9};//1-absolute xpath/html/bod2-relative xpath
       // how many link is missing text
         int linksWithoutText=0;
         int linksWithText=0;
        for(WebElement eachlink:listOfLinks) {
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

        System.out.println("total link on page: "+listOfLinks.size());
    }
}
