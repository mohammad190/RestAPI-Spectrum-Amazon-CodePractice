package TestHomePage;

import HomePage.YoutubeSearch;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestYoutubeSearch extends CommonAPI {

    @Test(enabled = true)
    public void TestFeatures() throws InterruptedException, IOException {
        YoutubeSearch youtubeSearch = PageFactory.initElements(driver,YoutubeSearch.class);
        youtubeSearch.SearchFeatures();
        takeScreenShot(driver,"Take Screenshot","C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\Youtube\\screenshots\\");
    }


}
