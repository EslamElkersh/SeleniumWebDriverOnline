package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    public List<String > getSelectedOptions(){
        List<WebElement> optionsElements = findDropdownElement().getAllSelectedOptions();
        List<String> optionsText = new ArrayList<>();
        for(WebElement element:optionsElements){
            optionsText.add(element.getText());
        }
        return optionsText;
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
