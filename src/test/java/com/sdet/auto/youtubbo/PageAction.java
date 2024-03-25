package com.sdet.auto.youtubbo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PageAction {
    private WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver) {
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    public void clickSearchButton() {
        pageObject.getSearchButton().click();
    }

    public void rejectCookies() {
        try {
            pageObject.getRejectAllButton().click();
        } catch (Exception e) {
            System.out.println("An exception occurred while rejecting cookies: " + e.getMessage());
            // Handle exception or throw it further as needed
        }
    }

    // Search for a keyword using the search input field
    public void searchForKeyword(String keyword) {
        WebElement searchInput = pageObject.getSearchInput();
        searchInput.clear();
        searchInput.sendKeys(keyword);
    }

    // Clear the search input field
    public void clearSearchInput() {
        pageObject.getSearchClearButton().click();
    }

    // Determine if the search container is visible
    public boolean isSearchContainerVisible() {
        return pageObject.getSearchContainer().isDisplayed();
    }

    // Legacy search using the legacy search icon
    public void performLegacySearch() {
        pageObject.getSearchIconLegacy().click();
    }

    // Example of a custom action method
    public void customAction() {
        // Perform a custom action on the page
    }
}