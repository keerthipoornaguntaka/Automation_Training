package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElements {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        highlight(driver, driver.findElement(By.id("user-name")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.name("password")));
        Thread.sleep(2000);
        driver.findElement(By.className("login_logo")).click();

        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.tagName("form")));
        Thread.sleep(2000);
        highlight(driver, driver.findElement(By.xpath("//div[@class='form_column']")));
        Thread.sleep(2000);
        //highlight(driver, driver.findElement(By.xpath("//div[@class='login' or @data-test='login-container']")));
        //Thread.sleep(2000);
        highlight(driver, driver.findElement(By.xpath("//div[@class='login_wrapper' and @data-test='login-container']")));
        Thread.sleep(2000);
        driver.quit();
    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
    }

}