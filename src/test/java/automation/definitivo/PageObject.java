package automation.definitivo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to retrieve the header element
    public WebElement getHeaderElement() {
        return driver.findElement(By.cssSelector(".login-pf-page-header"));
    }

    // Method to retrieve the page title element
    public WebElement getPageTitleElement() {
        return getHeaderElement().findElement(By.id("kc-page-title"));
    }

    // Method to retrieve the username input element
    public WebElement getUsernameInputElement() {
        return driver.findElement(By.id("username"));
    }

    // Method to retrieve the password input element
    public WebElement getPasswordInputElement() {
        return driver.findElement(By.id("password"));
    }

    // Method to retrieve the show password button
    public WebElement getShowPasswordButton() {
        return getPasswordInputElement().findElement(By.cssSelector(".pf-c-button[data-password-toggle]"));
    }

    // Method to retrieve the login button
    public WebElement getLoginButton() {
        return driver.findElement(By.id("kc-login"));
    }

}