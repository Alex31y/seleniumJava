package automation.MSCloginPage2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class Validatore {

    private WebDriver driver;
    private PageAction action;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/LoginPage.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Setting zoom to 90% as an example
        js.executeScript("document.body.style.zoom='65%'");

        action = new PageAction(driver);
    }

    @Test
    public void testGetTextFromElement() {
        try {
            String text = action.getTextFromElement();
            // Assert text is not empty or null if required
        } catch (org.openqa.selenium.NoSuchElementException e) {
            fail("NoSuchElementException occurred");
        }
    }

    @Test
    public void testClickPartnerLink() {
        try {
            action.clickPartnerLink();
            Thread.sleep(100000);
            // Assert any subsequent actions after clicking the partner link
        } catch (org.openqa.selenium.NoSuchElementException e) {
            fail("NoSuchElementException occurred");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testClickLearnMoreButton() {
        try {
            action.clickLearnMoreButton();
            // Assert any subsequent actions after clicking the learn more button
        } catch (org.openqa.selenium.NoSuchElementException e) {
            fail("NoSuchElementException occurred");
        }
    }

    @Test
    public void testClickDisagreeButton() {
        try {
            action.clickDisagreeButton();
            // Assert any subsequent actions after clicking the disagree button
        } catch (org.openqa.selenium.NoSuchElementException e) {
            fail("NoSuchElementException occurred");
        }
    }

    @Test
    public void testClickAgreeButton() {
        try {
            action.clickAgreeButton();
            // Assert any subsequent actions after clicking the agree button
        } catch (org.openqa.selenium.NoSuchElementException e) {
            fail("NoSuchElementException occurred");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
