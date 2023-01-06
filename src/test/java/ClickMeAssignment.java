import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ClickMeAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        // Click on Elements.
        By firstElement = new By.ByCssSelector(".card-up");
        WebElement element = driver.findElement(firstElement);
        element.click();

        //     check if the logo is Elements
        By headerLocator = new By.ByCssSelector(".main-header");
        WebElement header = driver.findElement(headerLocator);
        String headerText = header.getText();

        Assert.assertEquals(headerText, "Elements");

        By fourthButton = new By.ByCssSelector("#item-4");
        WebElement button = driver.findElement(fourthButton);
        button.click();

       // Checking if the test went well
        header = driver.findElement(headerLocator);
        headerText = header.getText();
        Assert.assertEquals(headerText, "Buttons");

        By firstClick = new By.ByCssSelector("div .mt-4:nth-child(3) button");
        WebElement clickMe = driver.findElement(firstClick);
        clickMe.click();


        By clickCheck = new By.ByCssSelector("#dynamicClickMessage");
         header = driver.findElement(clickCheck);
         headerText = header.getText();

        Assert.assertEquals(headerText, "You have done a dynamic click");

        driver.quit();

    }
}
