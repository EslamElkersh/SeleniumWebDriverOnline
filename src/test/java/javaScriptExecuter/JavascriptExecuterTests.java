package javaScriptExecuter;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptExecuterTests extends BaseTests {
    @Test
    public void testScrollToElement(){
        var largeAndDeepDomPage = homePage.clickLargeAndDeepDom();
        largeAndDeepDomPage.scrollToTable();
    }
    @Test
    public void testScrollToParagraph(){
        var infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
