package com.demowebshop.tests;

import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import com.demowebshop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void createNewAccount() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(UserData.NAME)
                .setLastName(UserData.SURNAME)
                .setEmail(UserData.CREATE_EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.PASSWORD));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());
    }

    @Test(dataProvider = "createNewUsersFromCsvFile", dataProviderClass = DataProviders.class)
    public void testAddUsersFromCsvFile(User newUser) {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(newUser);
        app.getUser().clickOnRegistrationButton();
    }
}
