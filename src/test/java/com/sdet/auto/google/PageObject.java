package com.sdet.auto.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
        this.parentElement = driver.findElement(By.className("GzLjMd"));
    }

    public WebElement getRejectButton(){
        return parentElement.findElement(By.id("W0wltc"));
    }

    public WebElement getAcceptButton(){
        return parentElement.findElement(By.id("L2AGLb"));
    }

    public WebElement getInputQueryField() {
        return driver.findElement(By.name("q"));
    }

    public WebElement getSearchButton1() {
        return driver.findElement(By.name("btnK"));
    }

    public WebElement getSearchButton2() {
        return driver.findElement(By.name("btnI"));
    }

}