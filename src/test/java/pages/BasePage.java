package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement locator){
        locator.click();
    }
    public void type(String text, WebElement locator){
        locator.sendKeys(text);
        locator.sendKeys(Keys.ENTER);
    }
    public String getText(WebElement element){
        String text=element.getText();
        return text;
    }


}
