package TestMenu;

import Menu.Banking;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBanking extends CommonAPI {

    @Test
    public void bankingBOA() throws IOException, InterruptedException {
        Banking banking = PageFactory.initElements(driver, Banking.class);
        banking.menuFeaturesBank("11432","Don");

        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\BankOfAmerica\\screenshots\\");
    }
}
