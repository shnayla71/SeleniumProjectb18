package Test.day7_TableLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

    public static void login(WebDriver driver) {
        //3.Username "Tester"
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys("test");
        // 5.Click to Login button
        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();
    }

    public static void verifyOrder(String name, WebDriver driver) {
        // PRACTICE #4: Method: verifyOrder
        // •Create a method named verifyOrderin SmartBearUtils class.
        // •Methodtakes WebDriver object and String(name).
        List<WebElement> allNames = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        int listsize = allNames.size();                                                              //tr/td[2]

        String allNamesList = "";

        for (int i = 0; i < listsize; i++) {
            allNamesList += allNames.get(i).getText() + " ";
        }
        System.out.println(allNamesList);
        //  •Methodshould verify if given name exists in orders.
        if (allNamesList.contains(name)) {
            System.out.println("Name: " + name + " is verified");
        } else {
            System.out.println("Name: " + name + " is not verified");
        }
        // •This method should simply accepts a name(String), and assert whether given name is in the list or not.
        //  •Create a new TestNG test to test if the method is working as expected.

    }

    // #5: Method: printNamesAndCities
    // •Create a method named printNamesAndCitiesin SmartBearUtils class.
    public static void printNameAndCity(WebDriver driver) {
        // •Method takes WebDriver object.
        // •This method should simply print all the names in the List of All Orders.
        List<WebElement> allNames = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        List<WebElement> allcity = driver.findElements(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));
        // •Create a new TestNG test to test if the method is working as expected.
        int lisize = allNames.size();
        for (int i = 0; i < lisize; i++) {
            System.out.println("Name: " + (i + 1) + ": " + allNames.get(i).getText() + " , City " + (i + 1) + ": " + allcity.get(i).getText());
        }
        // •Output should be like:
        // •Name1: name , City1: city
        // •Name2: name , City2: city
    }

   public static void deleteName(WebDriver driver,String nameTobeDelete){

        String xpathforCheckboxes="//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='"+nameTobeDelete+"']/../td[1]";

        WebElement dynamicCheckbox=driver.findElement(By.xpath(xpathforCheckboxes));
        dynamicCheckbox.click();

        WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();

        List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement name:allNames){
            System.out.println(name.getText());
            Assert.assertFalse(name.getText().equals(nameTobeDelete));
        }

   }
}
