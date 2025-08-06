package jsDialogues;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JSDialoguesTests extends BaseTests {
    @Test
    public void testAlerts(){
        var javaScriptAlertsPage =homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(),"You successfully clicked an alert",
                "The text is incorrect");
    }
    @Test
    public void testConfirm(){
        var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.alert_getText();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm",
                "The text is incorrect");
    }
    @Test
    public void testPrompt(){
        String text = "Route";
        var javaScriptAlertsPage =homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerPrompt();
        javaScriptAlertsPage.alert_setText(text);
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(),"You entered: "+text);
    }
}
