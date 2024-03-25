package com.sdet.auto.booking;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TravelSearchTest {

    private WebDriver driver;
    private PageAction pageAction;

    // Initialize WebDriver and PageAction
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        pageAction = new PageAction(driver);
        driver.get("https://www.booking.com/index.it.html");
    }

    // Tear down WebDriver
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void TC0001_EnterDestinationAndSearch() {
        setup();
        try {
            pageAction.rejectCookies(); // Reject cookies before interacting with the page
            pageAction.enterDestination("New York");
            pageAction.selectCheckInDate(); // Assume this selects a specific check-in date
            pageAction.selectCheckOutDate(); // Assume this selects a specific check-out date
            pageAction.configureOccupancy(); // Assume this configures specific occupancy settings
            pageAction.selectFlightCheckbox();
            pageAction.performSearch();
            //pageAction.waitForSearchResults();
        } finally {
            tearDown();
        }
    }

    @Test
    public void TC0002_RejectCookiesAndEnterDestination() {
        setup();
        try {
            pageAction.rejectCookies(); // Reject cookies before interacting with the page

            pageAction.closePopupLogin();
            pageAction.enterDestination("New York");
        } finally {
            tearDown();
        }
    }


    // Add more tests as needed, following the above pattern for different scenarios
}
