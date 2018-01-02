package TestAmazon;

import Amazon.AmazonHomePage;
import Amazon.Search;
import Amazon.YourAmazon;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAmazonHomePage extends CommonAPI {

    @Test
    public void Login() throws IOException {

        AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
        homePage.LoginFeatures("sujondpi@yahoo.com","Sujon123");
        takeScreenShot(driver,"AfterTest","C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\Amazon\\screenshot\\");


    }
}
