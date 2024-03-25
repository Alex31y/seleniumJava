package automation.youtubbo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Action method to click on "Reject all" button
    public void clickRejectAllButton(){
        pageObject.getRejectAllButton().click();
    }

    // Action method to click on "Accept all" button
    public void clickAcceptAllButton(){
        pageObject.getAcceptAllButton().click();
    }
}