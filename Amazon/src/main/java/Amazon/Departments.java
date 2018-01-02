package Amazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Departments extends CommonAPI {
    @FindBy(id = "nav-link-shopall")
    WebElement Departments;

    @FindBy(xpath = ".//span[@aria-label='Amazon Video']")
    WebElement AmazonVideo;

    @FindBy(xpath = ".//span[@aria-label='Amazon Music']")
    WebElement AmazonMusic;

    @FindBy(xpath = ".//span[@aria-label='Appstore for Android']")
    WebElement AppstoreForAndroid;

    @FindBy(xpath = ".//span[@aria-label='Echo & Alexa']")
    WebElement EchoAndAexa;

    @FindBy(xpath = ".//span[@aria-label='Fire Tablets']")
    WebElement FireTablets;

    @FindBy(xpath = ".//span[@aria-label='Fire TV']")
    WebElement FireTV;

    @FindBy(xpath = ".//span[@aria-label='Kindle E-readers & Books']")
    WebElement KindleEReadersAndBooks;

    @FindBy(xpath = ".//span[@aria-label='AmazonFresh']")
    WebElement AmazonFresh;

    @FindBy(xpath = ".//span[@aria-label='Books & Audible']")
    WebElement BooksAndAudible;

    @FindBy(xpath = ".//span[@aria-label='Movies, Music & Games']")
    WebElement MoviesMusicAndGames;

    @FindBy(xpath = ".//span[@aria-label='Electronics, Computers & Office']")
    WebElement ElectronicsComputerAndOffice;

    @FindBy(xpath = ".//span[@aria-label='Home, Garden & Tools']")
    WebElement HomeGardenAndTools;

    @FindBy(xpath = ".//span[@aria-label='Restaurants, Food & Grocery']")
    WebElement RestruantFoodGrocery;

    @FindBy(xpath = ".//span[@aria-label='Beauty & Health']")
    WebElement BeautyAndHealth;

    @FindBy(xpath = ".//span[@aria-label='Toys, Kids & Baby']")
    WebElement ToyKidsAndBaby;

    @FindBy(xpath = ".//span[@aria-label='Clothing, Shoes & Jewelry']")
    WebElement ClothingShoesAndJewelry;

    @FindBy(xpath = ".//span[@aria-label='Handmade']")
    WebElement HandMade;

    @FindBy(xpath = ".//span[@aria-label='Sports & Outdoors']")
    WebElement SportsAndOutdoors;

    @FindBy(xpath = ".//span[@aria-label='Automotive & Industrial']")
    WebElement AutomotiveAndIndustries;

    @FindBy(xpath = ".//span[@aria-label='Home Services']")
    WebElement HomeService;

    @FindBy(xpath = ".//span[@aria-label='Credit & Payment Products']")
    WebElement CreditPaymentProduct;



    //This is mouse hover method
    public void DepartmentsFeatures() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement element = Departments;
        Thread.sleep(3000);
        action.moveToElement(element).perform();

        AmazonVideo.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        AmazonMusic.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        AppstoreForAndroid.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        EchoAndAexa.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        FireTablets.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        FireTV.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        KindleEReadersAndBooks.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        AmazonFresh.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        BooksAndAudible.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        MoviesMusicAndGames.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        ElectronicsComputerAndOffice.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        HomeGardenAndTools.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        RestruantFoodGrocery.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        BeautyAndHealth.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        ToyKidsAndBaby.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        ClothingShoesAndJewelry.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        HandMade.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        SportsAndOutdoors.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        AutomotiveAndIndustries.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        HomeService.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);

        CreditPaymentProduct.click();
        driver.navigate().forward();
        action.moveToElement(element).perform();
        Thread.sleep(3000);
    }
}
