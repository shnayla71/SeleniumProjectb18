package Test.day7_TableLocator;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // TC #1: Smartbear software link verification
        //1.Open browser
        //2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx  ");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SmartBearUtilities.login(driver);
      /*  WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys("test");
        // 5.Click to Login button
        WebElement login=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();*/
    }

    @Test
    public void p1_smartbearLogin() {
        // 3.Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys("test");
        // 5.Click to Login button
        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();
        // 6.Print out count of all the links on landing page
        List<WebElement> listOfLink = driver.findElements(By.xpath("//body//a"));
        System.out.println("number of links= " + listOfLink.size());
        int expectedNum = 6;
        int actualNum = listOfLink.size();

        Assert.assertEquals(actualNum, expectedNum);
        // 7.Print out each link text on this pag
        for (WebElement link : listOfLink) {
            System.out.println(link.getText());
        }
    }

    @Test
    public void p2_smartbearOrder() throws InterruptedException{
        // 6.Click on Order
        WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();
        // 7.Select familyAlbum from product, set quantity to 2
        Select familyAlbum = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        familyAlbum.selectByVisibleText("FamilyAlbum");

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();//just delete if there is any existing input in box
        quantity.sendKeys("2");
        // 8.Click to “Calculate” button
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        // 9.Fill address Info with JavaFaker
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        // •Generate: name, street, city, state, zip code
        Faker faker = new Faker();
        customerName.sendKeys(faker.name().fullName());
        street.sendKeys(faker.address().streetName());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        String zipcode = faker.address().zipCode().replaceAll("-", "");
        zipCode.sendKeys(zipcode);
        // 10.Click on “visa” radio button
        WebElement visa = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visa.click();
        Thread.sleep(1000);
        // 11.Generate card number using JavaFaker
        WebElement cardNum = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
        cardNum.sendKeys(faker.number().digits(16));

        WebElement date = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        date.sendKeys("12/25");
        // 12.Click on “Process”
        WebElement processButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]"));
        processButton.click();
        // 13.Verify success message “New order has been successfully added
       WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"));
       String actual=successMessage.getText();
        System.out.println(actual);
       String expected="New order has been successfully added.";
       Assert.assertEquals(expected,actual);

    }

    @Test
    public void test_Table(){
      //  TC#3: Smartbear software order verification
        //1.Open browser and login to Smartbear software
       //2.Click on View all orders
        //zaten bu sayfa acildigi icin gectik

       //3. Verify Susan McLaren has order on date “01/05/2010”
       WebElement date=driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
            Assert.assertTrue(date.isDisplayed());
   // WebElement data=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[5]"));
    //Assert.assertTrue(data.isDisplayed());
    }

    @Test
    public void p4_verifyOrder(){
       SmartBearUtilities.verifyOrder("Bob Feather",driver);
    }

    @Test
    public void p5_printNamesandCity(){
        SmartBearUtilities.printNameAndCity(driver);
    }




}