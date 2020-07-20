package Test.Day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleConfirmationMethod {

   public static String confirmTitle(String ExpectedTitle,String Url){
       String result="";
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get(Url);

       if(driver.getTitle().equals(ExpectedTitle)){
           result="Title is verified";
       }else{
           result="Title is wrong";
       }
       return result;
   }

    public static void main(String[] args) {
        System.out.println(confirmTitle("Apple","https://www.apple.com/"));
    }
}
