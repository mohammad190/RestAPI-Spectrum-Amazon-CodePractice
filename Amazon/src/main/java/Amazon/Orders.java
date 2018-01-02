package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Orders extends CommonAPI {

    @FindBy(linkText = "Orders")
    WebElement Click_orders;

    @FindBy(id = "ap_email")
    WebElement Click_Email;

    @FindBy(id = "ap_password")
    WebElement Click_Passwrd;

    @FindBy(id = "signInSubmit")
    WebElement submitButton;

    @FindBy(xpath = ".//input[@type='checkbox']")
    WebElement CheckBox;

    public void OrdersF(String email, String password) throws InterruptedException, IOException {
        Click_orders.click();
        Thread.sleep(300);
        //waitUntilClickable(Click_orders);
        Click_Email.sendKeys(email);
        Thread.sleep(300);
        Click_Passwrd.sendKeys(password);
        Thread.sleep(300);
        submitButton.click();
        Thread.sleep(300);
        CheckBox.click();
        Thread.sleep(300);




    }
}
