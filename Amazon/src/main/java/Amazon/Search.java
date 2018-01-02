package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement ClickSearchBTN;

    public void searchFeatures() throws InterruptedException {
        List<String> item = new ArrayList<>();

        item.add("Books");
        item.add("Electronics");
        item.add("Furniture");

        for(String name : item){
            ClickSearchBTN.sendKeys(name);
            Thread.sleep(2000);
            ClickSearchBTN.clear();
        }
    }
}
