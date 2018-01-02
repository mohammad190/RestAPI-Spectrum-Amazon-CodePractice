package page;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import datadriven.DataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestHomePages extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    //@FindBy(xpath = ".//a[@data-messagebox-name='search']")
    //WebElement searchBar;


    public void test() throws Exception {
        String[] value = DataReader.getDataFromExcelFile("/src/test/resources/SpectrumExcel.xlsx", 0);

        for(int i = 1; i < value.length; i++) {
            Thread.sleep(1000);
            searchBar.click();
            searchBar.sendKeys(value[i]);
            Thread.sleep(1000);
            searchBar.clear();
            Thread.sleep(1000);
            takeScreenShot(driver, "AfterCaseStatus", "../Spectrum/screenshot//");
            test.log(LogStatus.INFO,"Take screen shot after run the method");
        }
    }
}

//C:\Users\sujon\IdeaProjects\TuesdayGroupAutomation\Spectrum\src\test\resources\SpectrumExcel.xlsx
