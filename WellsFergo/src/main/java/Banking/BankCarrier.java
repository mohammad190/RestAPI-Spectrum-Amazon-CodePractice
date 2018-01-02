package Banking;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankCarrier extends CommonAPI {

    @FindBy(linkText = "Careers")
    WebElement Carriers;

    @FindBy(linkText = "No, thanks")
    WebElement NoThaanks;

    public void CarrierFea(){
        Carriers.click();
    }
}
