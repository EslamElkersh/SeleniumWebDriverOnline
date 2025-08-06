package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

import static org.testng.Assert.assertEquals;

public class NavigateTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goToURl("https://www.google.com/");
    }
    @Test
    public void testSwitchToTab(){
        var newWindowPage = homePage.clickMultipleWindows().clickLink();
        getWindowManager().switchToTab("New Window");
        assertEquals(newWindowPage.getText(),"New Window",
                "You are in the wrong tab");
    }
}
