package msc.LoginPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLogin {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8000/LoginPage.html");
        driver.manage().window().maximize();
        pageAction = new PageAction(driver);
    }

    @Test
    public void testLoginPage() {
        // Inserting username "angelo"
        pageAction.enterFirstName("angelo");

        // Inserting password "mortadella7"
        pageAction.enterLastName("mortadella7");

        // Inserting random booking number
        pageAction.enterBookingNumber("123456");

        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clicking on login button
        pageAction.submitForm();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
