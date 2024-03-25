package automation.MSCloginPage;

import org.openqa.selenium.WebDriver;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor to initialize driver and pageObject instance
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter booking number in the input field
    public void enterBookingNumber(String bookingNumber){
        pageObject.getBookingNumberInput().sendKeys(bookingNumber);
    }

    // Method to enter first name in the input field
    public void enterFirstName(String firstName){
        pageObject.getFirstNameInput().sendKeys(firstName);
    }

    // Method to enter last name in the input field
    public void enterLastName(String lastName){
        pageObject.getLastNameInput().sendKeys(lastName);
    }

    // Method to click on the submit button
    public void clickSubmitButton(){
        pageObject.getSubmitButton().click();
    }

    // Method to get value from the hidden input field for booking login
    public String getBookingLoginHiddenValue(){
        return pageObject.getBookingLoginHiddenInput().getAttribute("value");
    }

    // Method to get value from the hidden input field for booking paxid
    public String getPaxidHiddenValue(){
        return pageObject.getPaxidHiddenInput().getAttribute("value");
    }

    // Method to get value from the hidden input field for booking dob
    public String getDobHiddenValue(){
        return pageObject.getDobHiddenInput().getAttribute("value");
    }

    // Method to get value from the hidden input field for booking cruiseid
    public String getCruiseidHiddenValue(){
        return pageObject.getCruiseidHiddenInput().getAttribute("value");
    }

    // Method to get value from the hidden input field for booking email
    public String getEmailHiddenValue(){
        return pageObject.getEmailHiddenInput().getAttribute("value");
    }

    // Method to get value from the hidden input field for booking phone number
    public String getPhoneNumberHiddenValue(){
        return pageObject.getPhoneNumberHiddenInput().getAttribute("value");
    }
}