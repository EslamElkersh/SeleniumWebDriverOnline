package modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalsTests extends BaseTests {
    @Test
    public void testModals(){
        var entryAdPage =homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryAdPage.closeModal();
        entryAdPage.clickOnLink();
        assertEquals(entryAdPage.getText(),"Entry Ad",
                "The Modal wasn't closed");

    }
}
