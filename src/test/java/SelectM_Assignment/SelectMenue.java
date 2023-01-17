package SelectM_Assignment;

import Pages.SelectMenuePage;
import Utils.DriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectMenue {
    WebDriver driver;

    SelectMenuePage homePage;


    @BeforeClass
    void setUp() {

        driver = DriverUtil.getWebDriver();

        homePage = new SelectMenuePage();

        driver.get(homePage.pageUrl);

    }

    @Test
    void SelectTest() throws InterruptedException {
        Thread.sleep(1000);
// Select Value.
        driver.findElement(homePage.selectValueLocator).click();
        driver.findElement(homePage.selctingGroupB_Opt1).click();
        String selectValuetext = driver.findElement(homePage.selectValueAssert).getText();
        Assert.assertEquals(selectValuetext, "Group 2, option 1");

// Select One.
        driver.findElement(homePage.selectOneLocator).click();
        driver.findElement(homePage.selectOneMs_Locator).click();
        String selectOneText = driver.findElement(homePage.selectOneAssert).getText();
        Assert.assertEquals(selectOneText, "Ms.");

// Old Select Menu.
        driver.findElement(homePage.oldSelectMenuLocator).click();
        driver.findElement(homePage.oldMenuBlueLocator).click();
        driver.findElement(homePage.oldSelectMenuLocator).click();
        //   String blue = driver.findElement(homePage.oldSelectMenuLocator).getText();
        //   System.out.println(blue);
// Multi Select Locator.
        driver.findElement(homePage.multiSelectLocator).click();
        driver.findElement(homePage.multiSelectBlackLocator).click();
        String black = driver.findElement(homePage.multiselectAssert).getText();
        driver.findElement(homePage.multiSelectExitLo).click();// needs some change
        Assert.assertEquals(black, "Black");


// Standard Multi Select.
        // driver.findElement(homePage.standardMultiSelectLocator).click();
        driver.findElement(homePage.standardMultiSelectSaab).click();
    }
@AfterClass
    void wrapUp() {
     //   driver.quit();
}
}