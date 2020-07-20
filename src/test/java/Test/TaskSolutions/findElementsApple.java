package Test.TaskSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

/*
1.Open Chrome browser2.Go to https://www.apple.com
3.Click to all of the headers one by one
a.Mac, iPad, iPhone, Watch, TV, Music, Support
4.Printout how many links on each pagewiththe titles of the pages
5.Loop through all
6.Print out how many link is missing textTOTAL
7.Print out how many link has textTOTAL
8.Print out how many total linkTOTA
 */
public class findElementsApple {
    public static void main(String[] args) throws Exception {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();

        int countEmptyLink = 0;
        int countTextLink = 0;
        Thread.sleep(1000);
        List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));

        for (int i = 1; i < 8; i++) {
            allLinks.get(i).click();

            Thread.sleep(1000);
            List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Number of links on page: " + driver.getTitle() + " " + listOfLinks.size());

            for (WebElement links : listOfLinks) {
                String textOfLink = links.getText();
                if (!textOfLink.isEmpty()) {
                    countEmptyLink++;
                } else {
                    countTextLink++;
                }
            }
            driver.navigate().back();
            allLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));
        }
        System.out.println("Number of EmptyLinks: \t" + countEmptyLink);
        System.out.println("Number of Links with text: \t" + countTextLink);
    }

}


