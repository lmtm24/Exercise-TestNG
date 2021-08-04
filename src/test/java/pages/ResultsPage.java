package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileWriter;
import java.io.IOException;

public class ResultsPage extends BasePage{


    public ResultsPage(WebDriver driver) {
        super(driver);
       // PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html//div[@id='search']//div[@class='s-desktop-content s-opposite-dir sg-row']/div[1]/div[@class='sg-col-inner']/span[3]/div[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]/div[@class='sg-col-inner']/span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results']//div[@class='a-section a-spacing-medium']")
    WebElement GalaxyNote;
//    @FindBy(xpath = "/html//div[@id='search']/div[@class='s-desktop-width-max s-opposite-dir']/div[@class='s-desktop-content s-opposite-dir sg-row']/div/div[@class='sg-col-inner']/span[3]/div[@class='s-main-slot s-result-list s-search-results sg-row']/div//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results']//div[@class='a-section a-spacing-none']/div/div/a[@href='/SAMSUNG-Galaxy-SM-N985F-DS-Mystic/dp/B08FVLNQ3M/ref=sr_1_1?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=SAMSUNG+Galaxy+Note+20&qid=1627586535&sr=8-1']/span[@class='a-price']//span[@class='a-price-whole']")
  //  WebElement
    @FindBy(css = "[cel_widget_id='MAIN-SEARCH_RESULTS-1'] .a-price-whole")
    WebElement GalaxyNotePrice;
    @FindBy(css = "[cel_widget_id='MAIN-SEARCH_RESULTS-1']")
    WebElement GalaxyNoteS20;
    @FindBy(css = "[cel_widget_id='MAIN-SEARCH_RESULTS-1'] .a-price-whole")
    WebElement GalaxyNotePriceS20;


    public void ValidateGalaxyResult(String expectedResult){
        //System.out.println(getText(GalaxyNote));
        Assert.assertTrue(getText(GalaxyNote).contains(expectedResult));
    }
    public void ValidateGalaxyResultS20(String expectedResult){
        System.out.println(getText(GalaxyNoteS20));
        Assert.assertTrue(getText(GalaxyNoteS20).contains(expectedResult));
    }



    public void getPrice() throws IOException {
        System.out.println(getText(GalaxyNotePrice));
        String price = getText(GalaxyNotePrice);
        FileWriter fw = new FileWriter("out.txt");
        fw.write(price);
        fw.close();

    }
    public void getPriceS20() throws IOException {
        System.out.println(getText(GalaxyNotePriceS20));
        String price = getText(GalaxyNotePriceS20);
        FileWriter fw = new FileWriter("out.txt");
        fw.write(price);
        fw.close();

    }


    public void clickGalaxyNote(){
        click(GalaxyNote);

    }
    public void clickGalaxyNoteS20(){
        click(GalaxyNoteS20);
    }


}
