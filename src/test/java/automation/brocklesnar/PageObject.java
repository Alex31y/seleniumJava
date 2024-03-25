package automation.brocklesnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    // Method to find and return the username input element
    public WebElement getUsernameInput() {
        return driver.findElement(By.id("username"));
    }

    // Method to find and return the password input element
    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }

    // Method to find and return the show password button
    public WebElement getShowPasswordButton() {
        return driver.findElement(By.cssSelector("button[data-password-toggle]"));
    }

    // Method to find and return the sign in button
    public WebElement getSignInButton() {
        return driver.findElement(By.id("kc-login"));
    }

    // Add more methods for other UI elements if needed
}