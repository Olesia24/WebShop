package hw;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void createNewAccountPositiveTest(){
        //click on login link
        click(By.cssSelector("[href='/register']"));

        //enter first name
        type(By.id("FirstName"), "Oly");

        //enter last name
        type(By.id("LastName"), "Mayer");

        //enter email
        type(By.id("Email"), "olesia123@yahoo.com");

        //enter password
        type(By.id("Password"), "Olesia$2024");

        //enter confirm password
        type(By.id("ConfirmPassword"), "Olesia$2024");

        //click on register button
        click(By.id("register-button"));

        //assert Sign out button is permanent
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
    }
}
