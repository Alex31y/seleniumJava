package msc.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }
    
    // Method to input booking number
    public void enterBookingNumber(String bookingNumber){
        WebElement bookingNumberInput = pageObject.getBookingNumberInput();
        bookingNumberInput.sendKeys(bookingNumber);
    }

    // Method to input first name
    public void enterFirstName(String firstName){
        WebElement firstNameInput = pageObject.getFirstNameInput();
        firstNameInput.sendKeys(firstName);
    }

    // Method to input last name
    public void enterLastName(String lastName){
        WebElement lastNameInput = pageObject.getLastNameInput();
        lastNameInput.sendKeys(lastName);
    }

    // Method to submit form
    public void submitForm(){
        WebElement submitButton = pageObject.getSubmitButton();
        submitButton.click();
    }
    
    // Method to click on the login button
    public void clickLoginButton() {
        pageObject.getLoginButton().click();
    }

    // Method to click on the registration button
    public void clickRegistrationButton() {
        pageObject.getRegistrationButton().click();
    }

    // Method to click on the mobile login button
    public void clickMobileLoginButton() {
        pageObject.getMobileLoginButton().click();
    }

    // Method to click on the anchor element within the paragraph
    public void clickOnAnchor(){
        pageObject.clickOnAnchor();
    }

    // Method to get the href attribute value of the anchor element within the paragraph
    public String getAnchorHref(){
        return pageObject.getAnchorHref();
    }
}