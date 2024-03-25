package com.sdet.auto.booking2;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

public class PageAction {
    private WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver) {
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    public void rejectCookies() {
        try {
            // Click on the 'Reject All' button to reject the cookies
            pageObject.getRejectAllButton().click();
            System.out.println("Cookies rejected successfully.");
        } catch (Exception e) {
            System.out.println("Error occurred while rejecting cookies: " + e.getMessage());
        }
    }

    // Method to perform a search on the website
    public void performSearch(String destination, String checkInDate, String checkOutDate) {
        pageObject.getDestinationInput().sendKeys(destination);
        pageObject.getCheckInDateButton().click();
        // Additional logic to select check-in date from date picker

        pageObject.getCheckOutDateButton().click();
        // Additional logic to select check-out date from date picker

        pageObject.getSearchButton().click();
    }

    // Method to set occupancy configuration
    public void setOccupancy(int adults, int children) {
        try {
            pageObject.getOccupancyConfigButton().click();
            // Additional logic to select number of adults and children
        } catch (NoSuchElementException e) {
            System.out.println("Occupancy config button not found");
        }
    }

    // Method to toggle flight search checkbox
    public void toggleFlightSearch() {
        try {
            pageObject.getFlightSearchCheckbox().click();
        } catch (NoSuchElementException e) {
            System.out.println("Flight search checkbox not found");
        }
    }

}