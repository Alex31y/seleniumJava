package msc.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }
    
    // Method to retrieve the input field for booking number
    public WebElement getBookingNumberInput(){
        return driver.findElement(By.id("booking-number"));
    }

    // Method to retrieve the input field for first name
    public WebElement getFirstNameInput(){
        return driver.findElement(By.id("booking-firstname"));
    }

    // Method to retrieve the input field for last name
    public WebElement getLastNameInput(){
        return driver.findElement(By.id("booking-lastname"));
    }

    // Method to retrieve the submit button
    public WebElement getSubmitButton(){
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }

    // Additional methods for hidden input fields can be added as needed

    // Method to locate and return the login button element
    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//a[@class='button button--login' and text()='Login']"));
    }

    // Method to locate and return the registration button element
    public WebElement getRegistrationButton() {
        return driver.findElement(By.xpath("//a[@class='button button--login' and text()='Iscriviti ora']"));
    }

    // Method to locate and return the login/register button element for mobile
    public WebElement getMobileLoginButton() {
        return driver.findElement(By.xpath("//div[@class='loginLightButtonsSectionMobile']//a[@class='button button--login']"));
    }

    // Method to get the href attribute value of the anchor element within the paragraph
    // Method to click on the anchor element within the paragraph
    public void clickOnAnchor(){
        WebElement anchor = driver.findElement(By.tagName("a"));
        anchor.click();
    }

    // Method to get the href attribute value of the anchor element within the paragraph
    public String getAnchorHref(){
        WebElement anchor = driver.findElement(By.tagName("a"));
        return anchor.getAttribute("href");
    }

}