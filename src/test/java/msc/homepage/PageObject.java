package msc.homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to get the search destination input box
    public WebElement getSearchDestinationInputBox() {
        return driver.findElement(By.cssSelector(".search__input-box[automation-id='search-destination']"));
    }

    // Method to get the search dates input box
    public WebElement getSearchDatesInputBox() {
        return driver.findElement(By.cssSelector(".search__input-box[automation-id='search-dates']"));
    }

    // Method to get the search departures input box
    public WebElement getSearchDeparturesInputBox() {
        return driver.findElement(By.cssSelector(".search__input-box[automation-id='search-departures']"));
    }

    // Method to get the search button
    public WebElement getSearchButton() {
        return driver.findElement(By.cssSelector(".search__button[automation-id='search-button']"));
    }
}