package TestPage;

import Page.HomePage;
import Page.PracticePage;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPracticePage extends CommonAPI {


    @Test
    public void practicePageFeatures() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.practiceBTN();
        PracticePage pg = PageFactory.initElements(driver,PracticePage.class);
        test.log(LogStatus.INFO,"Practice test pass");
        pg.RadioButton();
        pg.SelectCar();
        pg.SelectFruit();
        pg.CarFeatures();
         pg.NewWindow();
        pg.openTab();
        pg.handleDisplayedElem();
        pg.cancelAlert();
        pg.okAlert();
    }
}
