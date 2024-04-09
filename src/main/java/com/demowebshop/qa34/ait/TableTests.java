package java.com.demowebshop.qa34.ait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void tableCssTest(){
        //get row 8, last element
        WebElement canada = driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        System.out.println(canada.getText());
        System.out.println("*********************");
        //get row 4
        WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));
        System.out.println(row4.getText());
        System.out.println("********************");
        //get numbers of row
        List<WebElement>rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement element:rows){
            System.out.println(element.getText());
        }
        System.out.println("*********************");
        for (int i =0; i<rows.size(); i++){
            System.out.println(rows.get(i).getText());
        }
        driver.findElement(By.cssSelector("h1:contains('send a message')"));
        driver.findElements(By.xpath("//h1[contains(text(), 'send a message')]"));

        driver.findElement(By.cssSelector("input[name='email']"));
        driver.findElement(By.xpath("//input[@name='email']"));
        driver.findElement(By.cssSelector("input[name='order-reference']"));
        driver.findElement(By.xpath("//input[@name='order-reference']"));
        driver.findElement(By.cssSelector("textarea[name='message']"));
        driver.findElement(By.xpath("//textarea[@name='message']"));
        driver.findElement(By.cssSelector("button[name='send-button']"));
        driver.findElement(By.xpath("//button[@name='send-button']"));
    }

    public static class UniqueElements_cssSelector {
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

    public static class UniqueElements_xpath {
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

    public static class FindElementByTagName {
        WebDriver driver;
        @BeforeMethod
        public void setUp(){
            driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().window().maximize();
        }
        @Test
        public void findThreeElementsByTagName(){
            List<WebElement> form = driver.findElements(By.tagName("form"));
            System.out.println(form.size());

            WebElement form1 = driver.findElement(By.tagName("form"));
            System.out.println("Name:" + form1.getText());

            List<WebElement> div = driver.findElements(By.tagName("div"));
            System.out.println(div.size());

            List<WebElement> input = driver.findElements(By.tagName("input"));
            System.out.println(input.size());

            List<WebElement> span = driver.findElements(By.tagName("span"));
            System.out.println(span.size());

            List<WebElement> elements = driver.findElements(By.tagName("li"));
            System.out.println(elements.size());

        }
        @AfterMethod
        public void tearDown(){
            driver.quit();
        }
    }
}
