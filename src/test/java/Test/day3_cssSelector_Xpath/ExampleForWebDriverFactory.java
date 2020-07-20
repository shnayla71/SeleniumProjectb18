package Test.day3_cssSelector_Xpath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class ExampleForWebDriverFactory {
    public static void main(String[] args){
       WebDriver driver= WebDriverFactory.getDriver("chrome");
       driver.get("https://ww.google.com");
    }
}
