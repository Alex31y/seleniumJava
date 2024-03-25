package com.sdet.auto.youtubbo;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RejectCookiesTest {
    private WebDriver driver;
    private PageAction pageAction;
    private PageObject pageObject;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/"); // Update URL accordingly
        pageAction = new PageAction(driver);
    }

    @Test
    public void testRejectCookies() throws InterruptedException {
        pageAction.rejectCookies();
        // Add assertions or verifications if needed
        Thread.sleep(10000);
    }

    @Test
    public void testSearchVideoDelGabibbo() throws InterruptedException {
        pageAction.rejectCookies();
        Thread.sleep(1000);
        String keyword = "video del gabibbo";
        pageAction.searchForKeyword(keyword);
        pageAction.clickSearchButton();
        Thread.sleep(5000);

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}