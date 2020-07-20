package Test.day11_ActionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class NegativeLoginTest {
    LoginPage loginPage;
    @Ignore
    @Test
    public void NegativeLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        WebElement username=Driver.getDriver().findElement(By.id("prependedInput"));
        WebElement password=Driver.getDriver().findElement(By.id("prependedInput2"));
        WebElement login=Driver.getDriver().findElement(By.id("_submit"));

        String usernameInput=ConfigurationReader.getProperty("storemanager_username");
        username.sendKeys(usernameInput);

       // String passwordInput=ConfigurationReader.getProperty("storemanager_password");
      // password.sendKeys(passwordInput);
        password.sendKeys("djeiksmmx");
     // we try with a wrong password so write this
        login.click();

      WebElement errorMessage=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-error']"));

        Assert.assertTrue(errorMessage.isDisplayed());


    }

    @Test
    public void NegativeLoginTest2_PageObject(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
        LoginPage loginPage=new LoginPage();

        String usernameInput=ConfigurationReader.getProperty("storemanager_username");
        loginPage.username.sendKeys(usernameInput);

       // String passwordInput=ConfigurationReader.getProperty("storemanager_password");
       loginPage.password.sendKeys("yeusjkaa");
   //WebElement password=Driver.getDriver().findElement(By.id("prependedInput2"));
     //   password.sendKeys("yeuudji");

        loginPage.login.click();

        Assert.assertTrue(loginPage.errorMessage.isDisplayed());


    }

    @Test
    public void WrongUsername(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        loginPage=new LoginPage();

        String username1="ashdjfk";
        String password1=ConfigurationReader.getProperty("storemanager_password");

        loginPage.login(username1,password1);

       String actualText=loginPage.errorMessage.getText();
       String expectedText="Invalid user name or password.";

       Assert.assertEquals(actualText,expectedText);




    }





}
