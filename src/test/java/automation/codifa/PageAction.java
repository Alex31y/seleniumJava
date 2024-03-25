package automation.codifa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAction {
    private final WebDriver driver;
    private PageObject pageObject;

    // Constructor for PageAction class
    public PageAction(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
    }

    // Click on the "Farmaci" link button
    public void clickFarmaciLinkButton(){
        pageObject.getFarmaciLinkButton().click();
    }

    // Click on the "Parafarmaci" link button
    public void clickParafarmaciLinkButton(){
        pageObject.getParafarmaciLinkButton().click();
    }

    // Click on the "Integratori" link button
    public void clickIntegratoriLinkButton(){
        pageObject.getIntegratoriLinkButton().click();
    }

    // Click on the "Principi Attivi" link button
    public void clickPrincipiAttiviLinkButton(){
        pageObject.getPrincipiAttiviLinkButton().click();
    }

    // Click on the "Farmaci Veterinari" link button
    public void clickFarmaciVeterinariLinkButton(){
        pageObject.getFarmaciVeterinariLinkButton().click();
    }

    // Click on the "Alimenti Veterinari" link button
    public void clickAlimentiVeterinariLinkButton(){
        pageObject.getAlimentiVeterinariLinkButton().click();
    }
}