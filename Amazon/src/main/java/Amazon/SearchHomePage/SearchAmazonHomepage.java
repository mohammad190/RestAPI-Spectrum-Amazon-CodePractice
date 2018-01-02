package Amazon.SearchHomePage;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import datadriven.DataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAmazonHomepage extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;



    //@FindBy(xpath = ".//a[@data-messagebox-name='search']")
    //WebElement searchBar;


    public void test() throws Exception {
        String[] value = DataReader.getDataFromExcelFile("/src/test/resources/Amazon.xlsx", 0);
        test.log(LogStatus.INFO,"Execute the excel value");
        for(int i = 1; i < value.length; i++) {
            Thread.sleep(1000);
            searchBar.click();
            searchBar.sendKeys(value[i]);
            Thread.sleep(1000);
            searchBar.clear();
            Thread.sleep(1000);
            takeScreenShot(driver, "AfterCaseStatus", "../Amazon/screenshot//");
            test.log(LogStatus.INFO,"Execute the excel sheet");
        }
    }
}
