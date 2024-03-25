package msc.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    // Constructor to initialize the driver
    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to retrieve the 'destination' text input field
    public WebElement getDestinationInput(){
        return driver.findElement(By.name("ss"));
    }

    // Method to retrieve the 'Data check-in' button
    public WebElement getDataCheckInButton(){
        return driver.findElement(By.cssSelector("[data-testid='date-display-field-start']"));
    }

    // Method to retrieve the 'Data check-out' button
    public WebElement getDataCheckOutButton(){
        return driver.findElement(By.cssSelector("[data-testid='date-display-field-end']"));
    }

    // Method to retrieve the 'Cerca' search button
    public WebElement getCercaSearchButton(){
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }

    // Method to get the list of options
    public WebElement getAutoCompleteResultsOptions(){
        return driver.findElement(By.cssSelector("[data-testid='autocomplete-results-options']"));
    }

    // Method to get the heading of the group
    public WebElement getGroupHeading(){
        return driver.findElement(By.id("group-0-heading"));
    }

    // Method to select a specific result by index
    public WebElement getAutoCompleteResultByIndex(int index){
        return driver.findElement(By.id("autocomplete-result-" + index));
    }

    // Method to get the location name
    public WebElement getAutoCompleteLocationName(int resultIndex){
        return driver.findElement(By.cssSelector("#autocomplete-result-" + resultIndex + " .a3332d346a"));
    }

    // Method to get the country name
    public WebElement getAutoCompleteCountryName(int resultIndex){
        return driver.findElement(By.cssSelector("#autocomplete-result-" + resultIndex + " .abf093bdfe"));
    }

    // Method to retrieve the Reject All button element
    public WebElement getRejectAllButton(){
        return driver.findElement(By.id("onetrust-reject-all-handler"));
    }

    // Method to retrieve the Accept button element
    public WebElement getAcceptButton(){
        return driver.findElement(By.id("onetrust-accept-btn-handler"));
    }

    // Method to check if the Reject All button is displayed
    public boolean isRejectAllButtonDisplayed(){
        return driver.findElement(By.id("onetrust-reject-all-handler")).isDisplayed();
    }

    // Method to check if the Accept button is displayed
    public boolean isAcceptButtonDisplayed(){
        return driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
    }
}