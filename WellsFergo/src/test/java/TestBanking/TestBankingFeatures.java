package TestBanking;

import Banking.BankingFeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBankingFeatures extends CommonAPI {

    @Test
    public void BankingFea() throws InterruptedException, IOException {
        BankingFeatures BF = PageFactory.initElements(driver, BankingFeatures.class);
        BF.BankingFeatures("89523");
        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\WellsFergo\\screenshots\\");

    }
}
