package com.sdet.auto.google;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {

    private WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    public void clickRejectButton(){
        WebElement rejectButton = pageObject.getRejectButton();
        rejectButton.click();
    }

    public void clickAcceptButton(){
        WebElement acceptButton = pageObject.getAcceptButton();
        acceptButton.click();
    }

    public void inputQuery(String query) {
        WebElement inputQueryField = pageObject.getInputQueryField();
        inputQueryField.sendKeys(query);
    }

    public void inputQuery2(String query) {
        WebElement inputQueryField = pageObject.getInputQueryField();
        inputQueryField.sendKeys(query);

        // Click anywhere on the page to close the popup
        Actions action = new Actions(driver);
        action.moveByOffset(10, 10).click().build().perform();
    }

    public void clickSearchButton1() {
        WebElement searchButton1 = pageObject.getSearchButton1();
        searchButton1.click();
    }

    public void clickSearchButton2() {
        WebElement searchButton1 = pageObject.getSearchButton2();
        searchButton1.click();
    }

}

