package com.sdet.auto.login;
import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://icareme.nexsoft.it:8085/realms/master/protocol/openid-connect/auth?client_id=security-admin-console&redirect_uri=https%3A%2F%2Ficareme.nexsoft.it%3A8085%2Fadmin%2Fmaster%2Fconsole%2F&state=bcbae81e-e015-4045-82e1-c590cd30f452&response_mode=fragment&response_type=code&scope=openid&nonce=ff2c8658-f851-4391-8a0e-9808c12627f9&code_challenge=1wP72K1nLISu76lQRH4bErFgBnvueLecEhC0CDVRh94&code_challenge_method=S256");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testLoginWithIncorrectCredentials() throws InterruptedException {
        pageAction.enterUsername("incorrect_username");
        pageAction.enterPassword("incorrect_password");
        pageAction.clickSignInButton();

        String errorMessage = pageAction.getErrorMessageText();
        Assert.assertEquals("Messaggio di errore non corrisponde", "Invalid username or password.", errorMessage);
        //Thread.sleep(100000);
    }


    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}