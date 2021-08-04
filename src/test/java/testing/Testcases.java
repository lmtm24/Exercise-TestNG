package testing;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.ResultsPage;

import java.io.IOException;

public class Testcases extends BaseTest {

    HomePage homePage;
    ResultsPage resultsPage;
    DetailsPage detailsPage;
    CartPage cartPage;

    @BeforeTest
    public void Init(){
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
        detailsPage = new DetailsPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void FirstTestCase() throws IOException {
        ExtentTest test = extent.createTest("FirstTest","SAMSUNG Galaxy Note 20");
        // log(Status, details)
        test.log(Status.INFO, "Test Running");

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

        String item = "SAMSUNG Galaxy Note 20";
        homePage.search(item);
        resultsPage.ValidateGalaxyResult(item);
        test.pass("SAMSUNG Galaxy Note 20 found",  MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        resultsPage.getPrice();
        resultsPage.clickGalaxyNote();
        detailsPage.compareGalaxyPrices();
        test.pass("Prices are equals");
        detailsPage.clickAddCartButton();
        detailsPage.clickCartButton();
        cartPage.clickDelete();
        test.pass("Item has been deleted");

    }

    @Test
    public void SecondTetCase() throws IOException {
        ExtentTest test = extent.createTest("Second Test","SAMSUNG Galaxy S20 FE 5G");
        // log(Status, details)
        test.log(Status.INFO, "Test Running");

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

        String item2 = "SAMSUNG Galaxy S20 FE 5G";
        homePage.search(item2);
        resultsPage.ValidateGalaxyResultS20(item2);
        test.pass("SAMSUNG Galaxy S20 FE",  MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        resultsPage.getPriceS20();
        resultsPage.clickGalaxyNoteS20();
        detailsPage.compareGalaxyPrices();
        test.pass("Prices are equals");
        detailsPage.clickAddCartButton();
        detailsPage.clickCartButton2();
        cartPage.clickDelete();
        test.pass("Item has been deleted");
    }

    }










