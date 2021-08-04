package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-action-delete .a-color-link")
    WebElement deleteButton;


    public void clickDelete(){
        click(deleteButton);
    }
}
