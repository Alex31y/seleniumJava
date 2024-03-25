package com.sdet.auto.booking2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RejectCookiesTest {
    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/index.it.html"); // Replace with the URL of the website
        pageAction = new PageAction(driver);
    }

    @Test
    public void testRejectCookies() {
        pageAction.rejectCookies();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}