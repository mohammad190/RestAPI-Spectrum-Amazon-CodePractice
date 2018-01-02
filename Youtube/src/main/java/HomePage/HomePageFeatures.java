package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFeatures extends CommonAPI {

    @FindBy(xpath = ".//button[@aria-label='YouTube apps']")
    WebElement YoytubeApps;

    public void YoutubeAppsFea() throws InterruptedException {
        YoytubeApps.click();
        Thread.sleep(5000);
    }
}
