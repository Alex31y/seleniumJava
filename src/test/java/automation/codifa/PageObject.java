package automation.codifa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;
    private WebElement parentElement;

    public PageObject(WebDriver driver){
        this.driver = driver;
        // Find the parent element which contains all the link buttons
        this.parentElement = driver.findElement(By.className("content-link-button"));
    }

    // Method to get the "Farmaci" link button
    public WebElement getFarmaciLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/farmaci')]"));
    }

    // Method to get the "Parafarmaci" link button
    public WebElement getParafarmaciLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/parafarmaci')]"));
    }

    // Method to get the "Integratori" link button
    public WebElement getIntegratoriLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/integratori')]"));
    }

    // Method to get the "Principi Attivi" link button
    public WebElement getPrincipiAttiviLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/principi-attivi')]"));
    }

    // Method to get the "Farmaci Veterinari" link button
    public WebElement getFarmaciVeterinariLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/veterinari')]"));
    }

    // Method to get the "Alimenti Veterinari" link button
    public WebElement getAlimentiVeterinariLinkButton(){
        return parentElement.findElement(By.xpath(".//a[contains(@href, '/alimenti-veterinari')]"));
    }
}