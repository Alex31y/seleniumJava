package automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    // Constructor to initialize the WebDriver
    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // Method to get the login form element
    public WebElement getLoginForm() {
        return driver.findElement(By.id("kc-form-login"));
    }

    // Method to get the username input field
    public WebElement getUsernameInput() {
        return getLoginForm().findElement(By.id("username"));
    }

    // Method to get the password input field
    public WebElement getPasswordInput() {
        return getLoginForm().findElement(By.id("password"));
    }

    public WebElement finto() {
        return getLoginForm().findElement(By.id("giorgione"));
    }


    // Method to get the show password button
    public WebElement getShowPasswordButton() {
        return getLoginForm().findElement(By.cssSelector("[data-password-toggle]"));
    }

    // Method to get the login button
    public WebElement getLoginButton() {
        return getLoginForm().findElement(By.id("kc-login"));
    }
}