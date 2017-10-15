package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentReport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static ExtentReports reports;
    public static ExtentTest test;

    public static WebDriver driver;

    @Parameters({"platform", "platformVersion", "browserName", "browserVersion", "url", "pathForReports"})
    @BeforeMethod
    public void setUp(@Optional String platform, @Optional String platformVersion,
                      @Optional String browserName, @Optional String browserVersion,
                      @Optional String url, @Optional String pathForReports) throws Exception {

        get_Local_Driver(platform, browserName, pathForReports);
        driver.manage().window().maximize();
        test.log(LogStatus.INFO, "Windows Maximized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        test.log(LogStatus.INFO, "Navigate to Url");
    }

    public WebDriver get_Local_Driver(String platform, String browserName, String pathForReports) {

        reports = ExtentReport.getInstance(pathForReports);
        test = reports.startTest("Testing");

        if (platform.contains("macOS")) {
            if (browserName.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Driver/geckodriver");
                driver = new FirefoxDriver();
                test.log(LogStatus.INFO, "FireFox Driver Executed For Mac.");
            } else if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Driver/chromedriver");
                driver = new ChromeDriver();

            } else {
                System.err.println("ERROR: Choose from: Firefox/Chrome.");
            }
        } else if (platform.equalsIgnoreCase("win")) {
            if (browserName.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Driver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Driver/chromedriver.exe");
                driver = new ChromeDriver();
                test.log(LogStatus.INFO, "Chrome browser opening");
            } else if (browserName.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.IE.driver", "../Generic/driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (browserName.equalsIgnoreCase("Opera")) {
                System.setProperty("webdriver.opera.driver", "../Generic/driver/operadriver.exe");
                driver = new OperaDriver();
            } else {
                System.err.println("ERROR: Choose from: Firefox/Chrome/IE/Opera.");
            }
        }
        return driver;
    }

    @Parameters({"Path"})
    @AfterMethod
    public void close_Browser(ITestResult testResult, @Optional String directoryPath) throws IOException {

        String path = null;
        String imagePath = null;

        if(testResult.getStatus() != ITestResult.SUCCESS) {
            path = takeScreenShot(driver, testResult.getName(), directoryPath);
            imagePath = test.addScreenCapture(path);
            test.log(LogStatus.PASS, "pass test cases", imagePath);
            driver.quit();
            reports.endTest(test);
            reports.flush();
        } else {
            driver.quit();
            reports.endTest(test);
            reports.flush();
        }
    }
    public String takeScreenShot(WebDriver driver, String fileName, String Path) throws IOException {
        fileName = fileName + ".png";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(sourceFile, new File(Path + fileName));
        String destination = Path + fileName;
        return destination;
    }
}
