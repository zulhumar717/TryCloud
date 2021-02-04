package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void verify_user_login() {

        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin = driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User39");

        WebElement passwordLogin = driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();


    }

    @AfterMethod
    public void tearDown(){
      //  driver.close();
    }

}
