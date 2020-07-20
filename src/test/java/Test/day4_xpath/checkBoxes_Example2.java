package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class checkBoxes_Example2 {
    public static void main(String[] args)throws Exception {
     //   1.Open	Chrome	browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

   // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html//
       driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        WebElement successCheckbox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));//
        WebElement successMessage=driver.findElement(By.xpath("//div[@id='txtAge']"));

        if(!successCheckbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Default value Passed");
        }else{
            System.out.println("default value failed!!!");
        }
        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section

        Thread.sleep(1000);
        successCheckbox.click();

        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.
     if(successMessage.isDisplayed()){
         System.out.println("success message is displayed passed!!");
     }else{
         System.out.println("success message is not displayed failed!!");
     }




    }
}
