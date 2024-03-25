package automation.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    
    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to get the header element
    public WebElement getHeaderElement() {
        return driver.findElement(By.cssSelector(".login-pf-page-header"));
    }

    // Method to get the page title element
    public WebElement getPageTitleElement() {
        return driver.findElement(By.id("kc-page-title"));
    }

    // Method to get the username input element
    public WebElement getUsernameInputElement() {
        return driver.findElement(By.id("username"));
    }

    // Method to get the password input element
    public WebElement getPasswordInputElement() {
        return driver.findElement(By.id("password"));
    }

    // Method to get the show password button element
    public WebElement getShowPasswordButtonElement() {
        return driver.findElement(By.cssSelector("[data-password-toggle]"));
    }

    // Method to get the sign in button element
    public WebElement getSignInButtonElement() {
        return driver.findElement(By.id("kc-login"));
    }
}