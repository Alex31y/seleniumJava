package com.sdet.auto.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageAction {
    private WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver) {
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }


    // Newly added method to accept cookies if present
    public void rejectCookies() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By rejectCookiesSelector = By.id("onetrust-reject-all-handler"); // Update this selector to match the actual button on your site
        try {
            wait.until(ExpectedConditions.elementToBeClickable(rejectCookiesSelector)).click();
        } catch (Exception e) {
            System.out.println("Reject cookies banner not found or not clickable.");
        }
    }

    public void closePopupLogin() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By closePopupSelector = By.cssSelector("button[aria-label='Ignora le informazioni sull'accesso.']");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(closePopupSelector)).click();
        } catch (Exception e) {
            System.out.println("Reject cookies banner not found or not clickable.");
        }
    }

    // Method to enter the destination in the search input field
    public void enterDestination(String destination) {
        pageObject.enterDestination(destination);
    }

    // Method to click on the Check-In date button
    public void selectCheckInDate() {
        pageObject.clickDateCheckInButton();
        // Additional logic to select a specific date can be included here
    }

    // Method to click on the Check-Out date button
    public void selectCheckOutDate() {
        pageObject.clickDateCheckOutButton();
        // Additional logic to select a specific date can be included here
    }

    // Method to click on the occupancy configuration button
    public void configureOccupancy() {
        pageObject.clickOccupancyConfigButton();
        // Additional logic to set the number of guests, rooms, etc. can be included here
    }

    // Method to check the flight checkbox
    public void selectFlightCheckbox() {
        pageObject.checkFlightCheckbox();
    }

    // Method to perform a search
    public void performSearch() {
        pageObject.clickSearchButton();
        // Additional logic to handle search results can be included here
    }

    // Method to wait until the search results are displayed
    public void waitForSearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-results")));
    }
}