package Test.day7_TableLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tasksolution_MonthDate {
    WebDriver driver;
   // DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMMM");
  //  LocalDate currentMonth=LocalDate.now();

    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void month(){
        Select month1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));

        String actual=month1.getFirstSelectedOption().getText();
        String expected="June";// currentMonth.format(dtf);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void allMonths(){
        List<String> expectedMonths=new ArrayList<String>();
        expectedMonths.addAll(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));

        List<WebElement> listMonth=driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        List<String> allMonth=new ArrayList<>();
        for(WebElement each:listMonth){
            allMonth.add(each.getText());
        }
        Assert.assertEquals(expectedMonths,allMonth);
    }
}
