package hw;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCart extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginAndPassword("olesia123@yahoo.com", "Olesia$2024");
        clickOnLogInButton();
    }
    @Test
    public void addItemToCart(){
        clickOnButtonAddToCart();
        clickOnButtonShopingCart();
        isCustomerPresent();
    }
}
