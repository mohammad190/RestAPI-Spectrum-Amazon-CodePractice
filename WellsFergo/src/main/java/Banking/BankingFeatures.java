package Banking;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BankingFeatures extends CommonAPI {

    @FindBy(id = "bankingTab")
    WebElement BankingTab;

    @FindBy(linkText = "Checking Accounts")
    WebElement CheckingAccount;

    @FindBy(name = "zipCodeSelector")
    WebElement ZipCode;

    @FindBy(id = "c28lastFocusable")
    WebElement Continue;

    public void BankingFeatures(String zip)throws InterruptedException{
        Actions actions = new Actions(driver);
        WebElement element = BankingTab;
        actions.moveToElement(element).perform();
        CheckingAccount.click();
        ZipCode.sendKeys(zip);
        Continue.click();
    }


}
