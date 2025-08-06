package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;
    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigation = driver.navigate();
    }
    public void goBack(){
        navigation.back();
    }
    public void goForward(){
        navigation.forward();
    }
    public void goToURl(String url){
        navigation.to(url);
    }
    public void refreshPage(){
        navigation.refresh();
    }
    public void switchToTab(String title){
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("No of Tabs" + windowHandles.size());
        for(String windowHandle:windowHandles){
            System.out.println(windowHandle);
        }
        for(String windowHandle :windowHandles){
            driver.switchTo().window(windowHandle);
            if(title.equals(driver.getTitle())){
                break;
            }
        }
    }
}
