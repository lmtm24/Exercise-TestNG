package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#twotabsearchtextbox")
    WebElement SearchFieldInput;

    public void search(String text){
        type(text,SearchFieldInput);
    }



}
