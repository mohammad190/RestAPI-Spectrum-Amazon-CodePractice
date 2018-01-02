package Menu;

import base.CommonAPI;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Banking extends CommonAPI {

    @FindBy(className = "first")           //.//a[@style='width:122px']
    WebElement ClickBankingBTN;

    @FindBy(xpath = ".//a[@name='cds']")
    WebElement ClickCDS;

    @FindBy(id = "zipCodeModalInputField")
    WebElement zipCode;

    @FindBy(id = "go-button-zip-modal")
    WebElement goBTN;

    @FindBy(id = "open-now-featured-cd")
    WebElement clickOpenNow;

    @FindBy(id = "go-to-application-mediumup")
    WebElement goToApplication;

    @FindBy(xpath = ".//input[@name='zz_name_tb_fnm']")
    WebElement First_Name_Box;

    public void menuFeaturesBank( String zip, String firstName) throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement element = ClickBankingBTN;
        actions.moveToElement(element).perform();

        ClickCDS.click();
        Thread.sleep(3000);

        zipCode.sendKeys(zip);
        Thread.sleep(3000);

        goBTN.click();
        Thread.sleep(3000);

        clickOpenNow.click();

        goToApplication.click();
        Thread.sleep(3000);

        First_Name_Box.sendKeys(firstName);

        test.log(LogStatus.INFO,"Execute the code");


    }
}
