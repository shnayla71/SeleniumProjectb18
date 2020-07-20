package Test.day10_javascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionTest_15_18 {
    @Test
    public void hover_overTest() throws Exception{
        Driver.getDriver().get("https://www.amazon.com");
        Actions action=new Actions(Driver.getDriver());
        WebElement languagelement=Driver.getDriver().findElement(By.id("icp-nav-flyout"));
        Thread.sleep(3000);
        action.moveToElement(languagelement).perform();

    }

    @Test
    public void test15_action() throws InterruptedException{
       // 1.Go	to	http://practice.cybertekschool.com/hovers
      Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        // 2.Hover	over	to	first	image
        WebElement firstChoose=Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        Actions firstUser=new Actions(Driver.getDriver());
        // 3.Assert:	a.“name:	user1”	is	displayed
         firstUser.moveToElement(firstChoose).perform();
       //  WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name']"));
     //   Assert.assertTrue(user1.isDisplayed());
         Thread.sleep(2000);
        // 4.Hover	over	to	second	image
        WebElement secondChose=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        Actions secondUser=new Actions(Driver.getDriver());
        secondUser.moveToElement(secondChose).perform();
        Thread.sleep(2000);
        // 5.Assert:	a.“name:	user2”	is	displayed
        // 6.Hover	over	to	third	image
        WebElement thirdChose=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
        Actions thirdUser=new Actions(Driver.getDriver());
        thirdUser.moveToElement(thirdChose).perform();
        // 7.Confirm:	a.“name:	user3”	is	dis
    }

    @Test
    public void test16_DoubleClick(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
     WebElement iframe=Driver.getDriver().findElement(By.xpath("//body//iframe"));
     Driver.getDriver().switchTo().frame(iframe);
                                      // ("iframeResult") yazabiliriz
     WebElement text=Driver.getDriver().findElement(By.id("demo"));
     Actions action=new Actions(Driver.getDriver());
     action.moveToElement(text).doubleClick().perform();

     WebElement colorRed=Driver.getDriver().findElement(By.id("demo"));
     String actual=colorRed.getAttribute("style");
     String expected="color: red;";

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test17_DragandDrop(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    WebElement source=Driver.getDriver().findElement(By.id("draggable"));
    WebElement target=Driver.getDriver().findElement(By.id("droptarget"));

    Actions action=new Actions(Driver.getDriver());

    action.dragAndDrop(source,target).release().perform();

    String actual=target.getText();
    String expected="You did great!";

    Assert.assertEquals(actual,expected);
 // action.clickAndHold(source).moveToElement(target).release().perform();
    }
    @Test
    public void test18_Context() throws InterruptedException{
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
      WebElement box=Driver.getDriver().findElement(By.id("hot-spot"));
      Actions action=new Actions(Driver.getDriver());
      action.moveToElement(box).contextClick().perform();

        Alert alert=Driver.getDriver().switchTo().alert();
        String message=alert.getText();
        System.out.println(message);
         alert.accept();
       Thread.sleep(3000);



    }


}
