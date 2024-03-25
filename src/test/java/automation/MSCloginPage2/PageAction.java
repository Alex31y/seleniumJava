/*Page Action class to perform web interactions based on Page Object methods*/

package automation.MSCloginPage2;

import org.openqa.selenium.WebDriver;

public class PageAction {
    // Declaring WebDriver and PageObject objects
    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor to initialize WebDriver and PageObject objects
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Method to retrieve and return text from the text element
    public String getTextFromElement(){
        return pageObject.getTextElement().getText();
    }

    // Method to click on the partner link within the text
    public void clickPartnerLink(){
        pageObject.getPartnerLink().click();
    }

    // Method to click on the learn more button
    public void clickLearnMoreButton(){
        pageObject.getLearnMoreButton().click();
    }

    // Method to click on the disagree button
    public void clickDisagreeButton(){
        pageObject.getDisagreeButton().click();
    }

    // Method to click on the agree button
    public void clickAgreeButton(){
        pageObject.getAgreeButton().click();
    }
}