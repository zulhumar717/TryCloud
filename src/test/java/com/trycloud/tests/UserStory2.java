package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory2 extends TestBase {


    @Test
    public void tc1_verify_mainmodules_acess(){
        //Test case #1 - verify users access to the main modules
        //1. Login as a user
        //2. Verify the user see the following modules:
            // Files
        BrowserUtils.sleep(3);
      WebElement fileTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[1]/a"));

            // Galleries
            // Activity
        WebElement activityTab = driver.findElement(By.xpath("//*[@id='appmenu']/li[2]/a"));
            //Talk
            //Contacts
            //Calendar
            //Note

        // ( Expected module name: Galleries
        //  Actual module name : Photos )
    }

}
