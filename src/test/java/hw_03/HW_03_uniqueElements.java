package hw_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_03_uniqueElements {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void uniqueElement(){
        driver.findElement(By.cssSelector("[name='description']"));
        driver.findElement(By.cssSelector("[name='keywords']"));
        driver.findElement(By.cssSelector("[name='generator']"));
        driver.findElement(By.cssSelector("[name='viewport']"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".header-links-wrapper"));
        driver.findElement(By.cssSelector(".header-links"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector("[href^='/register']"));
        driver.findElement(By.cssSelector("[href^='/cart']"));
        driver.findElement(By.cssSelector(".cart-qty"));
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector(".mini-shopping-cart"));
        driver.findElement(By.cssSelector(".count"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector(".header-selectors-wrapper"));
        driver.findElement(By.cssSelector(".tax-display-type-selector"));
        driver.findElement(By.cssSelector(".currency-selector"));
        driver.findElement(By.cssSelector(".language-selector"));
        driver.findElement(By.cssSelector(".header-menu"));
        driver.findElement(By.cssSelector(".top-menu"));
        driver.findElement(By.cssSelector("#mob-menu-button"));
        driver.findElement(By.cssSelector(".icon"));
        driver.findElement(By.cssSelector(".mob-top-menu"));
        driver.findElement(By.cssSelector(".mob-top-menu"));
        driver.findElement(By.cssSelector(".ajax-loading-block-window"));
        driver.findElement(By.cssSelector(".loading-image"));
        driver.findElement(By.cssSelector(".master-wrapper-main"));
        driver.findElement(By.cssSelector(".leftside-3"));
        driver.findElement(By.cssSelector(".block-category-navigation"));
        driver.findElement(By.cssSelector(".block-manufacturer-navigation"));
        driver.findElement(By.cssSelector(".block-popular-tags"));
        driver.findElement(By.cssSelector(".rightside-3"));
        driver.findElement(By.cssSelector(".block-newsletter"));
        driver.findElement(By.cssSelector(".block-poll"));
        driver.findElement(By.cssSelector(".center-3"));
        driver.findElement(By.cssSelector(".home-page"));
        driver.findElement(By.cssSelector(".page-body"));
        driver.findElement(By.cssSelector(".slider-wrapper"));
        driver.findElement(By.cssSelector("#nivo-slider"));
        driver.findElement(By.cssSelector(".nivoSlider"));
        driver.findElement(By.cssSelector(".nivo-main-image"));
        driver.findElement(By.cssSelector(".nivo-caption"));
        driver.findElement(By.cssSelector(".nivo-directionNav"));
        driver.findElement(By.cssSelector(".footer"));
        driver.findElement(By.cssSelector(".footer-menu-wrapper"));
        driver.findElement(By.cssSelector("[href^='/sitemap']"));
        driver.findElement(By.cssSelector("[href^='/shipping-returns']"));
        driver.findElement(By.cssSelector("[href^='/privacy-policy']"));
        driver.findElement(By.cssSelector("[href^='/conditions-of-use']"));
        driver.findElement(By.cssSelector("[href^='/about-us']"));
        driver.findElement(By.cssSelector("[href^='/contactus']"));
        driver.findElement(By.cssSelector("[href^='/search']"));
        driver.findElement(By.cssSelector("[href^='/blog']"));
        driver.findElement(By.cssSelector("[href^='/recentlyviewedproducts']"));
        driver.findElement(By.cssSelector("[href^='/compareproducts']"));
        driver.findElement(By.cssSelector("[href^='/newproducts']"));
        driver.findElement(By.cssSelector(".my-account"));
        driver.findElement(By.cssSelector(".account"));
        driver.findElement(By.cssSelector("[href^='/customer/info']"));
        driver.findElement(By.cssSelector(".follow-us"));
        driver.findElement(By.cssSelector(".facebook"));
        driver.findElement(By.cssSelector(".twitter"));
        driver.findElement(By.cssSelector(".rss"));
        driver.findElement(By.cssSelector(".youtube"));
        driver.findElement(By.cssSelector(".google-plus"));
        driver.findElement(By.cssSelector(".footer-poweredby"));
        driver.findElement(By.cssSelector(".footer-disclaimer"));
        driver.findElement(By.cssSelector(".footer-store-theme"));
        driver.findElement(By.cssSelector(".ui-autocomplete"));

    }
    @AfterMethod
    public void tearDown(){ driver.quit();}

}
