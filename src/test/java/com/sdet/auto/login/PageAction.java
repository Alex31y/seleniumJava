package com.sdet.auto.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }


    public void enterUsername(String username) {
        pageObject.getUsernameInput().sendKeys(username);
    }

    public void enterPassword(String password) {
        pageObject.getPasswordInput().sendKeys(password);
    }

    public void togglePasswordVisibility() {
        pageObject.getPasswordVisibilityButton().click();
    }

    public void clickSignInButton() {
        pageObject.getSignInButton().click();
    }

    public String getErrorMessageText() {
        return pageObject.getErrorMessage().getText();
    }

    // Add more action methods as needed for specific tasks or flows on the website

}

