package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import models.User;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();

        app.getUser().fillLoginAndPassword(new User()
                .setEmail("olesia123@yahoo.com")
                .setPassword("Olesia$2024"));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());
    }
    @Test
    public void loginNegativeTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginAndPassword(new User().setPassword("Olesia$2024"));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());

    }
}
