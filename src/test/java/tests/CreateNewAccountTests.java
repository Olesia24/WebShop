package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import models.NewUserAccount;
import java.util.Random;

public class CreateNewAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }
    @Test
    public void createNewAccount(){
        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        app.getUser().clickOnRegisterLink();
        app.getUser().fillNameAndLastname();
        app.getUser().createLoginAndPasswordNewCustomer(new NewUserAccount()
                .setEmail("olesia" + i + "@yahoo.com")
                .setPassword("Olesia$2024")
                .setConfirmPassword("Olesia$2024"));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());

    }

}
