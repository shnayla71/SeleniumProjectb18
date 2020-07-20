package Test.day3_cssSelector_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class xpathExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homeLink=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        if(homeLink.isDisplayed()){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }





    }
}
