package PoundLandFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PLBase {

    public WebDriver driver;

    @BeforeSuite
    public void initializeDrivers(){
        driver = new EdgeDriver();
        driver.manage().window();
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.poundland.co.uk/");
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }
}