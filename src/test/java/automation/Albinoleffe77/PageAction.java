package automation.Albinoleffe77;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to interact with the login form element
    public void loginFormAction(){
        pageObject.getLoginForm().click();
    }

    // Method to enter username in the input element
    public void enterUsername(String username){
        pageObject.getUsernameInput().sendKeys(username);
    }

    // Method to enter password in the input element
    public void enterPassword(String password){
        pageObject.getPasswordInput().sendKeys(password);
    }

    // Method to click on the show password button
    public void showPassword(){
        pageObject.getShowPasswordButton().click();
    }

    // Method to submit the login form
    public void submitLoginForm(){
         pageObject.getLoginButton().click();
    }
}