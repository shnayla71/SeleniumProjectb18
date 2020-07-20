package Test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windows {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windows ");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void windowsPractice() {
     String currentWindowHandle=driver.getWindowHandle();
        System.out.println("currentWindowHandle: "+currentWindowHandle);

        // 4.Assert:	Title	is	“Practice”
        // 5.Click	to:	“Click	Here”text
     WebElement clickhere= driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
      clickhere.click();                                //a[.='Click Here']
     // 6.Switch	to	new	Window.
     Set<String> allwindows= driver.getWindowHandles();//returns us a set of strings
      for(String each:allwindows){
          driver.switchTo().window(each);
          System.out.println(driver.getTitle());
      }
        // 7.Assert:	Title	is	“New	Window”
        
    }

}