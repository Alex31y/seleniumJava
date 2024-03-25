package com.sdet.auto.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getButtonIgnore() {
        return driver.findElement(By.cssSelector("button[aria-label='Ignora le informazioni sull'accesso.']"));
    }

    public WebElement getHeroBannerSearchBox(){
        return driver.findElement(By.cssSelector(".hero-banner-searchbox"));
    }

    public WebElement getDestinationInput(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("input[name='ss']"));
    }

    public WebElement getDateCheckInButton(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("button[data-testid='date-display-field-start']"));
    }

    public WebElement getDateCheckOutButton(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("button[data-testid='date-display-field-end']"));
    }

    public WebElement getOccupancyConfigButton(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("button[data-testid='occupancy-config']"));
    }

    public WebElement getSearchButton(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("button[type='submit']"));
    }

    public WebElement getCheckboxFlight(){
        return getHeroBannerSearchBox().findElement(By.cssSelector("input[name='sb_flight_search']"));
    }

    public void clickDateCheckInButton(){
        getDateCheckInButton().click();
    }

    public void clickDateCheckOutButton(){
        getDateCheckOutButton().click();
    }

    public void clickOccupancyConfigButton(){
        getOccupancyConfigButton().click();
    }

    public void clickSearchButton(){
        getSearchButton().click();
    }

    public void checkFlightCheckbox(){
        getCheckboxFlight().click();
    }

    public void enterDestination(String destination){
        getDestinationInput().sendKeys(destination);
    }
}