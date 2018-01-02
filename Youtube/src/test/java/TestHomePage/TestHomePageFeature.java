package TestHomePage;

import HomePage.HomePageFeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePageFeature extends CommonAPI {

    @Test
    public void FeatureHomePage() throws InterruptedException, IOException {
        HomePageFeatures homePageFeatures = PageFactory.initElements(driver,HomePageFeatures.class);
        homePageFeatures.YoutubeAppsFea();
        //takeScreenShot(driver,"Take Screenshot","C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\Youtube\\screenshots\\");
    }
}
