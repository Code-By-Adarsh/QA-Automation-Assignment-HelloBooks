package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstances(){
        if (extent == null){
            String reportPath = System.getProperty("user.dir")+"\\Report\\HelloBooksAutomation.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

            spark.config().setDocumentTitle("HelloBooks Automation Assignment");
            spark.config().setReportName("HelloBooks Automation Assignment Report");
            spark.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Automation Tester: ","Adarsh Mishra");
            extent.setSystemInfo("Browser: ","Chrome");
            extent.setSystemInfo("Report: ","HelloBooks Automation Assignment");
        }return extent;
    }
}
