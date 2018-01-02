package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class AmazonHomePage extends CommonAPI {

    @FindBy(xpath = ".//a[@id='nav-link-accountList']")
    WebElement Click_Hello_SignIn;

    @FindBy(id = "ap_email")
    WebElement ClickEmail;

    @FindBy(id = "ap_password")
    WebElement ClickPassword;

    @FindBy(id = "signInSubmit")
    WebElement ClickSignBTN;



    public void LoginFeatures(String email, String password) {
        waitUntilClickable(Click_Hello_SignIn);
       Click_Hello_SignIn.click();
       ClickEmail.sendKeys(email);
       ClickPassword.sendKeys(password);
       ClickSignBTN.click();
    }
}
