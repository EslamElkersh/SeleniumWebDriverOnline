package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWait(){
        var ex1DynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        ex1DynamicLoadingPage.clickStartButton();
        assertEquals(ex1DynamicLoadingPage.getText(),"Hello World!",
                "The text is incorrect");

    }

    @Test
    public void testWaits2(){
        var ex2Page = homePage.clickDynamicLoading().clickExample2Link();
        ex2Page.clickStartButton();
        assertEquals(ex2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
