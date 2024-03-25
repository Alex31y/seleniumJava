package com.sdet.auto.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getLoginForm() {
        return driver.findElement(By.id("kc-form-login"));
    }

    public WebElement getUsernameInput() {
        return getLoginForm().findElement(By.id("username"));
    }

    public WebElement getPasswordInput() {
        return getLoginForm().findElement(By.id("password"));
    }

    public WebElement getPasswordVisibilityButton() {
        return getPasswordInput().findElement(By.xpath("./following-sibling::button"));
    }

    public WebElement getSignInButton() {
        return getLoginForm().findElement(By.id("kc-login"));
    }

    public WebElement getErrorMessage() {
        return getLoginForm().findElement(By.id("input-error"));
    }

}