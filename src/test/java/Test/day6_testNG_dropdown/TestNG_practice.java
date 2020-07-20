package Test.day6_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_practice {
    @BeforeClass
    public void before_class(){
        System.out.println("before class running");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("before method running");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("after method running");
    }
    @Test
    public void test1(){
        System.out.println("Test1 running");

        String actualTitle="homepage";//driver.getTitle();
        String expectedTitle="homepage";

        Assert.assertEquals(actualTitle,expectedTitle);

      /*  if(actualTitle.equals(expectedTitle)){
            System.out.println("title passed");
        }else{
            System.out.println("title failed");
        }*/
    }
    @Ignore // testi atliyor
    @Test
    public void test2(){
        System.out.println("Test2 running");
        Assert.assertEquals("string1","string2","String verification is failed");
    }
    @Test
    public void test3(){
        System.out.println("test3 running");

        String actualTitle="Amazon prime";
        String expectedTitle="prime";

      //  Assert.assertTrue(actualTitle.contains(expectedTitle));
        Assert.assertFalse(actualTitle.contains(expectedTitle));// ici yanlis olursa test geciyor
                                // ici true olursa test fail oluyor
    }
    @AfterClass
    public void after_class(){
        System.out.println("after class running");
    }
}
