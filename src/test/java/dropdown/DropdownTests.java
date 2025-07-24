package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class DropdownTests extends BaseTests {
    @Test
    public void testDropdown(){
        String option = "Option 1";
        var dropdownPage =homePage.clickDropdown();
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"The size is incorrect");
        assertTrue(selectedOptions.contains(option),"The option is not selected");
    }
}
