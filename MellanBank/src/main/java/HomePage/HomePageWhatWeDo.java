package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class HomePageWhatWeDo extends CommonAPI {

    @FindBy(xpath = ".//a[@data-item='top-level_lvl_1']")
    WebElement ClickWhatWeDo;

    @FindBy(linkText = "Investment Management")
    WebElement ClickInvestManagement;

    @FindBy(xpath = ".//div[@id='select-location']")
    WebElement ClickSelectLocation;

    @FindBy(linkText = "USA")
    WebElement ClickUSA;

    @FindBy(xpath = ".//div[@class='client-type symulate-select']")
    WebElement ClickSelectClient;

    @FindBy(linkText = "Individual Investor")
    WebElement ClickIndividualInvestor;

    @FindBy(linkText = "GO")
    WebElement ClickGO;

    public void whatWeDoFeatures() throws InterruptedException, IOException {
        Actions actions = new Actions(driver);
        WebElement element = ClickWhatWeDo;
        Thread.sleep(10);
        actions.moveToElement(element).perform();

        ClickInvestManagement.click();
        Thread.sleep(10);

        ClickSelectLocation.click();
        Thread.sleep(10);

        ClickUSA.click();
        Thread.sleep(10);

        ClickSelectClient.click();
        Thread.sleep(10);

        ClickIndividualInvestor.click();

        ClickGO.click();
        Thread.sleep(10);

        takeScreenShot(driver, "AfterCheckAllElements", "C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\MellanBank\\screenshots\\");


//        Select select = new Select(ClickSelectLocation);
//        select.selectByValue("Select your location");
//        Thread.sleep(5000);
    }
}
