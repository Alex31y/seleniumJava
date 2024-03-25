package com.sdet.auto.msc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {

    private WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver) {
        this.driver = driver;
        this.pageObject = new PageObject(driver);

    }

    public void enterDestination(String destination) {
        pageObject.getDestinationInputBox().sendKeys(destination);
    }

    public void enterDates(String dates) {
        pageObject.getDatesInputBox().sendKeys(dates);
    }

    public void enterDepartures(String departures) {
        pageObject.getDeparturesInputBox().sendKeys(departures);
    }

    public void clickOnDestinationIcon() {
        pageObject.getDestinationIcon().click();
    }

    public void clickOnSostenibilitaLink() {
        WebElement sostenibilitaLink = pageObject.getSostenibilitaLink();
        sostenibilitaLink.click();
    }

    public void clickMenuElement() {
        WebElement menuElement = pageObject.getMenuElement();
        menuElement.click();
    }
    public void clickSearchButton() {
        pageObject.getSearchButton().click();
    }

    public void selectChecklistItem(int index) {
        pageObject.getCheckboxLabel(index).click();
    }

    public String getChecklistItemText(int index) {
        return pageObject.getCheckboxLabelText(index).getText();
    }

    public void clickDisagreeButton() {
        pageObject.getDisagreeButton().click();
    }

    public void clickAgreeButton() {
        pageObject.getAgreeButton().click();
    }

}

