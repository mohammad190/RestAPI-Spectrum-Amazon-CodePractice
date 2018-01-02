package TestAmazon;

        import Amazon.Search;
        import base.CommonAPI;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.Test;

        import java.io.IOException;

public class TestSearch extends CommonAPI {

    @Test
    public void SaearchFeature() throws InterruptedException, IOException {
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchFeatures();

        takeScreenShot(driver,"AfterTest","C:\\Users\\sujon\\IdeaProjects\\TuesdayGroupAutomation\\Amazon\\screenshot\\");

    }

}
