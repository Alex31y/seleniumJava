package automation.test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aldo {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://icareme.nexsoft.it:8085/realms/master/protocol/openid-connect/auth?client_id=security-admin-console&redirect_uri=https%3A%2F%2Ficareme.nexsoft.it%3A8085%2Fadmin%2Fmaster%2Fconsole%2F&state=bcbae81e-e015-4045-82e1-c590cd30f452&response_mode=fragment&response_type=code&scope=openid&nonce=ff2c8658-f851-4391-8a0e-9808c12627f9&code_challenge=1wP72K1nLISu76lQRH4bErFgBnvueLecEhC0CDVRh94&code_challenge_method=S256");

        // Perform login actions
        pageAction.enterUsername("your_username");
        pageAction.enterPassword("your_password");
        pageAction.clickSignInButton();

        Thread.sleep(100000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}