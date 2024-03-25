package msc.booking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Validatore {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageAction = new PageAction(driver);
        driver.get("https://www.booking.com/index.it.html");
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void testEnterDestination() {
        try {
            pageAction.enterDestination("Rome");
            Thread.sleep(50000);
        } catch (NoSuchElementException e) {
            fail("Element not found");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void searchForNapoli() throws InterruptedException {
        // Enter Napoli as the destination
        pageAction.enterDestination("Napoli");
        Thread.sleep(50000);
        // Click on the 'Cerca' search button
        pageAction.clickCercaSearchButton();

        // Add assertion or validation steps here if needed
    }

    @Test
    public void testDataCheckInButton() {
        try {
            pageAction.clickDataCheckInButton();
            Thread.sleep(50000);
        } catch (NoSuchElementException e) {
            fail("Element not found");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDataCheckOutButton() {
        try {
            pageAction.clickDataCheckOutButton();
        } catch (NoSuchElementException e) {
            fail("Element not found");
        }
    }

    @Test
    public void testCercaSearchButton() {
        try {
            pageAction.clickCercaSearchButton();
        } catch (NoSuchElementException e) {
            fail("Element not found");
        }
    }


}
