package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize(); //max size browser to window
        //wait for all elements on the size to load before starting the test
    }
    @Test
    public void findElementByTagName(){
        //find element by tag name
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        WebElement a1 = driver.findElement(By.tagName("a"));
        System.out.println(a1.getText());

        //find list of elements by tag name
        List<WebElement> a = driver.findElements(By.tagName("a"));
        System.out.println(a.size());
    }
    @Test
    public void findElementByLocators(){
        //id
        driver.findElement(By.id("city"));
        //class name
        driver.findElement(By.className("input-container"));
        //name.By.name("user")
        //link text (old school)
        driver.findElement(By.linkText("Let the car work"));
        //partial link (old school)
        driver.findElement(By.partialLinkText("work"));
    }
    //css selector
    @Test
    public void findElementByCssSelector(){
        //tag name = tag name
        //id -> #id
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));
        //class name -> .className
        //driver.findElement(By.className("input-container"));
        driver.findElement(By.cssSelector(".input-container"));
        //[name='user']
        driver.findElement(By.cssSelector("[for='city']"));
        driver.findElement(By.cssSelector("[href='/search']"));
        //contains -> *
        //[href*='car']
        driver.findElement(By.cssSelector("[href*='car']"));
        //start -> ^
        driver.findElement(By.cssSelector("[href^='/let']"));
        //end on -> $
        driver.findElement(By.cssSelector("[href$='work']"));
    }
    //xPath//*[@attr0='value']
    @Test
    public void elementByXpath(){
        driver.findElement(By.xpath("//h1"));
        //id -> //tag[
        driver.findElement(By.xpath("//*[@id='city']"));
        //class name -> //tag[@class='className']
        driver.findElement(By.xpath("//*[@class='input-container']"));
        //contains -> //*[contains(@attr,'...']
        driver.findElement(By.xpath("//*[contains(.,'car')]"));
        //start -> //*[starts-with(@attr,'...')]
        driver.findElement(By.xpath("//*[starts-with(@href,'/let')]"));
        //text
        driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));//точное совпадение
        driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));//точное совпадение
        driver.findElement(By.xpath("//span[contains(text(),'mistake')]"));
        driver.findElement(By.xpath("//span[contains(.,'mistake')]"));//частичное совпадение
        // //input[@id='username']
        // //div/a - child
        // //div//a - any level child - css = div a

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
