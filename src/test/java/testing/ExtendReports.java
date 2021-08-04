package testing;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {



    public void setUp(){

    }


    public static void main(String args[]) {



        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtendReport.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Validate Search Result", "SAMSUNG Galaxy Note 20");
    }
}
