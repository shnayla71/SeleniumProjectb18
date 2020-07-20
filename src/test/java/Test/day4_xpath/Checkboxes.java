package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Checkboxes {
    public static void main(String[] args) throws Exception{
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        if(!checkbox1.isSelected()){
            System.out.println("checkbox 1 is not selected.Verification passed");

        }else{
            System.out.println("checkbox 1 is selected.Verification is failed");
        }
       WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        if(checkbox2.isSelected()){
            System.out.println("checkbox 2 is selected.Verification passed");
        }else{
            System.out.println("checkbox 2 is not selected.Verification failed");
        }
        Thread.sleep(1000);
        checkbox1.click();

        Thread.sleep(1000);
        checkbox2.click();
        if(checkbox1.isSelected()){
            System.out.println("checkbox 1 is  selected.Verification passed");

        }else{
            System.out.println("checkbox 1 is not selected.Verification is failed");
        }
        if(!checkbox2.isSelected()){
            System.out.println("checkbox 2 is not selected.Verification passed");
        }else{
            System.out.println("checkbox 2 is selected.Verification failed");
        }

    }
}
