package Test.day7_TableLocator;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class faker {

    @Test
    public void Fakertest(){
        Faker faker = new Faker();
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        System.out.println("name= "+name);

        String firstName = faker.name().firstName(); // Emory
        System.out.println("firstname= "+firstName);

        String lastName = faker.name().lastName(); // Barton
        System.out.println("lastname= "+lastName);

        String streetAddress = faker.address().streetAddress();
        System.out.println("StreetAdress= "+streetAddress);

        String HEY=faker.bothify("GIT").intern();
        System.out.println("HEY "+HEY);
    }
}
