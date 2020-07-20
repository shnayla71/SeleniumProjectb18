package Test.day11_ActionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PossitiveLoginTest {
    LoginPage loginPage;
    @Test
    public void PositiveLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        loginPage=new LoginPage();

        String username1=ConfigurationReader.getProperty("storemanager_username");
        String password1=ConfigurationReader.getProperty("storemanager_password");
        loginPage.login(username1,password1);

        String actual=Driver.getDriver().getTitle();
        String expected="Dashboard";

        Assert.assertEquals(actual,expected);

    }
}
