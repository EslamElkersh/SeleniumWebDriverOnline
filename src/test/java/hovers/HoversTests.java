package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHovers(){
        var hoversPage =homePage.clickHovers();
        var figureCaption = hoversPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"The caption is not displayed");
        assertEquals(figureCaption.getName(),"name: user1","The name is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile",
                "The link text is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"The link is incorrect");

    }
}
