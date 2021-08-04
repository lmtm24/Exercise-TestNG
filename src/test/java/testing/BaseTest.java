package testing;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest implements Setup {

    WebDriver driver;
    static ExtentReports extent;
    static ExtentHtmlReporter htmlReporter;





    @BeforeTest
    public void driverSetup() {
        String url = "https://www.amazon.com.mx/";
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
    }


    @BeforeSuite
    public void setUp(){

        htmlReporter  = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

    }

    public void getTitle() {

    }

    @AfterSuite
    public void tearDown(){
        extent.flush();
    }



    @AfterTest
    public void quit() {
      //driver.quit();
    }
}
