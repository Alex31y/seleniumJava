package msc.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor to initialize the driver and PageObject
    public PageAction(WebDriver driver) {
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter destination in the 'destination' text input field
    public void enterDestination(String destination) {
        WebElement destinationInput = pageObject.getDestinationInput();
        destinationInput.sendKeys(destination);
    }

    // Method to click on the 'Data check-in' button
    public void clickDataCheckInButton() {
        WebElement dataCheckInButton = pageObject.getDataCheckInButton();
        dataCheckInButton.click();
    }

    // Method to click on the 'Data check-out' button
    public void clickDataCheckOutButton() {
        WebElement dataCheckOutButton = pageObject.getDataCheckOutButton();
        dataCheckOutButton.click();
    }

    // Method to click on the 'Cerca' search button
    public void clickCercaSearchButton() {
        WebElement cercaSearchButton = pageObject.getCercaSearchButton();
        cercaSearchButton.click();
    }
    
    // Method to get the list of options
    public WebElement getAutoCompleteResultsOptions(){
        return pageObject.getAutoCompleteResultsOptions();
    }
    
    // Method to get the heading of the group
    public WebElement getGroupHeading(){
        return pageObject.getGroupHeading();
    }
    
    // Method to select a specific result by index
    public void selectAutoCompleteResultByIndex(int index){
        WebElement result = pageObject.getAutoCompleteResultByIndex(index);
        result.click();
    }
    
    // Method to get the location name
    public String getAutoCompleteLocationName(int resultIndex){
        WebElement locationName = pageObject.getAutoCompleteLocationName(resultIndex);
        return locationName.getText();
    }
    
    // Method to get the country name
    public String getAutoCompleteCountryName(int resultIndex){
        WebElement countryName = pageObject.getAutoCompleteCountryName(resultIndex);
        return countryName.getText();
    }
    
    // Method to click on the Reject All button
    public void clickRejectAllButton(){
        pageObject.getRejectAllButton().click();
    }

    // Method to click on the Accept button
    public void clickAcceptButton(){
        pageObject.getAcceptButton().click();
    }

    // Method to check if the Reject All button is displayed
    public boolean isRejectAllButtonDisplayed(){
        return pageObject.isRejectAllButtonDisplayed();
    }

    // Method to check if the Accept button is displayed
    public boolean isAcceptButtonDisplayed(){
        return pageObject.isAcceptButtonDisplayed();
    }
}