package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class YoutubeNewTabWindowMethod extends CommonAPI {


    @FindBy(xpath = ".//button[@aria-label='YouTube apps']")
    WebElement YoytubeApps;

    @FindBy(linkText = "YouTube TV")
    WebElement YoutubeTV;

    @FindBy(linkText = "YouTube Gaming")
    WebElement YouTubeGaming;

    @FindBy(linkText = "YouTube Music")
    WebElement YouTubeMusic;

    @FindBy(linkText = "YouTube Kids")
    WebElement YouTubeKids;

    @FindBy(linkText = "Creator Academy")
    WebElement CreatorAcademy;

    @FindBy(linkText = "YouTube for Artists")
    WebElement YouTubeforArtists;


    public void youtubeTVFe() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        YoutubeTV.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
    public void YouTubeGaming() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        YouTubeGaming.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
    public void YouTubeMusic() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        YouTubeMusic.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
    public void YouTubeKids() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        YouTubeKids.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
    public void CreatorAcademy() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        CreatorAcademy.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
    public void YouTubeforArtists() throws InterruptedException {

        YoytubeApps.click();
        String parentHandle = driver.getWindowHandle();
        YouTubeforArtists.click();
        Set<String> Handles = driver.getWindowHandles();
        for(String handle : Handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }driver.switchTo().window(parentHandle);
    }
}

