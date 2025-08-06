package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testFrames(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT",
                "The text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM",
                "The text is incorrect");

    }
}
