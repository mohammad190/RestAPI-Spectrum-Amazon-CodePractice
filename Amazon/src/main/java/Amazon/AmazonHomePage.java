package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends CommonAPI {

    @FindBy(linkText = "Today's Deals")
    WebElement Click_TodaysDeals;

    @FindBy(linkText = "Sell")
    WebElement Click_Sell;

    public void TodayDealsFeatures(){
        Click_TodaysDeals.click();
        Click_Sell.click();


    }
}
