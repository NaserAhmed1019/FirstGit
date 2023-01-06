package BookStore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NegativeTestLogIn {
    WebDriver driver;
    String TestCheck;
    public String getLogInErrorMessage() {
        return null;

    }
    @BeforeClass
    void SetUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        //driver.manage().window().maximize();

        By navigate = new By.ByCssSelector(".category-cards div:nth-child(6)");
        WebElement navigateEL = driver.findElement(navigate);
        navigateEL.click();
//        Action ac = new Action(driver);
        Thread.sleep(1000);

        // navigate to LogIn.
        By NavigateLogIn = new By.ByCssSelector("#login");
        WebElement logInEL = driver.findElement(NavigateLogIn);
        logInEL.click();
        Thread.sleep(1000);
    }
//    @Test(priority = 0)
//    void LoginBookStore() throws InterruptedException {
//        // UserName
//        Thread.sleep(1000);
//        By userNameLocate = new By.ByCssSelector("#userName");
//        WebElement userNameEL = driver.findElement(userNameLocate);
//        userNameEL.sendKeys("Adamhamilton@gmail.com");
//        // Password
//        By passwordLocate = new By.ByCssSelector("#password");
//        WebElement passwordEL = driver.findElement(passwordLocate);
//        passwordEL.sendKeys("@Adam123");
//        // LogIn
//        By NavigateLogIn = new By.ByCssSelector("#login");
//        WebElement logInEL = driver.findElement(NavigateLogIn);
//        logInEL.click();
//        Thread.sleep(1000);
//
//    }
    @Test(priority = 1)
    void WrongUserName() throws InterruptedException {
        String ExpectedErrorMessage = "Invalid username or password!";
        // UserName
        Thread.sleep(1000);
        By userNameLocate = new By.ByCssSelector("#userName");
        WebElement userNameEL = driver.findElement(userNameLocate);
        userNameEL.sendKeys("Adamhamilton@gmail.com");
        // Password
        By passwordLocate = new By.ByCssSelector("#password");
        WebElement passwordEL = driver.findElement(passwordLocate);
        passwordEL.sendKeys("@Adam123");
        // LogIn
        By NavigateLogIn = new By.ByCssSelector("#login");
        WebElement logInEL = driver.findElement(NavigateLogIn);
        logInEL.click();
        Thread.sleep(1000);

       // String errorMessage=logInEL.

    }
}
