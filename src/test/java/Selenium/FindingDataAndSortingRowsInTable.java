package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

public class FindingDataAndSortingRowsInTable {
    WebDriver driver;

    @BeforeClass
    public void initializeBrowser()
    {
        driver = new ChromeDriver();
    }

    @Test
    public void getDataUsingFirstName(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window();
        String firstName="Cierra";
        List<WebElement> element=driver.findElements(By.xpath("//td[@scope='row' and contains(text(),'"+firstName+"')]/parent::tr/td[not(a)]"));
        List<String> data=new ArrayList<>();
        for (int i=0;i<element.size();i++){
            data.add(element.get(i).getText());
        }
        System.out.println(data);
    }
    @Test
    public void getColumnDataAndSortInAscOrder() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window();
        List<WebElement> firstNameCol = driver.findElements(By.xpath("//th[text()='First Name']/../../..//tbody/tr/td[1]"));
        List<String> firstNamesData = new ArrayList<>();
        for (int i = 0; i < firstNameCol.size(); i++) {
            firstNamesData.add(firstNameCol.get(i).getText());
        }
        Collections.sort(firstNamesData);
        System.out.println("First Names in Table " +firstNamesData);

    }

}
