package automation.TestFinaleSupremoPazzo;

import org.openqa.selenium.WebDriver;

public class PageAction {
    
    // WebDriver instance
    private final WebDriver driver;
    
    // PageObject instance
    private PageObject pageObject;
    
    // Constructor to initialize the WebDriver and PageObject
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }
    
    // Method to enter username in the username input field
    public void enterUsername(String username){
        pageObject.getUsernameInput().sendKeys(username);
    }
    
    // Method to enter password in the password input field
    public void enterPassword(String password){
        pageObject.getPasswordInput().sendKeys(password);
    }
    
    // Method to click on the Show Password button
    public void clickShowPasswordButton(){
        pageObject.getShowPasswordButton().click();
    }
    
    // Method to click on the Sign In button
    public void clickSignInButton(){
        pageObject.getSignInButton().click();
    }
}