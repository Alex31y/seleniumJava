package automation.MSCloginPage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    // Method to retrieve the text element with id "text"
    public WebElement getTextElement(){
        return driver.findElement(By.id("text"));
    }

    // Method to retrieve the link element within the text
    public WebElement getPartnerLink(){
        return driver.findElement(By.cssSelector("#text a.didomi-notice-view-partners-link-in-text"));
    }

    // Method to retrieve the learn more button element
    public WebElement getLearnMoreButton(){
        return driver.findElement(By.id("didomi-notice-learn-more-button"));
    }

    // Method to retrieve the disagree button element
    public WebElement getDisagreeButton(){
        return driver.findElement(By.id("didomi-notice-disagree-button"));
    }

    // Method to retrieve the agree button element
    public WebElement getAgreeButton(){
        return driver.findElement(By.id("didomi-notice-agree-button"));
    }
}