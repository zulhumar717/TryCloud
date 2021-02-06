package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UserStory2 extends TestBase {


    @Test
    public void tc1_verify_mainmodules_acess(){
        //Test case #1 - verify users access to the main modules
        //1. Login as a user
        //2. Verify the user see the following modules:
            //locate modules

            // Files
        BrowserUtils.sleep(3);
      WebElement fileTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[2]"));

            // Galleries
        WebElement galleriesTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[3]"));
            // Activity
        WebElement activityTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[4]"));
            //Talk
        WebElement talkTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[5]"));
            //Contacts
        WebElement contactsTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[6]"));
            //Calendar
        WebElement calendarTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[8]"));
            //Note
        WebElement notesTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[2]/a"));

            //verify modules are displayed
        List<WebElement> allModules = new ArrayList<>();

        allModules.add(fileTab);
        allModules.add(galleriesTab);
        allModules.add(activityTab);
        allModules.add(contactsTab);
        allModules.add(calendarTab);
        //allModules.add(notesTab);

        for (WebElement each: allModules) {
            Assert.assertTrue(each.isDisplayed(),each+"is not displayed");

        }


        // ( Expected module name: Galleries
        //  Actual module name : Photos )
    }

}
