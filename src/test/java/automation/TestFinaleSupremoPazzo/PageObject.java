package automation.TestFinaleSupremoPazzo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;
    
    // Constructor to initialize the WebDriver
    public PageObject(WebDriver driver){
        this.driver = driver;
    }
    
    // Method to return the username input element
    public WebElement getUsernameInput(){
        return driver.findElement(By.id("username"));
    }
    
    // Method to return the password input element
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }
    
    // Method to return the Show Password button
    public WebElement getShowPasswordButton(){
        return driver.findElement(By.cssSelector("button[data-password-toggle]"));
    }
    
    // Method to return the Sign In button
    public WebElement getSignInButton(){
        return driver.findElement(By.id("kc-login"));
    }
}