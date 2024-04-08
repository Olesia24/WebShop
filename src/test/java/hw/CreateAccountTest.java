package hw;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void createNewAccountPositiveTest(String password){
        clickOnRegisterLink();
        fillNameAndLastname();
        createNewCustomer();
        confirmPassword(password);
        clickOnRegistrationButton();
        Assert.assertTrue(isCustomerPresent());
    }

}
