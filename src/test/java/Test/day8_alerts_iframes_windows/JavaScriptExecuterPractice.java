package Test.day8_alerts_iframes_windows;

import Test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class JavaScriptExecuterPractice extends TestBase {

    @Test
    public void WindowHandle(){
        driver.get("https://www.amazon.com");

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> allwindows= driver.getWindowHandles();//returns us a set of strings
        for(String each:allwindows){
            driver.switchTo().window(each);
            System.out.println("Current title: " +driver.getTitle());
            if(driver.getTitle().contains("Etsy")) {
                Assert.assertTrue(true);
                break;
            }
        }

    }
}
