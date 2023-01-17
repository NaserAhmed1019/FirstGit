package SelectM_Assignment;

import Pages.SelectMenuePage;
import Utils.DriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenue {
    WebDriver driver;

    SelectMenuePage  homePage;


    @BeforeClass
    void setUp() {

        driver = DriverUtil.getWebDriver();

        homePage = new SelectMenuePage();

        driver.get(homePage.pageUrl);

    }

    @Test

    void SelectTest() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(homePage.selectValueLocator).click();
        driver.findElement(homePage.selctingGroupB_Opt1).click();
        String selectValuetext = driver.findElement(homePage.selectValueAssert).getText();
        Assert.assertEquals(selectValuetext, "Group 2, option 1");




    }
}
