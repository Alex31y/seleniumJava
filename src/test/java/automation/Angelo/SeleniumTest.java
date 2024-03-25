package automation.Angelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
        driver.get("https://icareme.nexsoft.it:8085/realms/master/protocol/openid-connect/auth?client_id=security-admin-console&redirect_uri=https%3A%2F%2Ficareme.nexsoft.it%3A8085%2Fadmin%2Fmaster%2Fconsole%2F&state=d1d791e7-c09d-46b2-81ea-5dbd66b1db6d&response_mode=fragment&response_type=code&scope=openid&nonce=6ce44cab-c6c1-4137-871d-6c42a8415889&code_challenge=Jx_OG6J1Jut98Zvh_RHbCcdXxRfDC_deH_j6frf6I9A&code_challenge_method=S256");
    }

    @Test
    public void testLogin(){
        pageAction.enterUsername("giulio");
        pageAction.enterPassword("cesare");
        pageAction.clickShowPassword();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}