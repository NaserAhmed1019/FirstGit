import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoQAtest {
    //declare and initialize
    WebDriver driver;
    WebElement header;
    By headerLocator;
    String headerText;

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

    }


    @Test
    void testingElement() {
        By firstElement = new By.ByCssSelector(".card:first-child");
        WebElement element = driver.findElement(firstElement);
        element.click();


        //     check if the logo is Elements
        By headerLocator = new By.ByCssSelector(".main-header");
        WebElement header = driver.findElement(headerLocator);
        String headerText = header.getText();
        Assert.assertEquals(headerText, "Elements");
    }

    @Test
    void testingForm() {
        //    click on form
        By formsLocate = new By.ByCssSelector(".card:nth-child(2)");
        WebElement forms = driver.findElement(formsLocate);
        forms.click();

//   check if the logo is Forms
        header = driver.findElement(headerLocator);
        headerText = header.getText();
        Assert.assertEquals(headerText, "Forms");
    }


    @AfterClass
    void quittingTest() {
      //  driver.quit();

    }
}
