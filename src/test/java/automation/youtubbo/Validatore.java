
package automation.youtubbo;

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
        pageAction = new PageAction(driver);
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void testClickRejectAllButton() {
        try {
            pageAction.clickRejectAllButton();
        } catch (NoSuchElementException e) {
            fail("Reject all button not found");
        }
    }

    @Test
    public void testClickAcceptAllButton() {
        try {
            pageAction.clickAcceptAllButton();
        } catch (NoSuchElementException e) {
            fail("Accept all button not found");
        }

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
