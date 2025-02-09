package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class GetODI {
    WebDriver driver;

    @Test
    public void launch() {
        driver = new ChromeDriver();
        driver.get("https://www.espncricinfo.com/");
        List<String> elements = new ArrayList<>();
        List<WebElement> firstElement = driver.findElements(By.xpath("//span[contains(text(),'1st ODI')]"));

        for(int i=0;i<firstElement.size();i++)
            elements.add(firstElement.get(i).getText());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
