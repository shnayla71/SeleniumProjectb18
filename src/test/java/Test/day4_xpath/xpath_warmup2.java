package Test.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

/*
1. Open Chrome browser2. Go to http://practice.cybertekschool.com/add_remove_elements
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
public class xpath_warmup2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElement=driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElement.click();

        Thread.sleep(2000);

        WebElement delete=driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        delete.click();
        
        if(addElement.isDisplayed()){
            System.out.println("passed!");
        }else{
            System.out.println("failed");
        }
    }
}
