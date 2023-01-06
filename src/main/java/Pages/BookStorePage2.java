package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStorePage2 {
    WebDriver driver;
    public String url = "https://demoqa.com/";

    public By BookStorAppEl = new By.ByCssSelector(".category-cards div:nth-child(6)");

}

