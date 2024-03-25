package automation.obiettivo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

}