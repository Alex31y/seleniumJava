package com.sdet.auto.msc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SeleniumTests {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
        driver.get("https://www.msccrociere.it/");
    }

    @Test
    public void testRejectCookies() throws InterruptedException {
        pageAction.clickDisagreeButton(); // Click on the disagree button to reject cookies
        Thread.sleep(100000);
    }

    @Test
    public void testClickSelectAndClick() throws InterruptedException {
        pageAction.clickDisagreeButton();
        pageAction.clickOnDestinationIcon();
        pageAction.selectChecklistItem(2);
        pageAction.clickSearchButton();
        Thread.sleep(10000);

        // Add assertions here if needed
    }

    @Test
    public void testSustainabilityPageFunctionality() throws InterruptedException {
        pageAction.clickDisagreeButton();
        // Click on the Sostenibilita link
        pageAction.clickOnSostenibilitaLink();
        Thread.sleep(10000);
    }

    @Test
    public void testClickMenuElement() throws InterruptedException {
        pageAction.clickDisagreeButton();
        pageAction.clickMenuElement();
        Thread.sleep(10000);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}