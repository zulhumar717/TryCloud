package com.trycloud.tests;

import com.google.common.base.Verify;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccessFiles3 extends TestBase {

   @Test
    public void testVerifyFilesModule() {
        //1. Login as a user
        //      logged in with BeforeMethod
        //2. Verify the page tile is Files module’s tile
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Files - Trycloud";
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Titles don't match. Test FAILED.");
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
    }

    @Test
    public void testSelectUploadedFile() {
        //1. Login as a user
        //      logged in with BeforeMethod
        //(Pre-condition: there should be at least 2 files are uploaded the page)
        WebElement addFile = driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        addFile.click();
        WebElement uploadFile = driver.findElement(By.xpath("//span[@class='svg icon icon-upload']"));

        String filePath1 = "C:\\Users\\akila\\OneDrive\\Pictures\\agricultural infrastructure icon.jpg";
        String filePath2 = "C:\\Users\\akila\\OneDrive\\Pictures\\baby-carriage-icon-260nw-622768103.png";

        uploadFile.sendKeys(filePath1);
        addFile.click();
        uploadFile.sendKeys(filePath2);

        //2. Click the top left checkbox of the table
        driver.findElement(By.xpath("//label[@for='select_all_files']")).click();

        //3. Assert all the files are selected
        WebElement file1Check = driver.findElement(By.xpath("//tr[@class='appear selected']"));
        WebElement file2Check = driver.findElement(By.xpath("//tr[@class='appear mouseOver selected']"));
        Assert.assertTrue(file1Check.isSelected()&&file2Check.isSelected(), "Files not selected. Test FAILED.");

    }


}
