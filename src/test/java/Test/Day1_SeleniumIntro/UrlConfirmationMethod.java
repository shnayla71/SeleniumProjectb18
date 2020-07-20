package Test.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlConfirmationMethod {
    public static void main(String[] args) {
        System.out.println(verifyUrl("https://www.apple.com/","https://www.apple.com/"));
    }

    public static String verifyUrl(String expectedUrl,String Url){
        String result="";
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(Url);
        if(driver.getCurrentUrl().equals(expectedUrl)){
            result="Url is verified";
        }else{
            result="Wrong verify";
        }
        return result;
    }
}
