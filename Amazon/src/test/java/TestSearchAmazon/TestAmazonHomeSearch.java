package TestSearchAmazon;

import Amazon.SearchHomePage.SearchAmazonHomepage;
import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAmazonHomeSearch extends CommonAPI {

    @Test
    public void testMethod() throws Exception {
        SearchAmazonHomepage searchAmazonHomepage = PageFactory.initElements(driver,SearchAmazonHomepage.class);
        searchAmazonHomepage.test();
        test.log(LogStatus.INFO,"Execute the test cases");
    }
}
