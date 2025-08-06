package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1Link = By.partialLinkText("Example 1");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public Ex1DynamicLoadingPage clickExample1(){
        driver.findElement(example1Link).click();
        return new Ex1DynamicLoadingPage(driver);
    }
    public DynamicLoadingEx2Page clickExample2Link(){
        driver.findElement(By.partialLinkText("Example 2")).click();
        return new DynamicLoadingEx2Page(driver);
    }
}
