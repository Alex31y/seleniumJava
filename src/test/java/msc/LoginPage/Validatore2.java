package msc.LoginPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.fail;

public class Validatore2 {
    
    private WebDriver driver;
    private PageAction pageAction;
    
    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        pageAction = new PageAction(driver);
        
        driver.get("http://localhost:8000/LoginPage.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='70%'");
    }
    
    @Test
    public void testEnterBookingNumber(){
        // Test enterBookingNumber
        pageAction.enterBookingNumber("12345");
    }
    
    @Test
    public void testEnterFirstName(){
        // Test enterFirstName
        pageAction.enterFirstName("John");
    }
    
    @Test
    public void testEnterLastName(){
        // Test enterLastName
        pageAction.enterLastName("Doe");
    }
    
    @Test
    public void testSubmitForm(){
        // Test submitForm
        pageAction.submitForm();
    }
    
    @Test
    public void testClickLoginButton() throws InterruptedException {
        Thread.sleep(500000);
        // Test clickLoginButton
        pageAction.clickLoginButton();
    }
    
    @Test
    public void testClickRegistrationButton(){
        // Test clickRegistrationButton
        pageAction.clickRegistrationButton();
    }
    
    @Test
    public void testClickMobileLoginButton(){
        // Test clickMobileLoginButton
        pageAction.clickMobileLoginButton();
    }

    @Test
    public void clickOnAnchor(){
        try {
            pageAction.clickOnAnchor();
        } catch (NoSuchElementException e) {
            fail("Failed to submit form");
        }
    }




    
    @After
    public void tearDown(){
        driver.quit();
    }
}