package Test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {
    @Test
    public void readingProperties() throws IOException{
        Properties properties=new Properties();
        //configuration.properties okumamizi saglar
        //we need to show where file is stored so need the path of the file
        String path="configuration.properties";

        FileInputStream file=new FileInputStream(path);

        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));

    }
    @Test
    public void using_ConfigurationUtility(){
        String browser= ConfigurationReader.getProperty("browser");
        System.out.println("browser: "+browser);
    }
}
