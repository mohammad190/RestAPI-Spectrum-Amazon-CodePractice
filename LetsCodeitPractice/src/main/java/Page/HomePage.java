package Page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = ".//a[contains(text(), 'Practice')]")
    WebElement Practice_Btn;

    public void practiceBTN(){
        Practice_Btn.click();
    }
}
