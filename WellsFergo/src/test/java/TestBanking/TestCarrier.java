package TestBanking;

import Banking.BankCarrier;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCarrier extends CommonAPI {

   @Test
    public void Carrier() throws IOException {
        BankCarrier BC = PageFactory.initElements(driver,BankCarrier.class);
        BC.CarrierFea();
       takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\WellsFergo\\screenshots\\");
    }
}
