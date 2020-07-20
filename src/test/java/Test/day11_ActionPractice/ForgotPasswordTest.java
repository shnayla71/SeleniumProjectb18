package Test.day11_ActionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RequestPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ForgotPasswordTest {

    @Test
    public void ForgotTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
         LoginPage loginPage =new LoginPage();
         loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
      //  loginPage.forgotText.click();

     //   String actualTitle=Driver.getDriver().getTitle();
     //   String expectedTitle="Forgot Password";

     //   Assert.assertEquals(actualTitle,expectedTitle);

        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa2.vytrack.com/user/reset-request";

     //   Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void RequestButton(){
        Driver.getDriver().get(ConfigurationReader.getProperty("forgotpassword_url"));
        RequestPages requestPages=new RequestPages();

        requestPages.username2.sendKeys("names");
        requestPages.requestButton.click();
      Assert.assertTrue(requestPages.errorMessage.isDisplayed());

      String actualMessage=requestPages.errorMessage.getText();
     String expectedMessage="There is no active user with username or email address \"names\".";

    Assert.assertEquals(actualMessage,expectedMessage);
    }
}
