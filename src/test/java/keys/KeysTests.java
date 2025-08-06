package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
        var keyPressesPage =homePage.clickKeyPresses();
        keyPressesPage.setText(Keys.chord(Keys.SHIFT + "a"));
        assertEquals(keyPressesPage.getText(),"You entered: A",
                "The text is incorrect");
    }
}
