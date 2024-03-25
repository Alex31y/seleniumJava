package com.sdet.auto.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.auto.google.PageAction;

public class RejectCookiesTest {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testRejectCookies() throws InterruptedException {
        pageAction.clickRejectButton();
        Thread.sleep(3000);
    }

    @Test
    public void testGoogleSearchForGabibbo() throws InterruptedException {
        pageAction.clickRejectButton();

        pageAction.inputQuery2("gabibbo");
        Thread.sleep(100000);

        pageAction.clickSearchButton1(); // Or you can use clickSearchButton2() depending on your preference


    }

    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}