package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import models.User;

import static org.testng.Assert.assertTrue;

public class AddItemToCartTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginAndPassword(new User()
                .setEmail("olesia123@yahoo.com")
                .setPassword("Olesia$2024"));
        app.getUser().clickOnLogInButton();
    }
    @Test
    public void addItemToCart(){
        app.getItem().clickOnButtonAddToCart();
        app.getItem().clickOnButtonShopingCart();
        Assert.assertTrue(app.getItem().isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
    }
    @AfterMethod
    public void postCondition(){
        app.getItem().removeItem();
    }
}
