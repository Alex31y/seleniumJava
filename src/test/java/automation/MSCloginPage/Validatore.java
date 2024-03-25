package automation.MSCloginPage;

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
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/LoginPage.html");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testEnterBookingNumber() {
        try {
            pageAction.enterBookingNumber("123456");
        } catch (NoSuchElementException e) {
            fail("Test failed: enterBookingNumber method");
        }
    }

    @Test
    public void testEnterFirstName() {
        try {
            pageAction.enterFirstName("John");
        } catch (NoSuchElementException e) {
            fail("Test failed: enterFirstName method");
        }
    }

    @Test
    public void testEnterLastName() {
        try {
            pageAction.enterLastName("Doe");
        } catch (NoSuchElementException e) {
            fail("Test failed: enterLastName method");
        }
    }

    @Test
    public void testClickSubmitButton() {
        try {
            pageAction.clickSubmitButton();
        } catch (NoSuchElementException e) {
            fail("Test failed: clickSubmitButton method");
        }
    }

    @Test
    public void testGetBookingLoginHiddenValue() {
        try {
            pageAction.getBookingLoginHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getBookingLoginHiddenValue method");
        }
    }

    @Test
    public void testGetPaxidHiddenValue() {
        try {
            pageAction.getPaxidHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getPaxidHiddenValue method");
        }
    }

    @Test
    public void testGetDobHiddenValue() {
        try {
            pageAction.getDobHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getDobHiddenValue method");
        }
    }

    @Test
    public void testGetCruiseidHiddenValue() {
        try {
            pageAction.getCruiseidHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getCruiseidHiddenValue method");
        }
    }

    @Test
    public void testGetEmailHiddenValue() {
        try {
            pageAction.getEmailHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getEmailHiddenValue method");
        }
    }

    @Test
    public void testGetPhoneNumberHiddenValue() {
        try {
            pageAction.getPhoneNumberHiddenValue();
        } catch (NoSuchElementException e) {
            fail("Test failed: getPhoneNumberHiddenValue method");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
