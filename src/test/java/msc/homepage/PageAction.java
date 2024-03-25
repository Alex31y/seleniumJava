package msc.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor to initialize WebDriver and PageObject classes
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to enter search destination in input box
    public void enterSearchDestination(String destination){
        WebElement searchDestInputBox = pageObject.getSearchDestinationInputBox();
        searchDestInputBox.sendKeys(destination);
    }

    // Method to enter search dates in input box
    public void enterSearchDates(String dates){
        WebElement searchDatesInputBox = pageObject.getSearchDatesInputBox();
        searchDatesInputBox.sendKeys(dates);
    }

    // Method to enter search departures in input box
    public void enterSearchDepartures(String departures){
        WebElement searchDeparturesInputBox = pageObject.getSearchDeparturesInputBox();
        searchDeparturesInputBox.sendKeys(departures);
    }

    // Method to click on the search button
    public void clickSearchButton(){
        WebElement searchButton = pageObject.getSearchButton();
        searchButton.click();
    }

}