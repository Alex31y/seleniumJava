package com.sdet.auto.youtubbo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getButtonRow() {
        return driver.findElement(By.cssSelector(".eom-button-row"));
    }

    public WebElement getAcceptAllButton() {
        return getButtonRow().findElement(By.cssSelector("button[aria-label='Accetta l'utilizzo dei cookie e di altri dati per le finalità descritte']"));
    }

    public WebElement getRejectAllButton() {
        return getButtonRow().findElement(By.cssSelector("button[aria-label='Reject the use of cookies and other data for the purposes described']"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.cssSelector("#search-icon-legacy"));
    }

    public WebElement getYtIcon() {
        return getSearchButton().findElement(By.cssSelector("yt-icon"));
    }

    public WebElement getTpYtPaperTooltip() {
        return getSearchButton().findElement(By.cssSelector("tp-yt-paper-tooltip"));
    }

    public WebElement getTooltipText() {
        return getTpYtPaperTooltip().findElement(By.cssSelector("#tooltip"));
    }

    public WebElement getSearchInput() {
        return driver.findElement(By.cssSelector("#search-input input"));
    }

    public WebElement getSearchClearButton() {
        return driver.findElement(By.cssSelector("#search-clear-button"));
    }

    public WebElement getSearchContainer() {
        return driver.findElement(By.cssSelector("#search-container"));
    }

    public WebElement getSearchIconLegacy() {
        return driver.findElement(By.cssSelector("#search-icon-legacy"));
    }
}
