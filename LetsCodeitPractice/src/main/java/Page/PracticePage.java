package Page;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class PracticePage extends CommonAPI {

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath = ".//div[@id='radio-btn-example']//label/input")
    List<WebElement> radioBtn;

    @FindBy(xpath = ".//select[@id='carselect']")
    WebElement SelectCarExample;

    @FindBy(xpath = ".//select[@id='multiple-select-example']")
    WebElement FruitSelect;

    @FindBy(xpath = ".//div[@id='checkbox-example']//label/input")
    List<WebElement> CarList;

    @FindBy(xpath = ".//button[@id='openwindow']")
    WebElement OpenNewWindow;

    @FindBy(xpath = ".//input[@id='search-courses']")
    WebElement searchBar;

    @FindBy(xpath = ".//a[@id='opentab']")
    WebElement openTabBtn;

    @FindBy(xpath = ".//input[@id='name']")
    WebElement alertNameBar;

    @FindBy(xpath = ".//input[@id='alertbtn']")
    WebElement alertBtn;

    @FindBy(xpath = ".//input[@id='confirmbtn']")
    WebElement confirmBtn;

    @FindBy(xpath = ".//input[@id='hide-textbox']")
    WebElement hideBtn;

    @FindBy(id = "show-textbox")
    WebElement showBtn;

    @FindBy(xpath = ".//input[@id='displayed-text']")
    WebElement displayTextBar;


    public void RadioButton() throws InterruptedException {
        for(WebElement element : radioBtn){
            element.click();
            Thread.sleep(2000);
        }
    }
    public void SelectCar() throws InterruptedException {
        Select select = new Select(SelectCarExample); // dropDownMethod
        for(int i=0; i<3; i++){
            select.selectByIndex(i);
            Thread.sleep(2000);
        }
    }
    public void SelectFruit() throws InterruptedException {
        Select select = new Select(FruitSelect); //drop downMethod
        for(int i = 0; i<3; i++){
            select.selectByIndex(i);
            Thread.sleep(2000);
        }

    }
    public void CarFeatures() throws InterruptedException {
        for( WebElement element: CarList){
            element.click();
            Thread.sleep(5000);
        }
    }
    public void NewWindow() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        OpenNewWindow.click();

        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles){
            if(!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
                searchBar.sendKeys("Java");
                Thread.sleep(200);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(parentWindow);
    }
    public void openTab() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        openTabBtn.click();

        Set<String> handles = driver.getWindowHandles();

        for(String handle : handles){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                searchBar.sendKeys("java");
                Thread.sleep(2000);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(parentHandle);
    }

    //How to handle Displayed/Undisplayed Elements
    public void handleDisplayedElem() throws InterruptedException {
        Thread.sleep(4000);
        if(displayTextBar.isDisplayed()){
            jse.executeScript("window.scrollBy(0, 500);");
            hideBtn.click();
            Thread.sleep(4000);
            showBtn.click();
            displayTextBar.sendKeys("Hello");
            hideBtn.click();
        }else if(!displayTextBar.isDisplayed()){
            jse.executeScript("window.scrollBy(0, 500);");
            showBtn.click();
            displayTextBar.sendKeys("Hi");
            Thread.sleep(4000);
            hideBtn.click();
        }
    }

    //How to handle alerts
    public void okAlert() throws InterruptedException {
        alertNameBar.sendKeys("Mohammad");
        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }

    public void cancelAlert() throws InterruptedException {
        alertNameBar.sendKeys("Mohammad");
        confirmBtn.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
