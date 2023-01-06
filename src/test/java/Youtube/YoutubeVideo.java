package Youtube;

import Pages.QuranRecitionByMMenk;
import Pages.YoutubeHomePage;
import Utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YoutubeVideo {
    WebDriver driver;
    YoutubeHomePage youtubeHomePage;
    QuranRecitionByMMenk quranRecitionByMMenk;

    @BeforeClass
    void setUp() {
        driver = DriverUtil.getWebDriver();
        youtubeHomePage = new YoutubeHomePage();
        quranRecitionByMMenk = new QuranRecitionByMMenk();
        driver.get(youtubeHomePage.url);


    }
    @Test
    void Youtube() {
        driver.findElement(youtubeHomePage.youtubeSearchLocator).sendKeys("quran recitation by mufti ismail menk");
        driver.findElement(youtubeHomePage.searchbuttonLocator).click();
        driver.findElement(quranRecitionByMMenk.muftiMenkVideoLocator).click();

    }

}
