package Test.day11_ActionPractice;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import utilities.Driver;

public class ActionsPracticesWithPageOBJ {

    @Test
    public void HoverOverTest()throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        HoversPage hoversPage=new HoversPage();
        Actions actions=new Actions(Driver.getDriver());

        //1.user ve img icin
        Thread.sleep(3000);
        actions.moveToElement(hoversPage.img1).perform();
        Assert.assertTrue(hoversPage.user1.isDisplayed());

        //2.user and img
        Thread.sleep(3000);
        actions.moveToElement(hoversPage.img2).perform();
        Assert.assertTrue(hoversPage.user2.isDisplayed());

        //3.user
        Thread.sleep(3000);
        actions.moveToElement(hoversPage.img3).perform();
        Assert.assertTrue(hoversPage.user3.isDisplayed()) ;


    }
}
