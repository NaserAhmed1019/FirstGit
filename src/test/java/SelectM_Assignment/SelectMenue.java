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


        driver.findElement(homePage.selectOneLocator).click();
        driver.findElement(homePage.selectOneMs_Locator).click();
        String selectOneText = driver.findElement(homePage.selectOneAssert).getText();
        Assert.assertEquals(selectOneText, "Ms.");


        driver.findElement(homePage.oldSelectMenuLocator).click();
        driver.findElement(homePage.oldMenuBlueLocator).click();
        driver.findElement(homePage.oldSelectMenuLocator).click();
     //   String blue = driver.findElement(homePage.oldSelectMenuLocator).getText();
     //   System.out.println(blue);

        driver.findElement(homePage.multiSelectLocator).click();
        driver.findElement(homePage.multiSelectBlackLocator).click();
        String black= driver.findElement(homePage.multiselectAssert).getText();
        Assert.assertEquals(black,"Black");
        driver.findElement(homePage.multiSelectLocator).click();// needs some change

        driver.findElement(homePage.standardMultiSelectLocator).click();
        driver.findElement(homePage.standardMultiSelectSaab).click();
    }
}
