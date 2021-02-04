package com.trycloud.tests.Login;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class InvalidLogin extends TestBase {
    @Test// wrong password
    public void invalidLogin() {
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin = driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User99");

        WebElement passwordLogin = driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass3");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println(url);
        System.out.println(title);


    }

    @Test// wrong username
    public void invalidLogin2() {
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin = driver.findElement(By.id("user"));
        usernameLogin.sendKeys("UserABC");

        WebElement passwordLogin = driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println(url);
        System.out.println(title);

    }


    @AfterClass
    public void tearDown() {
        driver.close();
    }
}