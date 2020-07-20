package Test.day10_javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class uploding {

    @Test
    public void uploading_test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/bilalsahin/Desktop/test.txt");
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-submit"));
        fileUpload.click();

        WebElement message=Driver.getDriver().findElement(By.xpath("//div[@class='example']/h3"));
        Assert.assertTrue(message.isDisplayed());


    }
}
