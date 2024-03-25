package com.sdet.auto.msc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDestinationInputBox() {
        return driver.findElement(By.cssSelector(".search__fields [automation-id='search-destination']"));
    }

    public WebElement getDatesInputBox() {
        return driver.findElement(By.cssSelector(".search__fields [automation-id='search-dates']"));
    }

    public WebElement getDeparturesInputBox() {
        return driver.findElement(By.cssSelector(".search__fields [automation-id='search-departures']"));
    }
    // il menu a tendina al lato
    public WebElement getHamburgerButton() {
        return driver.findElement(By.className("header__hamburger"));
    }

    public WebElement getSostenibilitaLink() {
        return driver.findElement(By.cssSelector(".menu__item a[href='https://www.msccrociere.it/mondo-msc-crociere/sostenibilita']"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.cssSelector(".search__button button"));
    }

    public WebElement getDestinationIcon() {
        return getDestinationInputBox().findElement(By.cssSelector(".icon--destination-icon"));
    }

    public WebElement getCalendarIcon() {
        return getDatesInputBox().findElement(By.cssSelector(".icon--calendar-icon"));
    }

    public WebElement getDepartsIcon() {
        return getDeparturesInputBox().findElement(By.cssSelector(".icon--departs-icon"));
    }

    public WebElement getChecklist() {
        return driver.findElement(By.className("checklist"));
    }

    public WebElement getChecklistItem(int index) {
        return getChecklist().findElements(By.className("checklist-item")).get(index);
    }

    public WebElement getCheckboxLabel(int index) {
        return getChecklistItem(index).findElement(By.className("checkbox-label"));
    }

    public WebElement getCheckboxLabelText(int index) {
        return getCheckboxLabel(index).findElement(By.className("checkbox-label__text"));
    }

    public WebElement getDisagreeButton() {
        return driver.findElement(By.id("didomi-notice-disagree-button"));
    }

    public WebElement getMenuElement(){
        return driver.findElement(By.cssSelector(".menu__item"));
    }

    public WebElement getAgreeButton() {
        return driver.findElement(By.id("didomi-notice-agree-button"));
    }

}