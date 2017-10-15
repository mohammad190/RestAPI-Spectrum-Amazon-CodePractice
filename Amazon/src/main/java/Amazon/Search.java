package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement ClickSearchBTN;

    public void searchFeatures(String items, String items1,String items2,String items3,String items4,String items5) {
        ClickSearchBTN.sendKeys(items,items1,items2,items3,items4,items5);
    }

//    public void searchFeatures1(String items1) {
//        ClickSearchBTN.sendKeys(items1);
//    }
//
//    public void searchFeatures2(String items2) {
//        ClickSearchBTN.sendKeys(items2);
//    }
//
//    public void searchFeatures3(String items3) {
//        ClickSearchBTN.sendKeys(items3);
//    }
//    public void searchFeatures4(String items4){
//        ClickSearchBTN.sendKeys(items4);
//    }
//    public void searchFeatures5(String items5){
//        ClickSearchBTN.sendKeys(items5);
//    }

}
