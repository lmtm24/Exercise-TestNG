package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DetailsPage extends BasePage{

    public DetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "span#priceblock_ourprice")
    WebElement detailPrice;
    @FindBy(css ="[id='add-to-cart-button']")
    WebElement addToCartButton;
    @FindBy(css = "a#hlb-view-cart-announce")
    WebElement cartButton;
    @FindBy(css = "span#attach-sidesheet-view-cart-button  .a-button-input")
    WebElement cartButton2;


    public void compareGalaxyPrices() throws IOException {
        BufferedReader reader;
        String line = "";

            reader = new BufferedReader(new FileReader("out.txt"));
            line = reader.readLine();
            System.out.println("Details"+ line);

    }

    public void clickAddCartButton() {
         click(addToCartButton);
    }
    public void clickCartButton(){
        click(cartButton);
    }
    public void clickCartButton2(){
        click(cartButton2);
    }


}

