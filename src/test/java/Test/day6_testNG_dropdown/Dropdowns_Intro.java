package Test.day6_testNG_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Dropdowns_Intro {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

  /*  @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }*/

    @Test
    public void default_verification() {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actualDefaultOfsimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedText = "Please select an option";

        Assert.assertEquals(actualDefaultOfsimpleDropdown, expectedText);

        Select StateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualState = StateSelection.getFirstSelectedOption().getText();
        String expectedState = "Select a State";

        Assert.assertEquals(actualState, expectedState);

    }

    @Test
    public void test2_stateVerification() throws InterruptedException {
      Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));

      Thread.sleep(1000);
      stateDropdown.selectByValue("IL");

      Thread.sleep(1000);
      stateDropdown.selectByVisibleText("Virginia");

      Thread.sleep(1000);
      stateDropdown.selectByIndex(5);// california

       String expectedOption="California";
       String actualOption=stateDropdown.getFirstSelectedOption().getText();

     //  Assert.assertEquals(expectedOption,actualOption);
       Assert.assertTrue(actualOption.equals(expectedOption));
    }

    @Test
   public void test3_selectVerify() throws InterruptedException{
    //    Open Chrome browser
   // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select “December 1st, 1921” and verify it is selected.
        Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1921");
        Thread.sleep(2000);

        Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");
        Thread.sleep(2000);

        Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);
        // Select year using: visible text

        // Select month using : value attribute
        // Select day using: index number
      /*  String expected="December 1st,1921";
        String actual=month.getFirstSelectedOption().getText()+" "+
                      day.getFirstSelectedOption().getText()+","+
                      year.getFirstSelectedOption().getText();
        Assert.assertEquals(expected,actual);*/
    }

   @Test
    public void test4_selectAllOptoins() throws InterruptedException{
       Select options=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

       for(int i=0;i<6;i++){
           options.selectByIndex(i);
       }
       for(int i=0;i<options.getAllSelectedOptions().size();i++){
           System.out.println(options.getAllSelectedOptions().get(i).getText());
       }
      options.deselectAll();
    }
   @Test
    public void test5_selectFacebook()throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"dropdownMenuLink\"]")).click();
      //  WebElement dropFace=driver.findElement(By.xpath("//div[@class='dropdown-menu show']")));
      // dropFace.click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[4]")).click();

       String expected="Facebook - Giriş Yap veya Kaydol";
       String actual=driver.getTitle();

       Assert.assertEquals(expected,actual);
       System.out.println("passed");
 




   }

}
