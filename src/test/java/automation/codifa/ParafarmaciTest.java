package automation.codifa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParafarmaciTest {
    
    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.codifa.it/");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testClickParafarmaciLinkButton() throws InterruptedException {
        pageAction.clickParafarmaciLinkButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}