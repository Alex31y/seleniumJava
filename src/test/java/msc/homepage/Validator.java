package msc.homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Validator {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/homepage.html");
        driver.manage().window().maximize();
        pageAction = new PageAction(driver);
    }

    @Test
    public void testEnterSearchDestination() {
        try {
            pageAction.enterSearchDestination("Test Destination");
        } catch (NoSuchElementException e) {
            fail("Test failed: NoSuchElementException occurred");
        }
    }

    @Test
    public void testEnterSearchDates() {
        try {
            pageAction.enterSearchDates("Test Dates");
        } catch (NoSuchElementException e) {
            fail("Test failed: NoSuchElementException occurred");
        }
    }

    @Test
    public void testEnterSearchDepartures() {
        try {
            pageAction.enterSearchDepartures("Test Departures");
        } catch (NoSuchElementException e) {
            fail("Test failed: NoSuchElementException occurred");
        }
    }

    @Test
    public void testClickSearchButton() {
        try {
            pageAction.clickSearchButton();
        } catch (NoSuchElementException e) {
            fail("Test failed: NoSuchElementException occurred");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
