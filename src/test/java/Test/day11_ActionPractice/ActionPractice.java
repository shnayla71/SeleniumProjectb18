package Test.day11_ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionPractice {
   Actions actions;
   @Test
   public void scrolling_with_actions() throws InterruptedException{
       //get our page
       Driver.getDriver().get("http://practice.cybertekschool.com/");

       //creating actions instance to be able to use its methods
       actions = new Actions(Driver.getDriver());

       //locating the web element we want to scroll to
       WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
       WebElement inputs = Driver.getDriver().findElement(By.linkText("Inputs"));

       Thread.sleep(3000);
       //using actions instance we use moveToElement method
       actions.moveToElement(cybertekSchoolLink).perform();

       Thread.sleep(3000);
       actions.moveToElement(inputs).click().perform();

   }

}
