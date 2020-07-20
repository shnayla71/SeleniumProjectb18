package Test.TaskSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class CheckAllboxes {
    public static void main(String[] args) {
      //  1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    //2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Check All” button text is “Check All”
       WebElement checkAll=driver.findElement(By.xpath("//input[@id='check1']"));
        // 4.Click to “Check All” button
        checkAll.click();
        // 5.Verify all check boxes are checked
        List<WebElement> checkboxList = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxList){
            if (checkbox.isSelected()){
                System.out.println("Checkbox is selected. PASS!");
            } else{
            System.out.println("Checkbox is NOT selected. FAIL!");            }        }


        // 6.Verify button text changed to “Uncheck All”
        String actualButtonTextAfterClick = checkAll.getAttribute("value");
        String expectedValueAfterClick = "Uncheck All";
        if (actualButtonTextAfterClick.equals(expectedValueAfterClick)){
            System.out.println("Final verification PASSED!");
        }else{
            System.out.println("Final verification FAILED!!!");
        }
    }
}

