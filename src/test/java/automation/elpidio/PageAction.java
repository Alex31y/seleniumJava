package automation.elpidio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter username
    public void enterUsername(String username){
        WebElement usernameInput = pageObject.getUsernameInput();
        usernameInput.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password){
        WebElement passwordInput = pageObject.getPasswordInput();
        passwordInput.sendKeys(password);
    }

    // Method to click on show password button
    public void clickShowPasswordButton(){
        WebElement showPasswordButton = pageObject.getShowPasswordButton();
        showPasswordButton.click();
    }

    // Method to click on sign in button
    public void clickSignInButton(){
        WebElement signInButton = pageObject.getSignInButton();
        signInButton.click();
    }
}