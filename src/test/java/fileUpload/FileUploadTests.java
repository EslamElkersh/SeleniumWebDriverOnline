package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String fileName = "aaaa.txt";
        String absouluteFilePath = "C:\\RouteJavaCourse\\SeleniumWebDriverOnline\\resources\\"+fileName;
        var fileUploadPage =homePage.clickFileUpload();
        fileUploadPage.uploadFile(absouluteFilePath);
        assertEquals(fileUploadPage.getUploadedFileName(),fileName,
                "The file name is incorrect");
    }
}
