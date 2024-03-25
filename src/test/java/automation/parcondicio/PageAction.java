package automation.parcondicio;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;
    
    // Constructor to initialize the driver and create an instance of PageObject
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter the username in the input field
    public void enterUsername(String username){
        WebElement usernameInput = pageObject.getUsernameInput();
        usernameInput.sendKeys(username);
    }

    // Method to enter the password in the input field
    public void enterPassword(String password){
        WebElement passwordInput = pageObject.getPasswordInput();
        passwordInput.sendKeys(password);
    }

    // Method to click on the show password button
    public void clickShowPasswordButton(){
        WebElement showPasswordButton = pageObject.getShowPasswordButton();
        showPasswordButton.click();
    }

    // Method to click on the submit button
    public void clickSubmitButton(){
        WebElement submitButton = pageObject.getSubmitButton();
        submitButton.click();
    }
}