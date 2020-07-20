package Test.day7_TableLocator;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class Tasksolution6 {
    @Test
    public void register() {
        //    1.Open browser
        Faker faker=new Faker();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //  2.Go to website: http://practice.cybertekschool.com/registration_form
        driver.get("http://practice.cybertekschool.com/registration_form");
        // 3.Enter first name
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());


        // 4.Enter last name
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName().replace("'",""));
        // 5.Enter username
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys(faker.name().username().replace(".",""));
        // 6.Enter email address
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.name().firstName().toLowerCase()+"@gmail.com");
        // 7.Enter password
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.number().digits(8));
        // 8.Enter phone number
      driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.number().digits(3)+"-"+faker.number().digits(3)+"-"+faker.number().digits(4));
        // 9.Select a gender from radio buttons
       driver.findElement(By.xpath("//input[@value='female']")).click();
        // 10.Enter date of birth
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys(faker.number().numberBetween(1,12)+"/"+faker.number().numberBetween(1,30)+"/"+faker.number().numberBetween(1900,2020));
        // 11.Select Department/Office
        Select depart=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        depart.selectByIndex(2);
        // 12.Select Job Title
        Select job=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        job.selectByIndex(5);
        // 13.Select programming language from checkboxes
        driver.findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();
        // 14.Clickto sign up button
        driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();
        // 15.Verify success message “You’ve successfully completed registration.”is displayed.
        WebElement message =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));
        String actual=message.getText();
        System.out.println(actual);
        String expected="You've successfully completed registration!";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void month(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select key=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        key.selectByIndex(5);

        String actual=key.getFirstSelectedOption().getText();
        String expected="June";

        if(actual.equals(expected)){
            System.out.println("June selected");
        }else{
            System.out.println("wrong month");
        }
    }
}