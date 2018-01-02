package TestHomePage;

import HomePage.YoutubeNewTabWindowMethod;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestYoutubeNewTabwindowFeatures extends CommonAPI {

   @Test
    public void YoutubeNewTabFea() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.youtubeTVFe();
    }
    @Test
    public void YoutubeGaming() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.YouTubeGaming();
    }
    @Test
    public void YoutubeMusic() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.YouTubeMusic();
    }
    @Test
    public void YoutubeKids() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.YouTubeKids();
    }
    @Test
    public void YoutubeCreatorAcademy() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.CreatorAcademy();
    }
    @Test
    public void YoutubeForArtist() throws InterruptedException {
        YoutubeNewTabWindowMethod youtubeNewTabWindowMethod = PageFactory.initElements(driver,YoutubeNewTabWindowMethod.class);
        youtubeNewTabWindowMethod.YouTubeforArtists();
    }
}
