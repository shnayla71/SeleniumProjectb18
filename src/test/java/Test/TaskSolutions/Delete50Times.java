package Test.TaskSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class Delete50Times {
    public static void main(String[] args) {
      //  1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button 50 times
     WebElement addClick=driver.findElement(By.xpath("//div[@class='example']/button"));
        // 4. Verify 50 “Delete” button is displayed after clicking.
        for(int i=0;i<=50;i++){
            addClick.click();
        }
        // 5. Click to ALL “Delete” buttons to delete them.
        List<WebElement> delButtons=driver.findElements(By.xpath(("//button[.='Delete']")));
       WebElement delClick= driver.findElement(By.xpath("//button[.='Delete']"));
        for(WebElement eachButton:delButtons){
            eachButton.click();
        }
        // 6. Verify “Delete” button is NOT displayed after clicking.
       try{
        if(!delClick.isDisplayed()){
            System.out.println("is PASSED");
        }else{
            System.out.println("is FAILED");
        }
       }catch (StaleElementReferenceException exception){
           System.out.println("StaleElementException has been thrown.");
           System.out.println("It means element has been completely deleted from the HTML.");
       System.out.println("Delete button is not displayed. Verification PASSED!");
       }
    }
    }

