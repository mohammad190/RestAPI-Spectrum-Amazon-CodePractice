package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePageFeatures extends CommonAPI {

    @FindBy(xpath = ".//a[@data-item='top-level_lvl_0']")
    WebElement ClickWhoWeAre;

    @FindBy(linkText = "Our Story")
   WebElement ClickOurStory;


    public void whoWeAreFeatures() throws IOException {

        Actions actions = new Actions(driver);
        WebElement element  = ClickWhoWeAre;
        actions.moveToElement(element).perform();
        //ClickOurStory.click();
        takeScreenShot(driver, "AfterCaseStatus", "C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\MellanBank\\screenshots\\");


    }
}
