package Test.day12_scynchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading7pages;
import utilities.Driver;

public class ExplicitWaitPractice {
  /*
   TC#40: Dynamically Loaded Page Elements 7
   1.Go tohttp://practice.cybertekschool.com/dynamic_loading/7
   2.Wait until title is “Dynamic Title”
   3.Assert : Message “Done” is displayed.
   4.Assert : Image is displayed
   */
  @Test
    public void dynamic_titleTest(){
      Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
      Loading7pages loading7pages=new Loading7pages();

      WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    String ExpectedTitle="Dynamic title";
      //object for expected condition
     wait.until(ExpectedConditions.titleIs(ExpectedTitle));


    Assert.assertTrue(loading7pages.doneMessage.isDisplayed());

    Assert.assertTrue(loading7pages.sponeBobImage.isDisplayed());





  }
}
