package TestHomePage;

import HomePage.HomePageFeatures;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePageFeatures extends CommonAPI{

    @Test
    public void FeaturesWhoweAre() throws IOException {

        HomePageFeatures homePageFeatures = PageFactory.initElements(driver,HomePageFeatures.class);
        homePageFeatures.whoWeAreFeatures();
    }




}
