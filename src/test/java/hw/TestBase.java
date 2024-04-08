package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Random;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isCustomerPresent() {
        return isElementPresent(By.cssSelector("[href='/customer/info']"));
    }

    public void clickOnRegistrationButton() {
        click(By.id("register-button"));
    }

    public void fillNameAndLastname() {
        type(By.id("FirstName"), "Oly");
        type(By.id("LastName"), "Mayer");
    }

    public void fillLoginAndPassword(String email, String password) {
        type(By.id("Email"), email);
        type(By.id("Password"), password);
    }
    public void confirmPassword(String password){
        type(By.id("ConfirmPassword"), password);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnButtonUpdateShoppingCard() {
        click(By.id("checkout"));
    }

    public void clickOnCheckBox() {
        click(By.id("termsofservice"));
    }

    public void clickOnButtonShopingCart() {
        click(By.cssSelector("[href^='/cart'] .cart-label"));
    }

    public void clickOnButtonAddToCart() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }

    public void clickOnLogInButton() {
        click(By.xpath("//div[@class='buttons']/input[@class='button-1 login-button']"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void createNewCustomer() {
        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        type(By.id("Email"), "olesia" + i + "@yahoo.com");
        type(By.id("Password"), "Olesia$2024");
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int sizeOfItems() {
        if(isElementPresent(By.name("removefromcart"))){
            return driver.findElements(By.cssSelector("[name='removefromcart']")).size();
        }
        return 0;
    }
}
