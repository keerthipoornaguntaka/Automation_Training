package AutomationTestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SeleniumActions {
    private WebDriver driver;

    public SeleniumActions(WebDriver driver){
        this.driver = driver;
    }
    public String getTextMessage(WebElement element){
        return element.getText();
    }
    public String getTextMessage(By by){
        return driver.findElement(by).getText();
    }
    public void clickOnElement(WebElement element){
        element.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void enterValue(WebElement element, String data){
        element.sendKeys(data);
    }
    public void enterValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
}