package automation.Albinoleffe77;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to find and return the login form element
    public WebElement getLoginForm(){
        return driver.findElement(By.id("kc-form-login"));
    }

    // Method to find and return the username input element
    public WebElement getUsernameInput(){
        return driver.findElement(By.id("username"));
    }

    // Method to find and return the password input element
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }

    // Method to find and return the show password button element
    public WebElement getShowPasswordButton(){
        return driver.findElement(By.cssSelector("button[data-password-toggle]"));
    }

    // Method to find and return the login button element
    public WebElement getLoginButton(){
        return driver.findElement(By.id("kc-login"));
    }
}