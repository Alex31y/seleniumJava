package automation.parcondicio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        // Constructor to initialize the driver
        this.driver = driver;
    }

    // Method to find and return the username input element
    public WebElement getUsernameInput(){
        return driver.findElement(By.id("username"));
    }

    // Method to find and return the password input element
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }

    // Method to find and return the show password button
    public WebElement getShowPasswordButton(){
        return driver.findElement(By.xpath("//button[@aria-label='Show password']"));
    }

    // Method to find and return the submit button
    public WebElement getSubmitButton(){
        return driver.findElement(By.id("kc-login"));
    }

}