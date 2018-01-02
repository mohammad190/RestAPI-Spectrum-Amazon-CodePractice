package TestHomePage;

import HomePage.HomePageWhatWeDo;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePageWhatWeDo extends CommonAPI{

    @Test
    public void whatWeDo() throws InterruptedException, IOException {

        HomePageWhatWeDo homePageWhatWeDo = PageFactory.initElements(driver,HomePageWhatWeDo.class);
        homePageWhatWeDo.whatWeDoFeatures();
    }
}
