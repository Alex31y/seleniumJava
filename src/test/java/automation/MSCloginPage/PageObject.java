package automation.MSCloginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to find and return the input field for booking number
    public WebElement getBookingNumberInput(){
        return driver.findElement(By.id("booking-number"));
    }

    // Method to find and return the input field for first name
    public WebElement getFirstNameInput(){
        return driver.findElement(By.id("booking-firstname"));
    }

    // Method to find and return the input field for last name
    public WebElement getLastNameInput(){
        return driver.findElement(By.id("booking-lastname"));
    }

    // Method to find and return the submit button
    public WebElement getSubmitButton(){
        return driver.findElement(By.cssSelector(".field-submit input[type='submit']"));
    }

    // Method to find and return the hidden input field for booking login
    public WebElement getBookingLoginHiddenInput(){
        return driver.findElement(By.id("booking-login"));
    }

    // Method to find and return the hidden input field for booking paxid
    public WebElement getPaxidHiddenInput(){
        return driver.findElement(By.id("booking-paxid"));
    }

    // Method to find and return the hidden input field for booking dob
    public WebElement getDobHiddenInput(){
        return driver.findElement(By.id("booking-dob"));
    }

    // Method to find and return the hidden input field for booking cruiseid
    public WebElement getCruiseidHiddenInput(){
        return driver.findElement(By.id("booking-cruiseid"));
    }

    // Method to find and return the hidden input field for booking email
    public WebElement getEmailHiddenInput(){
        return driver.findElement(By.id("booking-email"));
    }

    // Method to find and return the hidden input field for booking phone number
    public WebElement getPhoneNumberHiddenInput(){
        return driver.findElement(By.id("booking-phonenumber"));
    }
}