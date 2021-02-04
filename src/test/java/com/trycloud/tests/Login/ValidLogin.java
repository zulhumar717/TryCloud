package com.trycloud.tests.Login;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ValidLogin extends TestBase {
    @Test
    public void logInTest1() {
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin = driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User39");

        WebElement passwordLogin = driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();

       String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);



        /*String expectedUrl="https://app.trycloud.net/index.php/apps/files/";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);*/




    }

    @Test
    public void logInTest2(){
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin =driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User9");

        WebElement passwordLogin=driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();





    }
    @Test
    public void logInTest3(){
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin =driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User69");

        WebElement passwordLogin=driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();





    }
    @Test
    public void logInTest4(){
        driver.get(ConfigurationReader.getProperty("url"));

        WebElement usernameLogin =driver.findElement(By.id("user"));
        usernameLogin.sendKeys("User99");

        WebElement passwordLogin=driver.findElement(By.id("password"));
        passwordLogin.sendKeys("Userpass123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();




    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    /*As a User i should be able to log in
TEST CASE #1
1.Navigate to login page :http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid user name
3.enter valid passwprd
4.click login button
5.Verify the is chawed to homepage(Put the test in testBase class with an annotation so it runs
for all the test case)*/


}
