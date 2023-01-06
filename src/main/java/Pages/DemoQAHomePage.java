package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAHomePage {
    WebDriver driver;


    public String url = "https://demoqa.com/";

    public By bookStore = new By.ByCssSelector(".category-cards div:nth-child(6)");



}
//    By bookStoreLocate = new By.ByCssSelector(".category-cards div:nth-child(6)");
//    public WebElement bookStoreEL = driver.findElement(new By.ByCssSelector(".category-cards div:nth-child(6)"));
