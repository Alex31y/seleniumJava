package automation.obiettivo;

import org.openqa.selenium.WebDriver;

public class PageAction {

    private final WebDriver driver;
    private PageObject pageObject;

    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }


}

