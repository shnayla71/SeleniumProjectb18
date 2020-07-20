package Test.day5_TestNGintro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstTestNG {

    @BeforeMethod
    public void setUp(){
        System.out.println("before method running....");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("after method running");
    }
   @Test
    public void test1(){
       System.out.println("test1 is running....");
    }
    @Test
   public void test2(){
       System.out.println("test2 is running");
   }


}
