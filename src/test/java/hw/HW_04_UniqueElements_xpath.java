package hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_04_UniqueElements_xpath {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void findElementByXpath(){
        driver.findElement(By.xpath("//*[@name='description']"));
        driver.findElement(By.xpath("//*[@name='keywords']"));
        driver.findElement(By.xpath("//*[@name='generator']"));
        driver.findElement(By.xpath("//*[@name='viewport']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//*[@class='header']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='header-links-wrapper']"));
        driver.findElement(By.xpath("//*[@class='header-links']"));
        driver.findElement(By.xpath("//*[@id='topcartlink']"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/register')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/cart')]"));
        driver.findElement(By.xpath("//*[@class='cart-qty']"));
        driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        driver.findElement(By.xpath("//*[@class='mini-shopping-cart']"));
        driver.findElement(By.xpath("//*[@class='count']"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//*[@class='header-selectors-wrapper']"));
        driver.findElement(By.xpath("//*[@class='tax-display-type-selector']"));
        driver.findElement(By.xpath("//*[@class='currency-selector']"));
        driver.findElement(By.xpath("//*[@class='language-selector']"));
        driver.findElement(By.xpath("//*[@class='header-menu']"));
        driver.findElement(By.xpath("//*[@class='top-menu']"));
        driver.findElement(By.xpath("//*[@id='mob-menu-button']"));
        driver.findElement(By.xpath("//*[@class='icon']"));
        driver.findElement(By.xpath("//*[@class='mob-top-menu']"));
        driver.findElement(By.xpath("//*[@class='mob-top-menu']"));
        driver.findElement(By.xpath("//*[@class='ajax-loading-block-window']"));
        driver.findElement(By.xpath("//*[@class='loading-image']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-main']"));
        driver.findElement(By.xpath("//*[@class='leftside-3']"));
        driver.findElement(By.xpath("//*[contains(@class,'block-category-navigation')]"));
        driver.findElement(By.xpath("//*[contains(@class,'block-manufacturer-navigation')]"));
        driver.findElement(By.xpath("//*[contains(@class, 'block-popular-tags')]"));
        driver.findElement(By.xpath("//*[@class='rightside-3']"));
        driver.findElement(By.xpath("//*[contains(@class,'block-newsletter')]"));
        driver.findElement(By.xpath("//*[contains(@class,'block-poll')]"));
        driver.findElement(By.xpath("//*[@class='center-3']"));
        driver.findElement(By.xpath("//*[contains(@class,'home-page')]"));
        driver.findElement(By.xpath("//*[@class='page-body']"));
        driver.findElement(By.xpath("//*[contains(@class,'slider-wrapper')]"));
        driver.findElement(By.xpath("//*[@id='nivo-slider']"));
        driver.findElement(By.xpath("//*[@class='nivoSlider']"));
        driver.findElement(By.xpath("//*[@class='nivo-main-image']"));
        driver.findElement(By.xpath("//*[@class='nivo-caption']"));
        driver.findElement(By.xpath("//*[@class='nivo-directionNav']"));
        driver.findElement(By.xpath("//*[@class='footer']"));
        driver.findElement(By.xpath("//*[@class='footer-menu-wrapper']"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/sitemap')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/shipping-returns')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/privacy-policy')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/conditions-of-use')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/about-us')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/contactus')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/search')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/blog')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/recentlyviewedproducts')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/compareproducts')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/newproducts')]"));
        driver.findElement(By.xpath("//*[contains(@class,'my-account')]"));
        driver.findElement(By.xpath("//*[@class='account']"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/customer/info')]"));
        driver.findElement(By.xpath("//*[contains(@class, 'follow-us')]"));
        driver.findElement(By.xpath("//*[@class='facebook']"));
        driver.findElement(By.xpath("//*[@class='twitter']"));
        driver.findElement(By.xpath("//*[@class='rss']"));
        driver.findElement(By.xpath("//*[@class='youtube']"));
        driver.findElement(By.xpath("//*[@class='google-plus']"));
        driver.findElement(By.xpath("//*[@class='footer-poweredby']"));
        driver.findElement(By.xpath("//*[@class='footer-disclaimer']"));
        driver.findElement(By.xpath("//*[@class='footer-store-theme']"));
        driver.findElement(By.xpath("//*[contains(@class, 'ui-autocomplete')]"));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
