package E_Shope_DemoAutomation.utils.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports() {
        final SimpleDateFormat sdf = new SimpleDateFormat("-yyyy-MM-dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String currenttimestamp =sdf.format(timestamp);
//        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report"+currenttimestamp+".html");
        reporter.config().setReportName("Demo-Ecommerce Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Blog Name", "DemoAutomationExercise");
        extentReports.setSystemInfo("Author", "Worrier Automation Team");
        return extentReports;
    }
}
