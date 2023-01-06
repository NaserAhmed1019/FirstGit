package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubeHomePage {
    WebDriver driver;

    public String url = "https://www.youtube.com/";

    public By youtubeSearchLocator = new By.ByCssSelector("#search-input #search");
    public By searchbuttonLocator = new By.ByCssSelector("#search-icon-legacy .ytd-searchbox:first-child");

}
