package automation.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter username in the username input field
    public void enterUsername(String username) {
        WebElement usernameElement = pageObject.getUsernameInputElement();
        usernameElement.sendKeys(username);
    }

    // Method to enter password in the password input field
    public void enterPassword(String password) {
        WebElement passwordElement = pageObject.getPasswordInputElement();
        passwordElement.sendKeys(password);
    }

    // Method to click on the show password button
    public void clickShowPasswordButton() {
        WebElement showPasswordButtonElement = pageObject.getShowPasswordButtonElement();
        showPasswordButtonElement.click();
    }

    // Method to click on the sign in button
    public void clickSignInButton() {
        WebElement signInButtonElement = pageObject.getSignInButtonElement();
        signInButtonElement.click();
    }

    // Method to get the text of the header element
    public String getHeaderText() {
        WebElement headerElement = pageObject.getHeaderElement();
        return headerElement.getText();
    }

    // Method to get the text of the page title element
    public String getPageTitleText() {
        WebElement pageTitleElement = pageObject.getPageTitleElement();
        return pageTitleElement.getText();
    }
}