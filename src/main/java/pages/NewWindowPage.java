package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    private WebDriver driver;
    private By newWindowText = By.tagName("h3");
    public NewWindowPage(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(newWindowText).getText();
    }
}
