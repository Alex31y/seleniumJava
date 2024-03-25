
package automation.codifa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatore {

    private WebDriver driver;
    private PageAction pageAction;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.codifa.it/");
        pageAction = new PageAction(driver);
    }

    @Test
    public void testClickFarmaciLinkButton(){
        try {
            pageAction.clickFarmaciLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testClickParafarmaciLinkButton(){
        try {
            pageAction.clickParafarmaciLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testClickIntegratoriLinkButton(){
        try {
            pageAction.clickIntegratoriLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testClickPrincipiAttiviLinkButton(){
        try {
            pageAction.clickPrincipiAttiviLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testClickFarmaciVeterinariLinkButton(){
        try {
            pageAction.clickFarmaciVeterinariLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testClickAlimentiVeterinariLinkButton(){
        try {
            pageAction.clickAlimentiVeterinariLinkButton();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
