package automation.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordTest {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
        driver.get("https://icareme.nexsoft.it:8085/realms/master/protocol/openid-connect/auth?client_id=security-admin-console&redirect_uri=https%3A%2F%2Ficareme.nexsoft.it%3A8085%2Fadmin%2Fmaster%2Fconsole%2F&state=bcbae81e-e015-4045-82e1-c590cd30f452&response_mode=fragment&response_type=code&scope=openid&nonce=ff2c8658-f851-4391-8a0e-9808c12627f9&code_challenge=1wP72K1nLISu76lQRH4bErFgBnvueLecEhC0CDVRh94&code_challenge_method=S256");
    }

    @Test
    public void testShowPasswordButton() throws InterruptedException {
        pageAction.enterPassword("testpassword");
        pageAction.clickShowPasswordButton();
        Thread.sleep(100000);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}