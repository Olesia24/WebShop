package hw;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteItemFromCart extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginAndPassword("olesia123@yahoo.com", "Olesia$2024" );
        clickOnLogInButton();
        clickOnButtonAddToCart();
        clickOnButtonShopingCart();
    }
    @Test
    public void deletePositiveTests(){
        int sizeBefore = sizeOfItems();
        click(By.name("removefromcart"));
        click(By.cssSelector(".button-2.update-cart-button"));

        pause(100);
        int sizeAfter = sizeOfItems();
        Assert.assertEquals(sizeAfter, sizeBefore-1);
    }

}
