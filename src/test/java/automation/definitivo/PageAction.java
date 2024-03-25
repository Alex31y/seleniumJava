package automation.definitivo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {

    private WebDriver driver;
    private PageObject pageObject;

    // Constructor with additional methods from Second Class
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to interact with the header element
    public WebElement getHeaderElement() {
        return pageObject.getHeaderElement();
    }

    // Method to interact with the page title element
    public WebElement getPageTitleElement() {
        return pageObject.getPageTitleElement();
    }

    // Method to interact with the username input element
    public WebElement getUsernameInputElement() {
        return pageObject.getUsernameInputElement();
    }

    // Method to interact with the password input element
    public WebElement getPasswordInputElement() {
        return pageObject.getPasswordInputElement();
    }

    // Method to interact with the show password button
    public WebElement getShowPasswordButton() {
        return pageObject.getShowPasswordButton();
    }

    // Method to interact with the login button
    public WebElement getLoginButton() {
        return pageObject.getLoginButton();
    }

}