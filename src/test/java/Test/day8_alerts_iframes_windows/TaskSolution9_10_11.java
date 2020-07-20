package Test.day8_alerts_iframes_windows;

import Test.day7_TableLocator.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TaskSolution9_10_11 {
 /*   TC #9: SmartBear delete order
    1.Open browser and login to SmartBear
    2.Delete “Mark Smith” from the list
    3.Assert it is deleted from the list*/
   WebDriver driver;
   @BeforeMethod
   public void setUp(){
       driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx  ");

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       SmartBearUtilities.login(driver);
   }
    @Test
    public void P9_deleteName(){
      //  2.Delete “Mark Smith” from the list
        WebElement name=(driver.findElement(By.xpath("//table[@class='SampleTable']//tr[3]/td[1]")));
         name.click();
         WebElement deletebtn=driver.findElement(By.xpath("//input[@value='Delete Selected']"));
         deletebtn.click();                               //*[@id="ctl00_MainContent_btnDelete"]
     //   name.clear();// *[@id="ctl00_MainContent_orderGrid"]/tbody/tr[3]/td[2]
        List<WebElement> allnames=driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[2]"));
           for(WebElement eachName:allnames){
              Assert.assertFalse(eachName.getText().contains("Mark Smith"));
           }
    }

    @Test
    public void P10_editOrder(){

    /* TC #10: SmartBear edit order
    1.Open browser and login to SmartBear
        2.Click to edit button from the right for “Steve Johns”
        3.Change name to “Michael Jordan”
        4.Click Update
        5.Assert “Michael Jordan” is in the list*/
    WebElement name= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[4]/td[13]"));
    name.click();
    WebElement namebox=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
    namebox.clear();
    namebox.sendKeys("Michael Jordan");
    WebElement update=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]"));
    update.click();

    String expected="Michael Jordan";
    String actual=driver.findElement(By.xpath("//table[@class='SampleTable']//tr[4]/td[2]")).getText();

        Assert.assertEquals(expected,actual);
   }

      /*  TC #11: Create a method called removeName()
    1.Accepts two parameters: WebDriver, String name
        2.Method will remove the given name from the list of Smartbear
    3.Create a new TestNG test, and call your method.
    4.Assert that your method removed the given name*/
      @Test
    public void task11_DeleteName2(){
        SmartBearUtilities.deleteName(driver,"Bob Feather");
      }
}

