package automation.brocklesnar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter username in the username input field
    public void enterUsername(String username) {
        WebElement usernameInput = pageObject.getUsernameInput();
        usernameInput.sendKeys(username);
    }

    // Method to enter password in the password input field
    public void enterPassword(String password) {
        WebElement passwordInput = pageObject.getPasswordInput();
        passwordInput.sendKeys(password);
    }

    // Method to click on the show password button
    public void clickShowPasswordButton() {
        WebElement showPasswordBtn = pageObject.getShowPasswordButton();
        showPasswordBtn.click();
    }

    // Method to click on the sign in button
    public void clickSignInButton() {
        WebElement signInBtn = pageObject.getSignInButton();
        signInBtn.click();
    }

    // Add more methods for other interactions with UI elements if needed
}