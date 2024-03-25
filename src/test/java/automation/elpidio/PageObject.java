package automation.elpidio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to get the username input field
    public WebElement getUsernameInput(){
        return driver.findElement(By.id("username"));
    }

    // Method to get the password input field
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }

    // Method to get the show password button
    public WebElement getShowPasswordButton(){
        return driver.findElement(By.xpath("//button[@aria-label='Show password']"));
    }

    // Method to get the sign in button
    public WebElement getSignInButton(){
        return driver.findElement(By.id("kc-login"));
    }
}