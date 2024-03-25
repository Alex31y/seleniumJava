package automation.MSCloginPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testone {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/LoginPage.html");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testLoginFlow(){
        pageAction.enterFirstName("gino");
        pageAction.enterLastName("paoli");
        pageAction.clickSubmitButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pageAction.enterBookingNumber("777");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}