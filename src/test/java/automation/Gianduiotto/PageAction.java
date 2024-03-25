// This class represents the Page Actions that can be performed on the web page
// It utilizes methods from the Page Object class for interacting with web elements

package automation.Gianduiotto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor to initialize the WebDriver and PageObject
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }
    
    // Enter username on the username input field
    public void enterUsername(String username){
        pageObject.getUsernameInput().sendKeys(username);
    }
    
    // Enter password on the password input field
    public void enterPassword(String password){
        pageObject.getPasswordInput().sendKeys(password);
    }
    
    // Click on the Show Password button to reveal password
    public void showPassword(){
        pageObject.getShowPasswordButton().click();
    }
    
    // Click on the Sign In button to submit credentials
    public void clickSignIn(){
        pageObject.getSignInButton().click();
    }
}