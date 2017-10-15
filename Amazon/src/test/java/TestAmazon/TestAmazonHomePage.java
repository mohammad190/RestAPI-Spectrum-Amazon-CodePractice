package TestAmazon;

import Amazon.AmazonHomePage;
import Amazon.Search;
import Amazon.YourAmazon;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends CommonAPI {

    @Test
    public void TodayDealsFeature(){

        AmazonHomePage AHP = PageFactory.initElements(driver,AmazonHomePage.class);
        AHP.TodayDealsFeatures();
        Search search = PageFactory.initElements(driver, Search.class);
        search.searchFeatures("Books","Laptop","Dress","Games","Deals","Gifts");

//        search.searchFeatures1("");
//        search.searchFeatures2("Eelectronics");
//        search.searchFeatures3("Phone");
//        search.searchFeatures4("Movie");
//        search.searchFeatures5("Coupons");
        YourAmazon yourAmazon = PageFactory.initElements(driver,YourAmazon.class);
        yourAmazon.YourAmazonFeatures("abcdefgh@gmail.com","abcdedf12345678");
    }
}
