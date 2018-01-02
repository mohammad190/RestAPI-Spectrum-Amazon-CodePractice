package Banking;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enroll extends CommonAPI {

    @FindBy(xpath = ".//a[@class='signIn signLockImg']")
    WebElement ClickEnroll;

    @FindBy(id = "ssn")
    WebElement ClickSSN;

    @FindBy(css = ".icon.ion-android-checkmark")
    WebElement CheckBox;

    @FindBy(id = "accountNumber")
    WebElement AccountNumberBox;

    @FindBy(css = ".icon.ion-android-checkmark")
    WebElement CheckBox2;

    public void if_else(String I_DontHaveSSC){
        //if(I_DontHaveSSC.equalsIgnoreCase())
    }


    }


