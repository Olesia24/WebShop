package com.ait.qa34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    //before - setUp (precondition)
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); without history
        driver.navigate().to("https://www.google.com");//with history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    //test - name of test
    @Test
    public void openGoogleTest(){
        System.out.println("Google is opened!");
    }
    //after - tearDown (aftercondition)
    @AfterMethod(enabled = false)//enable - disable method
    public void tearDown(){
        driver.quit(); // close browser(all tabs)
        //driver.close(); // close only one tab(if only one -> close browser) закрывает только последнюю вкладку
    }

}
