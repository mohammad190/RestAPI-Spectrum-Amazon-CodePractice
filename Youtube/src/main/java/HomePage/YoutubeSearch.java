package HomePage;

import base.CommonAPI;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class YoutubeSearch extends CommonAPI {

    @FindBy(xpath = ".//div[@id='search-input']")
    WebElement ClickSearch;

    public void SearchFeatures() throws InterruptedException {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bangla");
        names.add("Hindi");
        names.add("American");
        names.add("HipHop");

       for(String name:names){
           ClickSearch.sendKeys(name);
           ClickSearch.clear();
       }

    }

   /* public void featureSearch() throws InterruptedException {

        List<String> items = new LinkedList<>();
        items.add("Laptop");
        items.add("Monitor");
        items.add("Mobile");

        for(String item : items) {
            searchOption.sendKeys(item);
            Thread.sleep(2000);
            searchOption.clear();
        }
    }*/
}
