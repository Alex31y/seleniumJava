/**
 * Test class for searching for Napoli on Booking.com
 */
package msc.booking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CercaNapoli {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize PageAction
        pageAction = new PageAction(driver);

        // Open the Booking.com website
        driver.get("https://www.booking.com/index.it.html");
    }

    @Test
    public void searchAndGoForNapoli() throws InterruptedException {
        // Enter Napoli as the destination
        pageAction.enterDestination("Napoli");

        // Click on the 'Cerca' search button
        pageAction.clickCercaSearchButton();
        Thread.sleep(50000);
        // Add assertion or validation steps here if needed
    }

    @Test
    public void searchForNapoli() throws InterruptedException {
        Thread.sleep(1000);

        // Enter Napoli as the destination
        pageAction.enterDestination("Napoli");


        // Click on the 'Cerca' search button
        Thread.sleep(50000);
        // Add assertion or validation steps here if needed
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}