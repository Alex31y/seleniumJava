package automation.youtubbo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to get the "Reject all" button
    public WebElement getRejectAllButton(){
        return driver.findElement(By.xpath("//button[contains(@aria-label, 'Reject the use of cookies')]"));
    }

    // Method to get the "Accept all" button
    public WebElement getAcceptAllButton(){
        return driver.findElement(By.xpath("//button[contains(@aria-label, 'Accept the use of cookies')]"));
    }
}