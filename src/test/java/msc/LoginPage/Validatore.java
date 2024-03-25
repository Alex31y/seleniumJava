package msc.LoginPage;

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
        pageAction = new PageAction(driver);
        driver.get("http://localhost:8000/LoginPage.html");
    }

    @Test
    public void testEnterBookingNumber() {
        try {
            pageAction.enterBookingNumber("12345");
        } catch (NoSuchElementException e) {
            fail("Failed to enter booking number");
        }
    }

    @Test
    public void testEnterFirstName() {
        try {
            pageAction.enterFirstName("John");
        } catch (NoSuchElementException e) {
            fail("Failed to enter first name");
        }
    }

    @Test
    public void testEnterLastName() {
        try {
            pageAction.enterLastName("Doe");
        } catch (NoSuchElementException e) {
            fail("Failed to enter last name");
        }
    }

    @Test
    public void testSubmitForm() {
        try {
            pageAction.getAnchorHref();
        } catch (NoSuchElementException e) {
            fail("Failed to submit form");
        }
    }

    @After
    public void teardown() {
        driver.quit();
    }
}