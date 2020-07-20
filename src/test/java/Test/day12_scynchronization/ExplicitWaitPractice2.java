package Test.day12_scynchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading1Page;
import utilities.Driver;

public class ExplicitWaitPractice2 {
    @Test
    public void Dynamic_FormTest(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        Loading1Page loading1Page=new Loading1Page();
         loading1Page.startButton.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.invisibilityOf(loading1Page.loaidgBar));

         loading1Page.usernameInput.sendKeys("tomsmith");

         loading1Page.passwordInput.sendKeys("isgfha");

         loading1Page.submitButton.click();

       //  String actualMessage=Driver.getDriver().findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        //System.out.println(actualMessage);
         //String expectedMessage="Your password is invalid!\n" + "×";

        Assert.assertTrue(loading1Page.errorMessage.isDisplayed());

    }
}
