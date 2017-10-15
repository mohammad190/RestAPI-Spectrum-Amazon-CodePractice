package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAmazon extends CommonAPI {

    @FindBy(id = "nav-your-amazon")
    WebElement ClickYourAmazon;

    @FindBy(id = "ap_email")
    WebElement ClickEmail;

    @FindBy(id = "ap_password")
    WebElement ClickPassword;

    @FindBy(id = "signInSubmit")
    WebElement ClickLogin;


    public void YourAmazonFeatures(String email, String Password){
        ClickYourAmazon.click();
        ClickEmail.sendKeys(email);
        ClickPassword.sendKeys(Password);
        ClickLogin.click();
    }

}
