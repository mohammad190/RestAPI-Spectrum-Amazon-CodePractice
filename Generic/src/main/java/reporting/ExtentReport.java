package reporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {

        public static ExtentReports getInstance(String reportFileName) {
            ExtentReports extent;
            String Path = reportFileName + ".html";
            extent = new ExtentReports(Path, true);
            extent.addSystemInfo("Host", "Mohammad Ali").addSystemInfo("Environment", "QA")
                    .addSystemInfo("Framework", "Hybrid");
            return extent;
        }
}



