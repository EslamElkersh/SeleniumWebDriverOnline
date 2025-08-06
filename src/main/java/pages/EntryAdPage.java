package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeElementLocator = By.xpath("//p[text()='Close']");
    private By entryAdLocator = By.xpath("//h3[text()='Entry Ad']");
    private By link = By.id("restart-ad");
    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }
    public void closeModal(){
        driver.findElement(closeElementLocator).click();
    }
    public String getText(){
        return driver.findElement(entryAdLocator).getText();
    }
    public void clickOnLink(){
        driver.findElement(link).click();
    }

}
