package msc.booking;

import msc.booking.PageAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CercaLauriaPrimoElemento {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
        driver.get("https://www.booking.com/index.it.html");
    }

    @Test
    public void testCercaLauriaPrimoElemento() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (pageAction.isAcceptButtonDisplayed()) {
            pageAction.clickRejectAllButton();
        }

        pageAction.enterDestination("Lauria");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pageAction.selectAutoCompleteResultByIndex(0);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pageAction.clickCercaSearchButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}