package PoundLandFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.SeleniumActions;

public class HomePage {
    SeleniumActions seleniumActions;

    public HomePage(WebDriver driver){
        seleniumActions=new SeleniumActions(driver);
    }

    By captchaButton=By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]");
    By productSearch=By.xpath("//input[@id='search']");
    By suggestionsProduct=By.xpath("(//ul[contains(@id,'acList')]/li/a)[1]");
    By searchIcon=By.xpath("//button[@type='submit' and @title='Search']");
    By productText=By.xpath("//span[contains(@class,'item-name')]/a");
    By productPrice=By.xpath("//span[@class='decimal']/../parent::span");
    By addButton=By.xpath("//button[@type='submit' and @title='Add']/span");

    public void clickOnCaptchaButton(){
        seleniumActions.clickOnElement(captchaButton);
    }
    public void clickOnProductSearchBar(){
        seleniumActions.enterValue(productSearch,"clothing");
    }
    public void clickOnSuggestionItem(){
        seleniumActions.clickOnElement(suggestionsProduct);
    }
    public void clickOnSearchIcon(){
        seleniumActions.clickOnElement(searchIcon);
    }
    public String getProductText(){
        return seleniumActions.getTextMessage(productText);
    }
    public String getProductPrice(){
        return seleniumActions.getFirstProductData(productPrice);
    }
    public void clickOnAddButton(){
        seleniumActions.clickOnElement(addButton);
    }
}