package Way2Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaAlert {

    WebDriver driver;

    @BeforeClass
    void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
    }


    @Test
void ClickButton() throws InterruptedException {
        By ClickButton = new By.ByCssSelector("#alertButton");
        WebElement clickMeElement = driver.findElement(ClickButton);
        clickMeElement.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

  //  @AfterClass

}
