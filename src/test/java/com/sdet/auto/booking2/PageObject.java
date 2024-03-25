package com.sdet.auto.booking2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRejectAllButton() {
        return driver.findElement(By.id("onetrust-reject-all-handler"));
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.cssSelector(".hero-banner-searchbox"));
    }

    public WebElement getDestinationInput() {
        return getSearchBox().findElement(By.cssSelector("[name='ss']"));
    }

    public WebElement getCheckInDateButton() {
        return getSearchBox().findElement(By.cssSelector("[data-testid='date-display-field-start']"));
    }

    public WebElement getCheckOutDateButton() {
        return getSearchBox().findElement(By.cssSelector("[data-testid='date-display-field-end']"));
    }

    public WebElement getOccupancyConfigButton() {
        return getSearchBox().findElement(By.cssSelector("[data-testid='occupancy-config']"));
    }

    public WebElement getSearchButton() {
        return getSearchBox().findElement(By.cssSelector("[type='submit']"));
    }

    public WebElement getFlightSearchCheckbox() {
        return getSearchBox().findElement(By.cssSelector("[name='sb_flight_search']"));
    }
}
