package com.ft.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BasicSelenium {
    public WebDriver driver;

    @BeforeSuite
    public void launchBrowser(){
        driver  = new FirefoxDriver();
    }

    @AfterSuite
    public void killSession(){
        //driver.close();
        driver.quit();
    }

    @BeforeTest
    public void verifyDeleteButtons() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
}