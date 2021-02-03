package com.trycloud.test.base;

import com.trycloud.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Login2 {

    WebDriver driver;

    //Test case #1 - verify user login successfully
    // 1.Navigate to login page http://qa.trycloud.net/index.php/login?clear=1


    // 2.Enter valid username
    // 3.Enter valid password
    // 4.Click login button
    // 5.Verify the URL is chawed to homepage’s url
    // (Put this test case in testBase class with an annotation so it runs for all the test case)


    @BeforeMethod
    public void setupMethod() {
        //open browser
        driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test_login() {

        ArrayList<String> userName = new ArrayList<String>(Arrays.asList("User9", "User39",
                "User69", "User99"));

        String password = "Userpass123";

        for (String each : userName) {

            driver.findElement(By.name("user")).sendKeys(each);
            driver.findElement(By.name("password")).sendKeys(password);

            //to click login button
            driver.findElement(By.id("submit-form")).click();


            //  Thread.sleep(2000);

            String expectedURL = "http://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=8133";
            String actualURL = driver.getCurrentUrl();

            driver.findElement(By.id("expandDisplayName")).click();
            driver.findElement(By.id("logout")).click();


            Assert.assertEquals(actualURL, expectedURL);


        }

    }
}